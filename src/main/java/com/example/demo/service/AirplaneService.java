package com.example.demo.service;

import com.example.demo.bean.Airplane;
import com.example.demo.mapper.AirplaneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneService {
    @Autowired
    private AirplaneMapper mapper;
    public List<Airplane> getAirplane(int id){
        return mapper.selectAirplane(id);
    }
}
