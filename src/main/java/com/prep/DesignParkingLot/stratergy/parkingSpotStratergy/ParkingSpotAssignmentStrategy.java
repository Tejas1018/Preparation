package com.prep.DesignParkingLot.stratergy;

import com.prep.DesignParkingLot.models.ParkingSpot;
import com.prep.DesignParkingLot.models.vehicle;

public interface ParkingSpotAssignmentStrategy {

    ParkingSpot assignParkingSpot(vehicle vehicle);
}
