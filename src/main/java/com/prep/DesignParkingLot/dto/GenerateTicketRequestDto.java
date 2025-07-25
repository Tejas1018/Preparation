package com.prep.DesignParkingLot.dto;

import com.prep.DesignParkingLot.models.VehicleType;
import com.prep.DesignParkingLot.stratergy.parkingSpotStratergy.ParkingSpotAssignmentStrategy;
import com.prep.DesignParkingLot.stratergy.parkingSpotStratergy.ParkingSpotAssignmentStrategyType;

import java.util.Date;

public class GenerateTicketRequestDto {
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String ownerName;
    private Date entryTime;
    private Long gateId;
    private ParkingSpotAssignmentStrategyType parkingSpotAssignmentStrategyType;

    public ParkingSpotAssignmentStrategyType getParkingSpotAssignmentStrategyType() {
        return parkingSpotAssignmentStrategyType;
    }

    public void setParkingSpotAssignmentStrategyType(ParkingSpotAssignmentStrategyType parkingSpotAssignmentStrategyType) {
        this.parkingSpotAssignmentStrategyType = parkingSpotAssignmentStrategyType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
