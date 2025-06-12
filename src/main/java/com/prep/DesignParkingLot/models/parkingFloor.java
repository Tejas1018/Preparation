package com.prep.DesignParkingLot.models;

import java.util.List;

public class parkingFloor extends BaseModel{
    private String number;
    List<parkingSpot> parkingSpot;
    List<status> status;
}
