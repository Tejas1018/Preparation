package com.prep.DesignParkingLot;

import com.prep.DesignParkingLot.controllers.TicketController;
import com.prep.DesignParkingLot.dto.GenerateTicketRequestDto;
import com.prep.DesignParkingLot.models.Ticket;
import com.prep.DesignParkingLot.models.VehicleType;
import com.prep.DesignParkingLot.repositories.GateRepository;
import com.prep.DesignParkingLot.repositories.TicketRepository;
import com.prep.DesignParkingLot.repositories.VehicleRepository;
import com.prep.DesignParkingLot.services.TicketService;
import com.prep.DesignParkingLot.stratergy.parkingSpotStratergy.ParkingSpotAssignmentStrategyType;

public class Client {
    public static void main(String[] args) {
        GenerateTicketRequestDto requestDto = new GenerateTicketRequestDto();
        requestDto.setGateId(1l);
        requestDto.setVehicleType(VehicleType.BIKE);
        requestDto.setOwnerName("Teja");
        requestDto.setVehicleNumber("AP 09 AB 1234");
        requestDto.setParkingSpotAssignmentStrategyType(ParkingSpotAssignmentStrategyType.NEAREST_TO_EXIT);
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketRepository ticketRepository = new TicketRepository();
        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, ticketRepository);
        TicketController ticketController = new TicketController(ticketService);
        Ticket ticket = ticketController.GenerateTicket(requestDto).getTicket();
    }
}
