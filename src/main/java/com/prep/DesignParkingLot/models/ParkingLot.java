package com.prep.DesignParkingLot.models;

import java.util.List;

public class ParkingLot  extends BaseModel {
    private List<ParkingFloor> parkingFloorList;
    private status lotStatus;
    private List<VehicleType> vehicleTypes;

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public void setParkingFloorList(List<ParkingFloor> parkingFloorList) {
        this.parkingFloorList = parkingFloorList;
    }

    public status getLotStatus() {
        return lotStatus;
    }

    public void setLotStatus(status lotStatus) {
        this.lotStatus = lotStatus;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return vehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}
