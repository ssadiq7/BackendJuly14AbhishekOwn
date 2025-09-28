package ParkingLot.strategies;

import ParkingLot.models.ParkingLot;
import ParkingLot.models.ParkingSlot;
import ParkingLot.models.VehicleType;

public interface SlotAllotmentTypeStrategy
{
    ParkingSlot allocateSlot(VehicleType vehicleType, ParkingLot parkingLot);
}
