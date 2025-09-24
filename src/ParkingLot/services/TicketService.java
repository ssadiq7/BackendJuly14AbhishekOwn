package ParkingLot.services;

import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;

import java.util.Optional;

public class TicketService implements ITicketService
{
    private final GateRepository gateRepository;
    private final VehicleRepository vehicleRepository;
    private final ParkingLotRepository parkingLotRepository;
    private final TicketRepository ticketRepository;
    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository)
    {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket issueTicket(int parkingLotId, String licensePlate, VehicleType vehicleType,
                              int entryGateId, int operatorId)
    {
        // 1. Obtain the Gate from gate Id
        Optional<Gate> gateOptional = gateRepository.findById(entryGateId);
        if(gateOptional.isEmpty())
        {
            throw new IllegalArgumentException("Invalid gate id");
        }

        Gate gate = gateOptional.get();
        gate.getOperator().setId(operatorId);

        // 2. Validate and save the vehicle
        Optional<Vehicle> vehicleOptional = vehicleRepository.findByLicensePlate(licensePlate);
        Vehicle vehicle;
        if(vehicleOptional.isEmpty())
        {
            vehicle = vehicleRepository.save(licensePlate, vehicleType);
        }else
        {
            vehicle = vehicleOptional.get();
        }

        // 3. Assign Slot
        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findById(parkingLotId);
        if(parkingLotOptional.isEmpty())
        {
            throw new IllegalArgumentException("Invalid parking lot Id");
        }

        ParkingLot parkingLot = parkingLotOptional.get();
        ParkingSlot parkingSlot = parkingLot
                .getSlotAllotmentTypeStrategy()
                .allocateSlot(vehicleType, parkingLot);

        // 4. Create and return the ticket
        Ticket ticket = new Ticket();
        ticket.setParkingSlot(parkingSlot);
        ticket.setVehicle(vehicle);
        ticket.setEntryGate(gate);
        return ticketRepository.save(ticket);
    }
}
