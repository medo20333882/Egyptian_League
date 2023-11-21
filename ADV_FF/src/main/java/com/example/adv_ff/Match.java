package com.example.adv_ff;

public class Match {
    private String stadium;
    private String teamA;
    private String teamB;
    private String date;
    private String time;
    private String referee;

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public Match(String stadium, String teamA, String teamB, String date, String time, String referee) {
        this.stadium=stadium;
        this.teamA = teamA;
        this.teamB = teamB;
        this.date = date;
        this.time = time;
        this.referee = referee;
    }

    public Match(Team teamA, Team teamB ) {

    }

    public String getLocation() {
        return stadium ;
    }

    public String getTeamA() {
        return teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getReferee() {
        return referee;
    }
}
