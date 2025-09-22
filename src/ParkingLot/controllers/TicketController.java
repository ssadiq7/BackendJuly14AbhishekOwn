package ParkingLot.controllers;

import ParkingLot.dtos.IssueRequestDto;
import ParkingLot.dtos.IssueResponseDto;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Ticket;
import ParkingLot.services.TicketService;

public class TicketController
{
    private final TicketService ticketService;

    public TicketController(TicketService ticketService)
    {
        this.ticketService = ticketService;
    }
    public IssueResponseDto issueTicket(IssueRequestDto issueRequestDto)
    {
        IssueResponseDto issueResponseDto = new IssueResponseDto();

        try {
            Ticket ticket = ticketService.issueTicket(issueRequestDto.getParkingLotId(),
                    issueRequestDto.getLicensePlate(), issueRequestDto.getVehicleType(),
                    issueRequestDto.getEntryGateId(), issueRequestDto.getOperatorId());

            issueResponseDto.setTicketId(ticket.getId());
            issueResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            issueResponseDto.setResponseStatus(ResponseStatus.FAILURE);
            issueResponseDto.setFailureMessage(e.getMessage());
        }

        return issueResponseDto;
    }
}
