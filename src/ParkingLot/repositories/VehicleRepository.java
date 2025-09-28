package ParkingLot.repositories;

import ParkingLot.models.Vehicle;
import ParkingLot.models.VehicleType;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository
{
    Map<String, Vehicle> vehicles;
    private static int counter;
    public VehicleRepository()
    {
        vehicles = new HashMap<>();
        counter = 1;
    }

    public Optional<Vehicle> findByLicensePlate(String licensePlate)
    {
        return Optional.ofNullable(vehicles.get(licensePlate));
    }

    public Vehicle save(String licensePlate, VehicleType vehicleType)
    {
        Vehicle vehicle = new Vehicle();
        vehicle.setId(counter++);
        vehicle.setLicensePlate(licensePlate);
        vehicle.setVehicleType(vehicleType);
        vehicles.put(licensePlate, vehicle);
        return vehicle;
    }
}
