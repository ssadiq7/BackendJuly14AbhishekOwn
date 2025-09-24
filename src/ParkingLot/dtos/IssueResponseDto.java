package ParkingLot.dtos;

import ParkingLot.models.ParkingSlot;

public class IssueResponseDto
{
    private int ticketId;
    private ResponseStatus responseStatus;
    private String failureMessage;
    private String parkingSlotNumber;

    public String getParkingSlotNumber() {
        return parkingSlotNumber;
    }

    public void setParkingSlotNumber(String parkingSlotNumber) {
        this.parkingSlotNumber = parkingSlotNumber;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }
}
