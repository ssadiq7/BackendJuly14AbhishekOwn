package ParkingLot.repositories;

import ParkingLot.models.Gate;
import ParkingLot.models.GateStatus;
import ParkingLot.models.GateType;
import ParkingLot.models.Operator;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository
{
    Map<Integer, Gate> gates;
    public GateRepository()
    {
        gates = new TreeMap<>();
        Gate gate = new Gate(1, "1", GateType.ENTRY, GateStatus.ACTIVE, new Operator());
        gates.put(1, gate);
    }

    public Optional<Gate> findById(int id)
    {
        return Optional.ofNullable(gates.get(id));
    }
}
