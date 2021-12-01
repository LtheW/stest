package com.example.demo.bean;

import java.sql.Timestamp;
import java.time.DateTimeException;

public class Airport {
    private String Airport_Code;
    private String Airport_Name;
    private String Airport_City;
    private String Airport_Country;
    private Timestamp Airport_ConnectionTime;

    public String getAirport_Code() {
        return Airport_Code;
    }

    public void setAirport_Code(String airport_Code) {
        this.Airport_Code = airport_Code;
    }

    public String getAirport_Name() {
        return Airport_Name;
    }

    public void setAirport_Name(String airport_Name) {
        this.Airport_Name = airport_Name;
    }

    public String getAirport_City() {
        return Airport_City;
    }

    public void setAirport_City(String airport_City) {
        this.Airport_City = airport_City;
    }

    public String getAirport_Country() {
        return Airport_Country;
    }

    public void setAirport_Country(String airport_Country) {
        this.Airport_Country = airport_Country;
    }

    public Timestamp getAirport_ConnectionTime() {
        return Airport_ConnectionTime;
    }

    public void setAirport_ConnectionTime(Timestamp airport_ConnectionTime) {
        this.Airport_ConnectionTime = airport_ConnectionTime;
    }
}
