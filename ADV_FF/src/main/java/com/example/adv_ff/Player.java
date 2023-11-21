package com.example.adv_ff;

public class Player extends Person {
    private int number;
    private String  position;
    private String currentTeam;

    public Player(String name, double weight, double height, int number, String currentTeam, String position) {
        super(name,  weight, height);
        this.number = number;
        this.position = position;
        this.currentTeam = currentTeam;

    }

    public Player(String name, double weight, double height) {
        super(name, weight, height);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }
    public String getCurrentTeam() {
        return currentTeam;
    }

}
