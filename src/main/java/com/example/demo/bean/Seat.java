package com.example.demo.bean;

public class Seat {
    private int Seat_ID;
    private String Seat_Row;
    private int Seat_Number;
    private String Seat_Type;
    private int Seat_State;
    private int Flight_ID;

    public int getSeat_ID() {
        return Seat_ID;
    }

    public void setSeat_ID(int seat_ID) {
        this.Seat_ID = seat_ID;
    }

    public String getSeat_Row() {
        return Seat_Row;
    }

    public void setSeat_Row(String seat_Row) {
        this.Seat_Row = seat_Row;
    }

    public int getSeat_Number() {
        return Seat_Number;
    }

    public void setSeat_Number(int seat_Number) {
        this.Seat_Number = seat_Number;
    }

    public String getSeat_Type() {
        return Seat_Type;
    }

    public void setSeat_Type(String seat_Type) {
        this.Seat_Type = seat_Type;
    }

    public int getSeat_State() {
        return Seat_State;
    }

    public void setSeat_State(int seat_State) {
        this.Seat_State = seat_State;
    }

    public int getFlight_ID() {
        return Flight_ID;
    }

    public void setFlight_ID(int flight_ID) {
        this.Flight_ID = flight_ID;
    }
}
