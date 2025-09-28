package ParkingLot.dtos;


import ParkingLot.models.VehicleType;

public class IssueRequestDto
{
    private int parkingLotId;
    private String licensePlate;
    private VehicleType vehicleType;
    private int entryGateId;
    private int operatorId;

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getEntryGateId() {
        return entryGateId;
    }

    public void setEntryGateId(int entryGateId) {
        this.entryGateId = entryGateId;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }
}
