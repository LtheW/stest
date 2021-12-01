package com.example.demo.controller;

import com.example.demo.bean.Flight;
import com.example.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    private FlightService service;

    @RequestMapping("/selectFlight")
    public List<Flight> selectFlight(@RequestParam("Trip_DeparturePosition") String Trip_DeparturePosition,
                                     @RequestParam("Trip_ArrivalPosition") String Trip_ArrivalPosition){

        List<Flight> list = service.selectFlight(Trip_DeparturePosition,Trip_ArrivalPosition);
        return list;
    }
}
