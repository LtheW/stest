package com.example.demo.bean;

import java.util.Date;

public class Ticket {
    private int Ticket_ID;
    private int Passenger_ID;
    private int Flight_ID;
    private int Seat_ID;
    private int Trip_ID;
    private Date Ticket_Time;

    public Date getTicket_Time() {
        return Ticket_Time;
    }

    public void setTicket_Time(Date ticket_Time) {
        this.Ticket_Time = ticket_Time;
    }

    public int getTicket_ID() {
        return Ticket_ID;
    }

    public void setTicket_ID(int ticket_ID) {
        this.Ticket_ID = ticket_ID;
    }

    public int getPassenger_ID() {
        return Passenger_ID;
    }

    public void setPassenger_ID(int passenger_ID) {
        this.Passenger_ID = passenger_ID;
    }

    public int getFlight_ID() {
        return Flight_ID;
    }

    public void setFlight_ID(int flight_ID) {
        this.Flight_ID = flight_ID;
    }

    public int getSeat_ID() {
        return Seat_ID;
    }

    public void setSeat_ID(int seat_ID) {
        this.Seat_ID = seat_ID;
    }

    public int getTrip_ID() {
        return Trip_ID;
    }

    public void setTrip_ID(int trip_ID) {
        this.Trip_ID = trip_ID;
    }
}
