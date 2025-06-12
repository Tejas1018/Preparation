package com.prep.DesignParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private status status;
    private List<parkingFloor> parkingFloors;
    private List<vehicleType> vehicleType;
    private List<Gate> gates;
    private List<ParkingSlotStatus> parkingSlotStatus;
    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }

    public List<parkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<parkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<vehicleType> getVehiclesType() {
        return vehicleType;
    }

    public void setVehiclesType(List<vehicleType> vehicleType) {
        this.vehicleType = vehicleType;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }
}
