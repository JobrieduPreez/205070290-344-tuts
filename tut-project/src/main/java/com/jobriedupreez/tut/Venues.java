package com.jobriedupreez.tut;

import java.util.List;

public class Venues {
    private String name;
    private String building;
    private List<Integer> availableTimes;
    private int seats;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public List<Integer> getAvailableTimes() {
        return availableTimes;
    }

    public void setAvailableTimes(List<Integer> availableTimes) {
        this.availableTimes = availableTimes;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}