package com.example.adv_ff;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class RemoveController {
    @FXML
    Button back;
    @FXML
    TextField remove_player;
    @FXML
    TextField remove_referee;
    @FXML
    TextField remove_team;
    @FXML
    TextField remove_match;
    @FXML
    Label error;
    @FXML
    Label error1;
    @FXML
    Label error2;
    @FXML
    Label error3;
    @FXML
    public void BackToMain() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root, 586, 350));
    }
    @FXML
    public void removePlayer()throws IndexOutOfBoundsException {
        if((new Integer(remove_player.getText())<=Admin.list_of_players.size()-1)){
            try {
                Admin.removePlayer(new Integer(remove_player.getText()));
            }catch (ArrayIndexOutOfBoundsException e)
            {
                e.getStackTrace();
            }
        }
        else
            error.setText("Invalid Index");


    }

    @FXML
    public void removeReferee()throws IndexOutOfBoundsException
    {
        if((new Integer(remove_referee.getText())<=Admin.list_of_referees.size()-1)) {
            try {
                Admin.removeReferee(new Integer(remove_referee.getText()));
            }catch (ArrayIndexOutOfBoundsException e)
            {
                e.getStackTrace();
            }
        }else
            error1.setText("Invalid Index");
        }
    @FXML
    public void removeMatch()throws IndexOutOfBoundsException {
        if ((new Integer(remove_match.getText()) <= Admin.list_of_matches.size() - 1)) {
            try {


                Admin.removeMatch(new Integer(remove_match.getText()));
            }catch (ArrayIndexOutOfBoundsException e)
            {
                e.getStackTrace();
            }
        }else
            error2.setText("Invalid Index");
    }

    @FXML
    public void removeTeam()throws IndexOutOfBoundsException
    {
        if ((new Integer(remove_team.getText()) <= Admin.list_of_teams.size() - 1)) {
            try {
                Admin.removeTeam(new Integer(remove_team.getText()));
            }catch(ArrayIndexOutOfBoundsException e)
            {
                e.getStackTrace();
            }
        }else
            error3.setText("Invalid Index");
    }

}
