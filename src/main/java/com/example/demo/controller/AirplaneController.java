package com.example.demo.controller;

import com.example.demo.bean.Airplane;
import com.example.demo.bean.Trip;
import com.example.demo.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/airplane")
public class AirplaneController {
    @Autowired
    private AirplaneService service;

    @RequestMapping("/getAirplane")
    public List<Airplane> getAirplane(@RequestParam("Flight_ID") int Flight_ID){

        List<Airplane> list = service.getAirplane(Flight_ID);
        return list;
    }
}
