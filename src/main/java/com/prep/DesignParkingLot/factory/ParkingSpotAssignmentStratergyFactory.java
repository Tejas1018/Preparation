package com.prep.DesignParkingLot.factory;

import com.prep.DesignParkingLot.stratergy.parkingSpotStratergy.NearestParkingSpotAssignment;
import com.prep.DesignParkingLot.stratergy.parkingSpotStratergy.NearestToExitGateParkingSpotAssignment;
import com.prep.DesignParkingLot.stratergy.parkingSpotStratergy.ParkingSpotAssignmentStrategy;
import com.prep.DesignParkingLot.stratergy.parkingSpotStratergy.ParkingSpotAssignmentStrategyType;

public class ParkingSpotAssignmentStratergyFactory {

    public static ParkingSpotAssignmentStrategy getParkingSpotAssignmentStrategy(ParkingSpotAssignmentStrategyType type) {
        if(type.equals(ParkingSpotAssignmentStrategyType.NEAREST)){
            return new NearestParkingSpotAssignment();
        }
        else if(type.equals(ParkingSpotAssignmentStrategyType.NEAREST_TO_EXIT)){
            return new NearestToExitGateParkingSpotAssignment();
        }
        return null;
    }
}
