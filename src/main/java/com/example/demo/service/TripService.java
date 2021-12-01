package com.example.demo.service;
import com.example.demo.bean.Trip;
import com.example.demo.mapper.TripMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TripService {
    @Autowired
    private TripMapper mapper;

    public List<Trip> getTrip(String DP,String AP){
       return mapper.selectTrip(DP,AP);
    }
}
