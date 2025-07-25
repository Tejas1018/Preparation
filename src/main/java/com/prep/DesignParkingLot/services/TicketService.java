package com.prep.DesignParkingLot.services;

import com.prep.DesignParkingLot.exceptions.GateNotFoundException;
import com.prep.DesignParkingLot.factory.ParkingSpotAssignmentStratergyFactory;
import com.prep.DesignParkingLot.models.*;
import com.prep.DesignParkingLot.repositories.GateRepository;
import com.prep.DesignParkingLot.repositories.TicketRepository;
import com.prep.DesignParkingLot.repositories.VehicleRepository;
import com.prep.DesignParkingLot.stratergy.parkingSpotStratergy.ParkingSpotAssignmentStrategy;
import com.prep.DesignParkingLot.stratergy.parkingSpotStratergy.ParkingSpotAssignmentStrategyType;

import java.util.Optional;

public class TicketService {
    // This class will handle ticket-related operations such as generating tickets,
    // validating tickets, and processing payments.
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository; // Assuming you have a VehicleRepository to check vehicle presence
    private TicketRepository ticketRepository;
    public TicketService(GateRepository gateRepository,VehicleRepository vehicleRepository,TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
    }

    // Method to generate a new ticket
    public Ticket generateTicket(Long gateId, String vehicleNumber, String ownerName, VehicleType vehicleType,
                                 ParkingSpotAssignmentStrategyType parkingSpotAssignmentStrategyType) {

        // Logic to generate a new ticket
        /*
            1. Get the Gate object with gateId
            2. If gate is null...thrown exception
            3. check If the vehcile is already present in the parking lot
            4. If yes, good, return the existing ticket
            5. If no, store the vehicle details in the DB and
                then get the parking spot using the parkingSpotAssignmentStrategy
            6. Create a new ticket with the vehicle details, parking spot, and entry time
        */
        Optional<Gate> optionalGate = gateRepository.findByGateId(gateId);
        if(optionalGate.isEmpty()){
            //Throw an exception
            throw new GateNotFoundException("Gate with ID " + gateId + " not found.");
        }
        Gate gate = optionalGate.get();

        Optional<Vehicle> optionalVehicle = vehicleRepository.findByVehicleNumber(vehicleNumber);

        Vehicle vehicle = null;
        //If the vehicle is not present in the parking lot , store the vehicle details in the DB
        if(optionalVehicle.isEmpty()){
            vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setOwnerName(ownerName);
            vehicle = vehicleRepository.save(vehicle);
        }
        else{
            vehicle = optionalVehicle.get();
        }
        //Assign a parking spot using the parkingSpotAssignmentStrategyFactory
        //Factory Method Pattern to get the parking spot assignment strategy without using the concrete class
       ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy = ParkingSpotAssignmentStratergyFactory
                                .getParkingSpotAssignmentStrategy(parkingSpotAssignmentStrategyType);

        ParkingSpot parkingSpot = null;
        if(parkingSpotAssignmentStrategy != null){
            parkingSpot = parkingSpotAssignmentStrategy.assignParkingSpot(vehicle);
        }
        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(parkingSpot);
        ticket.setGate(gate);
        ticket.setGateType(gate.getGateType());
        ticket.setEntryTime(new java.util.Date());
        ticket.setOperator(gate.getOperator());
        ticket.setReferenceId(gate.getId().intValue() + vehicle.getId().intValue());
        //save the ticket in the DB
        return  ticketRepository.saveTicket(ticket);
    }
}
