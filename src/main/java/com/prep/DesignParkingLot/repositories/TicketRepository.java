package com.prep.DesignParkingLot.repositories;

import com.prep.DesignParkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TicketRepository {
    private Map<Long, Ticket> ticketMap = new HashMap<>();
    private long currentId = 0l;
    public Ticket  saveTicket(Ticket ticket) {
        if(ticket.getId() == null){
            currentId++;
            ticket.setId(currentId);
            ticketMap.put(currentId, ticket);
        } else {
            ticketMap.put(ticket.getId(), ticket);
        }
        return ticket;
    }

    public Optional<Ticket> findTicketById(Long ticketId) {
        if(ticketMap.containsKey(ticketId)){
            return Optional.of(ticketMap.get(ticketId));
        } else {
            return Optional.empty();
        }
    }
}
