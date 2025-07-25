package com.prep.DesignParkingLot.exceptions;

public class GateNotFoundException extends RuntimeException {
    public GateNotFoundException(String message) {
        super(message);
    }
}
