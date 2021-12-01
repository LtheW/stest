package com.example.demo.controller;

import com.example.demo.bean.Passenger;
import com.example.demo.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/passenger")
@CrossOrigin
public class PassengerController {
    @Autowired
    private PassengerService service;

    @RequestMapping("/getAll")
    public List<Passenger> getAllPassenger(){

        List<Passenger> list = service.getAllPassenger();
        int num = list.size();
        if(null!=list && num>4){
            for (int i = 0; i < num-4; i++) {
                list.remove(0);
            }
        }
        return list;
    }

    @RequestMapping("/addData")
    public String addData(@RequestParam("Passenger_ID") int Passenger_ID,
                          @RequestParam("Passenger_Name") String Passenger_Name,
                          @RequestParam("Passenger_Sex") String Passenger_Sex,
                          @RequestParam("Passenger_Telephone") String Passenger_Telephone,
                          @RequestParam("Passenger_PassportNumber") String Passenger_PassportNumber
                          ) {
        Passenger passenger = new Passenger();

        passenger.setPassenger_ID(Passenger_ID);
        passenger.setPassenger_Name(Passenger_Name);
        passenger.setPassenger_Sex(Passenger_Sex);
        passenger.setPassenger_Telephone(Passenger_Telephone);
        passenger.setPassenger_PassportNumber(Passenger_PassportNumber);
        service.insertPassenger(passenger);

        return "success";
    }
}
