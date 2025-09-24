package ParkingLot.repositories;

import ParkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepository
{
    Map<Integer, ParkingLot> parkingLots;
    public ParkingLotRepository()
    {
        parkingLots = new HashMap<>();
    }

    public Optional<ParkingLot> findById(int id)
    {
        return Optional.ofNullable(parkingLots.get(id));
    }
}
