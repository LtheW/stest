package com.example.demo.controller;

import com.example.demo.bean.Ticket;
import com.example.demo.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/ticket")
public class TicketController   {

    @Autowired
    private TicketService service;
    @RequestMapping("/addData")
    public String addData(@RequestParam("Ticket_ID") int Ticket_ID,
                          @RequestParam("Passenger_ID") int Passenger_ID,
                          @RequestParam("Flight_ID") int Flight_ID,
                          @RequestParam("Seat_ID") int Seat_ID,
                          @RequestParam("Trip_ID") int Trip_ID,
                          @RequestParam("Ticket_Time") Date Ticket_Time
    ) {
        Ticket ticket=new Ticket();

        ticket.setTicket_ID(Ticket_ID);
        ticket.setPassenger_ID(Passenger_ID);
        ticket.setFlight_ID(Flight_ID);
        ticket.setFlight_ID(Seat_ID);
        ticket.setTrip_ID(Trip_ID);
        ticket.setTicket_Time(Ticket_Time);
        service.insertTicket(ticket);

        return "success";
    }
}
