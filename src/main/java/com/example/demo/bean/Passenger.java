package com.example.demo.bean;

import com.sun.javafx.beans.IDProperty;

public class Passenger {

    private int Passenger_ID;
    private String Passenger_Name;
    private String Passenger_Sex;
    private String Passenger_Telephone;
    private String Passenger_PassportNumber;

    public int getPassenger_ID() {
        return Passenger_ID;
    }

    public void setPassenger_ID(int passenger_ID) {
        this.Passenger_ID = passenger_ID;
    }

    public String getPassenger_Name() {
        return Passenger_Name;
    }

    public void setPassenger_Name(String passenger_Name) {
        this.Passenger_Name = passenger_Name;
    }

    public String getPassenger_Sex() {
        return Passenger_Sex;
    }

    public void setPassenger_Sex(String passenger_Sex) {
        this.Passenger_Sex = passenger_Sex;
    }

    public String getPassenger_Telephone() {
        return Passenger_Telephone;
    }

    public void setPassenger_Telephone(String passenger_Telephone) {
        this.Passenger_Telephone = passenger_Telephone;
    }

    public String getPassenger_PassportNumber() {
        return Passenger_PassportNumber;
    }

    public void setPassenger_PassportNumber(String passenger_PassportNumber) {
        this.Passenger_PassportNumber = passenger_PassportNumber;
    }
}
