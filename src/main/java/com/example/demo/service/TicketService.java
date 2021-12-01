package com.example.demo.service;

import com.example.demo.bean.Passenger;
import com.example.demo.bean.Ticket;
import com.example.demo.mapper.TicketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    private TicketMapper mapper;

    public void insertTicket(Ticket ticket) {
        mapper.insertTicket(ticket.getTicket_ID(), ticket.getPassenger_ID(),
                ticket.getFlight_ID(),ticket.getSeat_ID(),ticket.getTrip_ID(),ticket.getTicket_Time());
    }
}
