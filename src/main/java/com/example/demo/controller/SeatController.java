package com.example.demo.controller;

import com.example.demo.bean.Passenger;
import com.example.demo.bean.Seat;
import com.example.demo.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seat")
public class SeatController {
    @Autowired
    private SeatService service;

    @RequestMapping("/addData")
    public String addData(@RequestParam("Seat_ID") int Seat_ID,
                          @RequestParam("Seat_Row") String Seat_Row,
                          @RequestParam("Seat_Number") int Seat_Number,
                          @RequestParam("Seat_Type") String Seat_Type,
                          @RequestParam("Seat_State") int Seat_State,
                          @RequestParam("Flight_ID") int Flight_ID
    ) {
        Seat seat = new Seat();

        seat.setSeat_ID(Seat_ID);
        seat.setSeat_Row(Seat_Row);
        seat.setSeat_Number(Seat_Number);
        seat.setSeat_Type(Seat_Type);
        seat.setSeat_State(Seat_State);
        seat.setFlight_ID(Flight_ID);
        service.insertSeat(seat);

        return "success";
    }
}
