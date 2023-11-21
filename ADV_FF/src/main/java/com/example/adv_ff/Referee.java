package com.example.adv_ff;

import java.util.ArrayList;

public class Referee extends Person {
    private ArrayList<Match> listOfMatches;

    public Referee(String name, double weight, double height) {
        super(name, weight, height);
    }

    public ArrayList<Match> getListOfMatches() {
        return listOfMatches;
    }


}
