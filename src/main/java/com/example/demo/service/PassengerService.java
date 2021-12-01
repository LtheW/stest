package com.example.demo.service;

import com.example.demo.bean.Passenger;
import com.example.demo.mapper.PassengerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {
    @Autowired
    private PassengerMapper mapper;
    public List<Passenger> getAllPassenger(){
        List<Passenger> list = new ArrayList<Passenger>();
        list = mapper.selectAll();
        return list;
    }
    public void insertPassenger(Passenger passenger) {
        mapper.insertPassenger(passenger.getPassenger_ID(), passenger.getPassenger_Name(),
                passenger.getPassenger_Sex(),passenger.getPassenger_Telephone(),passenger.getPassenger_PassportNumber());
    }
}
