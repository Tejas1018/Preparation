package com.prep.DesignParkingLot.dto;

import com.prep.DesignParkingLot.models.Ticket;
import com.prep.DesignParkingLot.models.VehicleType;

import java.util.Date;

public class GenerateTicketResponseDto {
    private Ticket ticket;
    private responseStatus status;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public responseStatus getStatus() {
        return status;
    }

    public void setStatus(responseStatus status) {
        this.status = status;
    }
}
