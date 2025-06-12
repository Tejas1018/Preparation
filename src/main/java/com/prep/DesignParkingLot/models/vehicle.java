package com.prep.DesignParkingLot.models;

public class vehicle extends BaseModel{
    private String vehicleNumber;
    private vehicleType vehicleType;
    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public vehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(vehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
