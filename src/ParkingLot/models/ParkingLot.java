package ParkingLot.models;

import ParkingLot.strategies.SlotAllotmentTypeStrategy;

import java.util.List;

public class ParkingLot extends BaseModel
{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    private int maxCapacity;
    private List<VehicleType> vehicleTypes;
    private Status parkingLotStatus;
    private SlotAllotmentTypeStrategy slotAllotmentTypeStrategy;

    public SlotAllotmentTypeStrategy getSlotAllotmentTypeStrategy() {
        return slotAllotmentTypeStrategy;
    }

    public void setSlotAllotmentTypeStrategy(SlotAllotmentTypeStrategy slotAllotmentTypeStrategy) {
        this.slotAllotmentTypeStrategy = slotAllotmentTypeStrategy;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Status getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(Status parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public int getCapacity() {
        return maxCapacity;
    }

    public void setCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}
