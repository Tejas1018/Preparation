package com.prep.DesignParkingLot.models;

public class ParkingSpot extends BaseModel {
    private int parkingSpotNumber;
    private status spotStatus;

    public int getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(int parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public status getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(status spotStatus) {
        this.spotStatus = spotStatus;
    }
}
