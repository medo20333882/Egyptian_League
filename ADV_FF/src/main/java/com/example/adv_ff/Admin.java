package com.example.adv_ff;
import java.util.ArrayList;

public class Admin {
    private String username;
    private String passcode;

    public Admin(String username, String passcode) {
        this.username = username;
        this.passcode = passcode;
    }

    static ArrayList<Stadium> my_stadiums=new ArrayList<>();
    static ArrayList<Match>list_of_matches=new ArrayList<>();
    static ArrayList<Referee>list_of_referees=new ArrayList<>();
    static ArrayList<Player>list_of_players = new ArrayList<>();
    static ArrayList<Team>list_of_teams=new ArrayList<>();
public static void Stadiums() {

    Stadium c1 = new Stadium("Cairo International Stadium", 75000, "Cairo");
    Stadium c2 = new Stadium("Borg El Arab Stadium", 86000, "Borg el-Arab");
    Stadium c3 = new Stadium("Egyptian Army Stadium", 45000, "Cairo");
    my_stadiums.add(c1);
    my_stadiums.add(c2);
    my_stadiums.add(c3);
}
public static void Referees()
{
    Referee r1=new Referee("ِAmin omar",75,180);
    Referee r2=new Referee("Gehad Gerisha",90,185);
    Referee r3=new Referee("Mahmoud Ashour",75,190);
    list_of_referees.add(r1);
    list_of_referees.add(r2);
    list_of_referees.add(r3);
}
public static void Matches()
{
    Match m1=new Match("cairo International stadium","Ahly","Zamalk","28/9/2021","9:30 PM","Gehad Gerisha");
    Match m2=new Match("Borg El Arab Stadium","Ismaili","Masr El Makasa","3/5/2022","9:00 PM","Mahmoud Ashour");
    Match m3=new Match("cairo International","Ahly","Pyramids","29/1/2022","7:30 PM","Amin omar");
    list_of_matches.add(m1);
    list_of_matches.add(m2);
    list_of_matches.add(m3);
}
    // removing functions..............
    public static int removeReferee(int x)
    {
        list_of_referees.remove(x);
        return list_of_referees.size();
    }
    public static int removePlayer(int x)
    {
        list_of_players.remove(x);
        return list_of_players.size();
    }
    public static int removeMatch(int x)
    {
        list_of_matches.remove(x);
        return list_of_matches.size();
    }
    public static int removeTeam(int x)
    {
        list_of_teams.remove(x);
        return list_of_teams.size();
    }
// end of removing ............

    public String getUsername() {
        return username;
    }

    public String getPasscode() {
        return passcode;
    }

    public boolean login(String user, String password)
    {
        if (user.equals(this.username)&&(password.equals(this.passcode)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static Team Ahly =new Team("Ahly");
    static Team Zamalk =new Team("Zamalk");
    static Team Pyramids =new Team("Pyramids");

    public static void a_team()
    {
        Player p1 = new Player(" Badr Banoun", 70, 190, 15, "Ahly", "CB");
        Player p2 = new Player("Mohamed Elshenawy", 89, 195, 1, "Ahly", "GK");
        Player p3 = new Player("Abd Elkader", 75, 170, 35, "Ahly", "CAM");
        Player p4 = new Player("Ali Maaloul", 80, 165, 21, "Ahly", "LB");
        Player p5 = new Player("Amr El solia", 73, 170, 20, "Ahly", "ST");
        Ahly.list_of_players.add(p1);
        Ahly.list_of_players.add(p2);
        Ahly.list_of_players.add(p3);
        Ahly.list_of_players.add(p4);
        Ahly.list_of_players.add(p5);
        list_of_players.add(p1);
        list_of_players.add(p2);
        list_of_players.add(p3);
        list_of_players.add(p4);
        list_of_players.add(p5);
        list_of_teams.add(Ahly);

    }

    public static void p_team()
    {
        Player p9 = new Player("Abdallah Elsaeed", 76, 176, 19, "Pyramids", "CAM");
        Player p10 = new Player("Ramadan sobhy", 79, 180, 10, "Pyramids", "LW");
        Player p13 = new Player("Sherif Ekramy", 80, 180, 28, "Pyramids", "GK");
        Player p14 = new Player("Donga", 80, 180, 28, "Pyramids", "GK");
        Pyramids.list_of_players.add(p9);
        Pyramids.list_of_players.add(p10);
        Pyramids.list_of_players.add(p13);
        Pyramids.list_of_players.add(p14);
        list_of_players.add(p9);
        list_of_players.add(p10);
        list_of_players.add(p13);
        list_of_players.add(p14);
        list_of_teams.add(Pyramids);

    }

    public static void z_team()
    {
        Player p5 = new Player("Zizo", 80, 178, 25, "Zamalek", "CAM");
        Player p7 = new Player("Fatouh", 68, 175, 13, "Zamalek", "LB");
        Player p8 = new Player("Sheka", 80, 179, 10, "Zamalek", "RW");
        Player p11 = new Player("Gabasky", 85, 196, 1, "Zamalek", "GK");
        Player p12 = new Player("awaad", 75, 180, 32, "Zamalek", "GK");
        Zamalk.list_of_players.add(p5);
        Zamalk.list_of_players.add(p7);
        Zamalk.list_of_players.add(p8);
        Zamalk.list_of_players.add(p11);
        Zamalk.list_of_players.add(p12);
        list_of_players.add(p5);
        list_of_players.add(p7);
        list_of_players.add(p8);
        list_of_players.add(p11);
        list_of_players.add(p12);
        list_of_teams.add(Zamalk);
    }
}




