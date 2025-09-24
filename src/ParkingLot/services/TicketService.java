package ParkingLot.services;

import ParkingLot.models.Gate;
import ParkingLot.models.Ticket;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;

import java.util.Optional;

public class TicketService
{
    private final GateRepository gateRepository;
    public TicketService(GateRepository gateRepository)
    {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(int parkingLotId, String licensePlate, VehicleType vehicleType,
                              int entryGateId, int operatorId)
    {
        // 1. Obtain the Gate from gate Id
        Optional<Gate> gateOptional = gateRepository.findById(parkingLotId);
        if(gateOptional.isEmpty())
        {
            throw new IllegalArgumentException("Invalid gate id");
        }

        Gate gate = gateOptional.get();
        gate.getOperator().setId(operatorId);
        // 2. Validate and save the vehicle
        // 3. Assign Slot
        // 4. Create and return the ticket
        return null;
    }
}
