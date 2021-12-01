package com.example.demo.service;

import com.example.demo.bean.Passenger;
import com.example.demo.bean.Seat;
import com.example.demo.mapper.SeatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    private SeatMapper mapper;

    public void insertSeat(Seat seat) {
        mapper.insertSeat(seat.getSeat_ID(), seat.getSeat_Row(),
                seat.getSeat_Number(),seat.getSeat_Type(),seat.getSeat_State(),seat.getFlight_ID());
    }
}
