package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SeatMapper {
    void insertSeat(int Seat_ID,String Seat_Row,int Seat_Number,String Seat_Type,int Seat_State,int Flight_ID);
}
