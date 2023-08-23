package com.jobriedupreez.tut;

import java.util.List;

public class Modules {
    private String name;
    private String lecturer;
    private List<Integer> availableTimes;
    private int students;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public List<Integer> getAvailableTimes() {
        return availableTimes;
    }

    public void setAvailableTimes(List<Integer> availableTimes) {
        this.availableTimes = availableTimes;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }
}