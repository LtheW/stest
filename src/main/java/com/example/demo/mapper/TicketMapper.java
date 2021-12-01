package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
@Mapper
public interface TicketMapper {
    void insertTicket(int Ticket_ID, int Passenger_ID, int Flight_ID, int Seat_ID, int Trip_ID, Date Ticket_Time);
}
