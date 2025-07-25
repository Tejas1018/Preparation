package com.prep.DesignParkingLot.controllers;

import com.prep.DesignParkingLot.dto.GenerateTicketRequestDto;
import com.prep.DesignParkingLot.dto.GenerateTicketResponseDto;
import com.prep.DesignParkingLot.dto.responseStatus;
import com.prep.DesignParkingLot.models.Ticket;
import com.prep.DesignParkingLot.repositories.GateRepository;
import com.prep.DesignParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    // This class will handle ticket-related operations such as issuing tickets,
    // processing payments, and managing ticket statuses.

    public GenerateTicketResponseDto GenerateTicket(GenerateTicketRequestDto requestDto){
        Ticket ticket = ticketService.generateTicket(requestDto.getGateId(),requestDto.getVehicleNumber(),
                                    requestDto.getOwnerName(),requestDto.getVehicleType(),requestDto.getParkingSpotAssignmentStrategyType());
        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        responseDto.setTicket(ticket);
        responseDto.setStatus(responseStatus.SUCCESS);
        return responseDto;
    }
}
