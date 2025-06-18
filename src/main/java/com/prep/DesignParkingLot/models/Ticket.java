package com.prep.DesignParkingLot.models;

import java.util.Date;

public class Ticket extends BaseModel{
    private String ticketNumber;
    private String vehicleNumber;
    private Date date;
    private Gate gate;
    private vehicle vehicle;
    private parkingSpot parkingSpot;


    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public parkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(parkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }


}
