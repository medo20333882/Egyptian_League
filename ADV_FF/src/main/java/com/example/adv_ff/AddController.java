package com.example.adv_ff;
import javafx.fxml.FXML;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.adv_ff.Admin.list_of_players;

public class AddController {
    @FXML
    TextField manager;
    @FXML
    Button back;
    @FXML
    TextField position ;
    @FXML
    TextField name;
    @FXML
    TextField weight;
    @FXML
    TextField height ;
    @FXML
    TextField team;
    @FXML
    TextField number;
    @FXML
    TextField namet;
    @FXML
    TextField listofplayers;
    @FXML
    TextField refname;
    @FXML
    TextField refweight;
    @FXML
    TextField refheight;
    @FXML
    TextField stadium_name;
    @FXML
    TextField first_team;
    @FXML
    TextField second_team;
    @FXML
    TextField date;
    @FXML
    TextField time;
    @FXML
    TextField matchrefree;
    @FXML
    public void BackToMain() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root, 586, 350));
    }
    @FXML
    private void checkinput1(KeyEvent event)
    {
        if(event.getCharacter().matches("[^\\e\t\r\\d+$]")) {
        event.consume();
        number.setStyle("-fx-border-color: red");
        }
        else
        {
            number.setStyle("-fx-border-color: blue");
        }
    }
    @FXML
    private void checkinput2(KeyEvent e)
    {
        if(e.getCharacter().matches("[^\\e\t\r\\d+$]")) {
            e.consume();
            weight.setStyle("-fx-border-color: red");
        }
            else
            {
                weight.setStyle("-fx-border-color: blue");
            }

    }
    @FXML
    private void checkinput3(KeyEvent ee)
    {
        if(ee.getCharacter().matches("[^\\e\t\r\\d+$]")) {
            ee.consume();
            height.setStyle("-fx-border-color: red");
        }
        else
        {
            height.setStyle("-fx-border-color: blue");
        }

    }
    @FXML
    public void add_player()
    {
        Player p=new Player(name.getText(),new Double(weight.getText()),new Double(height.getText()),new Integer(number.getText()) ,team.getText(),position.getText());
        list_of_players.add(p);
    }
    @FXML
    public void add_referee()
    {
    Referee r=new Referee(refname.getText(), new Double(refweight.getText()),new Double(refheight.getText()));
    Admin.list_of_referees.add(r);

    }
    @FXML
    public void add_team() {
        Team t = new Team(namet.getText());
        Admin.list_of_teams.add(t);
    }
    @FXML
    public void add_match()
    {
    Match m=new Match(stadium_name.getText(),first_team.getText(),second_team.getText(),date.getText(),time.getText(),matchrefree.getText());
    Admin.list_of_matches.add(m);
    }

}
