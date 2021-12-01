package com.example.demo.controller;


import com.example.demo.bean.Trip;
import com.example.demo.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripController {
    @Autowired
    private TripService service;

    @RequestMapping("/getTrip")
    public List<Trip> getTrip(@RequestParam("Trip_DeparturePosition") String Trip_DeparturePosition,
                              @RequestParam("Trip_ArrivalPosition") String Trip_ArrivalPosition){

        List<Trip> list = service.getTrip(Trip_DeparturePosition,Trip_ArrivalPosition);
        return list;
    }
}
