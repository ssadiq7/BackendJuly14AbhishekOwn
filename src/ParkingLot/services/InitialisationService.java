


package ParkingLot.services;

import ParkingLot.models.*;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.strategies.NearestAllocation;

import java.util.ArrayList;

public class InitialisationService {

    private final ParkingLotRepository parkingLotRepository;

    public InitialisationService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot initialise() {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(1);
        parkingLot.setParkingLotStatus(Status.AVAILABLE);
        parkingLot.setParkingFloors(new ArrayList<>());
        parkingLot.setEntryGates(new ArrayList<>()); // Initialise the list of gates
        parkingLot.setExitGates(new ArrayList<>());

        // Create a Gate
        Gate entryGate = new Gate(1, "1", GateType.ENTRY, GateStatus.ACTIVE, new Operator());
        parkingLot.getEntryGates().add(entryGate);// Add the gate to the parking lot

        for (int i = 0; i < 3; i++) {
            ParkingFloor floor = new ParkingFloor();
            floor.setId(i);
            floor.setNumber(String.valueOf(i));
            floor.setParkingSlots(new ArrayList<>());
            floor.setParkingFloorStatus(Status.AVAILABLE);

            for (int j = 0; j < 10; j++) {
                ParkingSlot slot = new ParkingSlot();
                slot.setId(j);
                slot.setNumber(String.valueOf((i * 10) + j));
                if (j % 4 == 0) {
                    slot.setVehicleType(VehicleType.TWO_WHEELER);
                } else if (j % 4 == 1) {
                    slot.setVehicleType(VehicleType.FOUR_WHEELER);
                } else if (j % 4 == 2){
                    slot.setVehicleType(VehicleType.EV);
                } else {
                    slot.setVehicleType(VehicleType.HEAVY);
                }
                slot.setParkingSlotStatus(Status.AVAILABLE);
                floor.getParkingSlots().add(slot);
            }
            parkingLot.getParkingFloors().add(floor);
        }
        parkingLot.setSlotAllotmentTypeStrategy(new NearestAllocation());
        return parkingLotRepository.save(parkingLot);
    }
}

