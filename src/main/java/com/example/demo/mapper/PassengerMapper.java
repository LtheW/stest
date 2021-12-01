package com.example.demo.mapper;

import com.example.demo.bean.Passenger;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PassengerMapper {
    List<Passenger> selectAll();
    void insertPassenger(int Passenger_ID,String Passenger_Name,String Passenger_Sex,String Passenger_Telephone,String Passenger_PassportNumber);
}
