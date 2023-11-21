package com.example.adv_ff;
import java.util.ArrayList;

public class Stadium {
    private String name;
    private long capacity;
    private String location;
    private ArrayList<Match> listOfMatches;


    public Stadium(String name, long capacity, String location ) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;

    }

    public String getName() {
        return name;
    }

    public long getCapacity() {
        return capacity;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Match> getListOfMatches() {
        return listOfMatches;
    }
}
