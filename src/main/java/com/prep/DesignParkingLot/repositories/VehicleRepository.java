package com.prep.DesignParkingLot.repositories;

import com.prep.DesignParkingLot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    private Map<Long, Vehicle> vehicleMap = new HashMap<>();
    private Long vehicleId = 0L;

    public Vehicle save(Vehicle vehicle) {
            if(vehicle.getId() == null) {
                vehicleId++;
                vehicleMap.put(vehicleId, vehicle);
            }
            else {
                vehicleMap.put(vehicle.getId(), vehicle);
            }
            return vehicle;
    }

    public Optional<Vehicle> findByVehicleNumber(String vehicleNumber) {
        for(Vehicle vehicle : vehicleMap.values()){
            if(vehicle.getVehicleNumber().equals(vehicleNumber)) {
                return Optional.of(vehicle);
            }
        }
        return Optional.empty();
    }
}
