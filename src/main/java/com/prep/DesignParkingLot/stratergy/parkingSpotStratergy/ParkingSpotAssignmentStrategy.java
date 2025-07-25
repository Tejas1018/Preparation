package com.prep.DesignParkingLot.stratergy.parkingSpotStratergy;

import com.prep.DesignParkingLot.models.ParkingSpot;
import com.prep.DesignParkingLot.models.Vehicle;

public interface ParkingSpotAssignmentStrategy {

    ParkingSpot assignParkingSpot(Vehicle vehicle);
}
