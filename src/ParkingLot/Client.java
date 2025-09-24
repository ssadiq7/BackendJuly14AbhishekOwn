package ParkingLot;

import ParkingLot.controllers.TicketController;
import ParkingLot.dtos.IssueRequestDto;
import ParkingLot.dtos.IssueResponseDto;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Ticket;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.ITicketService;
import ParkingLot.services.TicketService;

public class Client
{
    public static void main(String[] args)
    {
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();

        ITicketService ticketService = new TicketService(gateRepository, vehicleRepository,
                parkingLotRepository, ticketRepository);

        TicketController ticketController = new TicketController(ticketService);
        IssueRequestDto issueRequestDto = new IssueRequestDto();
        issueRequestDto.setLicensePlate("TG 07 5050");
        issueRequestDto.setParkingLotId(1);
        issueRequestDto.setOperatorId(1);
        issueRequestDto.setEntryGateId(1);
        issueRequestDto.setVehicleType(VehicleType.HEAVY);

        IssueResponseDto issueResponseDto =
                ticketController.issueTicket(issueRequestDto);

        if (issueResponseDto.getResponseStatus().equals(ResponseStatus.FAILURE))
        {
            System.out.println("Ticket generation Failed!");
            System.out.println(issueResponseDto.getFailureMessage());
        }else
        {
        System.out.println("Ticket generated! Slot: " + issueResponseDto.getParkingSlot());
        }
    }
}
