package com.example.adv_ff;

import java.util.ArrayList;

public class    League {


    private static ArrayList<Team> teams;
    private static ArrayList<Match> matches;
    private String startingDate;
    private String endingDate;

    public League(String startingDate, String endingDate, ArrayList<Team> teams, ArrayList<Match> matches) {
        this.teams = teams;
        this.matches = matches;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    public  ArrayList<Team> getTeams() {
        return teams;
    }

    public  ArrayList<Match> getMatches() {
        return matches;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public String getEndingDate() {
        return endingDate;
    }

}