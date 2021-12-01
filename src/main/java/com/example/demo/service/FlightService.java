package com.example.demo.service;

import com.example.demo.bean.Flight;
import com.example.demo.mapper.FlightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightMapper mapper;

    public List<Flight> selectFlight(String DP,String AP){
        return mapper.selectFlight(DP,AP);
    }
}
