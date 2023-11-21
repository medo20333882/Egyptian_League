package com.example.adv_ff;
import java.util.ArrayList;

public class Team {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> list_of_players=new ArrayList<>();
    public ArrayList<Match>list_of_matches=new ArrayList<>();

     public Team(String name, ArrayList<Player> list_of_players) {
        this.name = name;
        this.list_of_players = list_of_players;
     }

    public Team(String name) {
            this.name=name;
    }

    public String getName() {

        return name;
    }

    public ArrayList<Player> getListOfPlayers() {
        return list_of_players;
    }

    public void setListOfPlayers(ArrayList<Player> listOfPlayers) {
        this.list_of_players = listOfPlayers;

    }

}
