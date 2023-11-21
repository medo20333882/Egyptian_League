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
public class DisplayController {

    @FXML
    Button back;
    @FXML
    TextField getpindex;
    @FXML
    TextField gettindex;
    @FXML
    TextField getmindex;
    @FXML
    TextField getrindex;
    @FXML
    TextField p_name;
    @FXML
    TextField p_height;
    @FXML
    TextField p_weight;
    @FXML
    TextField p_currentteam;
    @FXML
    TextField p_position;
    @FXML
    TextField p_number;
    @FXML
    TextField r_name;
    @FXML
    TextField r_weight;
    @FXML
    TextField r_height;
    @FXML
    TextField m_stadium;
    @FXML
    TextField m_teama;
    @FXML
    TextField m_teamb;
    @FXML
    TextField m_date;
    @FXML
    TextField m_time;
    @FXML
    TextField m_referee;
    @FXML
    TextField t_name;
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
    public void Display_player() {
        if ((new Integer(getpindex.getText()) <= Admin.list_of_players.size()-1)) {
            try {
                    int i = new Integer(getpindex.getText());
                    Admin.list_of_players.get(i);
                    p_name.setText(Admin.list_of_players.get(i).getName());
                    p_height.setText(new String(String.valueOf(Admin.list_of_players.get(i).getHeight())));
                    p_number.setText(new String(String.valueOf(Admin.list_of_players.get(i).getNumber())));
                    p_currentteam.setText(Admin.list_of_players.get(i).getCurrentTeam());
                    p_weight.setText(new String(String.valueOf(Admin.list_of_players.get(i).getWeight())));
                    p_position.setText(Admin.list_of_players.get(i).getPosition());
            }
            catch (ArrayIndexOutOfBoundsException e) {
                e.getStackTrace();
            }
        }
        else
            error.setText("Invalid Index");
    }
    @FXML
    public void Display_Match()
    {
        if ((new Integer(getmindex.getText()) <= Admin.list_of_matches.size()-1)) {
            try {
                int i = new Integer(getmindex.getText());
                Admin.list_of_matches.get(i);
                m_stadium.setText(Admin.list_of_matches.get(i).getLocation());
                m_date.setText(Admin.list_of_matches.get(i).getDate());
                m_time.setText(Admin.list_of_matches.get(i).getTime());
                m_teama.setText(Admin.list_of_matches.get(i).getTeamA());
                m_teamb.setText(Admin.list_of_matches.get(i).getTeamB());
                m_referee.setText(Admin.list_of_matches.get(i).getReferee());
            }catch(ArrayIndexOutOfBoundsException e)
            {
                e.getStackTrace();
            }
        }
        else
            error1.setText("Invalid Index");
    }
    @FXML
    public void Display_Referee()
    {
        if ((new Integer(getrindex.getText()) <= Admin.list_of_referees.size()-1)) {
            try {


                int i = new Integer(getrindex.getText());
                r_name.setText(Admin.list_of_referees.get(i).getName());
                r_height.setText(new String(String.valueOf(Admin.list_of_referees.get(i).getHeight())));
                r_weight.setText(new String(String.valueOf(Admin.list_of_referees.get(i).getWeight())));
            }catch (ArrayIndexOutOfBoundsException e)
            {
                e.getStackTrace();
            }
        }else
            error2.setText("Invalid Index");
    }
    @FXML
    public void Display_Team()
    {
        if ((new Integer(gettindex.getText()) <= Admin.list_of_teams.size()-1)) {
            try {


                int i = new Integer(gettindex.getText());
                t_name.setText(Admin.list_of_teams.get(i).getName());
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                e.getStackTrace();
            }
        }
        else
            error3.setText("Invalid Index");
    }

}
