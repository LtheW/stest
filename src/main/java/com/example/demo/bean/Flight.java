package com.example.demo.bean;

import java.sql.Time;

public class Flight {
    private int Flight_ID;
    private String Flight_Number;
    private Time Flight_DepartureTime;
    private Time Flight_ArrivalTime;
    private String Flight_DeparturePosition;
    private String Flight_ArrivalPosition;
    private int Flight_Fare;
    private String Airline_Name;
    private int Trip_ID;
    private String Airport_Name;
    private String Airplane_Type;

    public int getFlight_ID() {
        return Flight_ID;
    }

    public void setFlight_ID(int flight_ID) {
        this.Flight_ID = flight_ID;
    }

    public String getFlight_Number() {
        return Flight_Number;
    }

    public void setFlight_Number(String flight_Number) {
        this.Flight_Number = flight_Number;
    }

    public Time getFlight_DepartureTime() {
        return Flight_DepartureTime;
    }

    public void setFlight_DepartureTime(Time flight_DepartureTime) {
        this.Flight_DepartureTime = flight_DepartureTime;
    }

    public Time getFlight_ArrivalTime() {
        return Flight_ArrivalTime;
    }

    public void setFlight_ArrivalTime(Time flight_ArrivalTime) {
        this.Flight_ArrivalTime = flight_ArrivalTime;
    }

    public String getFlight_DeparturePosition() {
        return Flight_DeparturePosition;
    }

    public void setFlight_DeparturePosition(String flight_DeparturePosition) {
        this.Flight_DeparturePosition = flight_DeparturePosition;
    }

    public String getFlight_ArrivalPosition() {
        return Flight_ArrivalPosition;
    }

    public void setFlight_ArrivalPosition(String flight_ArrivalPosition) {
        this.Flight_ArrivalPosition = flight_ArrivalPosition;
    }

    public int getFlight_Fare() {
        return Flight_Fare;
    }

    public void setFlight_Fare(int flight_Fare) {
        this.Flight_Fare = flight_Fare;
    }

    public String getAirline_Name() {
        return Airline_Name;
    }

    public void setAirline_Name(String airline_Name) {
        Airline_Name = airline_Name;
    }

    public String getAirport_Name() {
        return Airport_Name;
    }

    public void setAirport_Name(String airport_Name) {
        Airport_Name = airport_Name;
    }

    public String getAirplane_Type() {
        return Airplane_Type;
    }

    public void setAirplane_Type(String airplane_Type) {
        Airplane_Type = airplane_Type;
    }

    public int getTrip_ID() {
        return Trip_ID;
    }

    public void setTrip_ID(int trip_ID) {
        this.Trip_ID = trip_ID;
    }

}
