package ParkingLot.strategies;

import ParkingLot.models.*;

public class NearestAllocation implements SlotAllotmentTypeStrategy
{
    @Override
    public ParkingSlot allocateSlot(VehicleType vehicleType, ParkingLot parkingLot)
    {
        for (ParkingFloor floor : parkingLot.getParkingFloors())
        {
            for (ParkingSlot slot : floor.getParkingSlots())
            {
                if(slot.getVehicleType().equals(vehicleType)
                && slot.getParkingSlotStatus().equals(Status.AVAILABLE))
                {
                    slot.setParkingSlotStatus(Status.FULL);
                    return slot;
                }
            }
        }
        return null;
    }
}
