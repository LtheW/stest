package com.example.demo.bean;

public class Airplane {
    private String Airplane_Type;
    private String Airplane_Name;
    private int Flight_ID;

    public String getAirplane_Type() {
        return Airplane_Type;
    }

    public void setAirplane_Type(String airplane_Type) {
        this.Airplane_Type = airplane_Type;
    }

    public String getAirplane_Name() {
        return Airplane_Name;
    }

    public void setAirplane_Name(String airplane_Name) {
        this.Airplane_Name = airplane_Name;
    }

    public int getFlight_ID() {
        return Flight_ID;
    }

    public void setFlight_ID(int flight_ID) {
        this.Flight_ID = flight_ID;
    }
}
