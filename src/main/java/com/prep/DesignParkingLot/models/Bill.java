package com.prep.DesignParkingLot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private int billId;
    private double amount;
    private String vehicleNumber;
    private String parkingSpotNumber;
    private Date exitTime;
    private List<Payment> payments;
}
