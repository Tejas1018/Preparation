package com.prep.DesignParkingLot.models;

public class parkingSpot extends BaseModel{
    private String number;
    private parkingSpotStatus parkingSpotStatus;
    private vehicleType vehicleType;

    public parkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(parkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public vehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(vehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
