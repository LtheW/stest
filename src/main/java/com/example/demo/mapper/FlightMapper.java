package com.example.demo.mapper;

import com.example.demo.bean.Flight;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FlightMapper {
    List<Flight> selectFlight(String DP,String AP);
}
