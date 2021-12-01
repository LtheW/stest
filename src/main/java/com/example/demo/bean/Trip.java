package com.example.demo.bean;

public class Trip {
    private int Trip_ID;
    private String Trip_DeparturePosition;
    private String Trip_ArrivalPosition;

    public int getTrip_ID() {
        return Trip_ID;
    }

    public void setTrip_ID(int trip_ID) {
        this.Trip_ID = trip_ID;
    }

    public String getTrip_DeparturePosition() {
        return Trip_DeparturePosition;
    }

    public void setTrip_DeparturePosition(String trip_DeparturePosition) {
       this.Trip_DeparturePosition = trip_DeparturePosition;
    }

    public String getTrip_ArrivalPosition() {
        return Trip_ArrivalPosition;
    }

    public void setTrip_ArrivalPosition(String trip_ArrivalPosition) {
        this.Trip_ArrivalPosition = trip_ArrivalPosition;
    }
}
