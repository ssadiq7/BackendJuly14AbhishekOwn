package ParkingLot.services;

import ParkingLot.models.Ticket;
import ParkingLot.models.VehicleType;

public interface ITicketService
{
    Ticket issueTicket(int parkingLotId, String licensePlate, VehicleType vehicleType,
                       int entryGateId, int operatorId);
}
