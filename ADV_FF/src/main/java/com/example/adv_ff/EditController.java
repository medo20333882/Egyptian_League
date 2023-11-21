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

public class EditController {
    @FXML
    Button back;
    @FXML
    TextField p_name;
    @FXML
    TextField p_weight;
    @FXML
    TextField p_height;
    @FXML
    TextField p_position;
    @FXML
    TextField p_number;
    @FXML
    TextField p_currentteam;
    @FXML
    TextField r_name;
    @FXML
    TextField r_height;
    @FXML
    TextField r_weight;
    @FXML
    TextField t_name;
    @FXML
    TextField m_stadium;
    @FXML
    TextField m_date;
    @FXML
    TextField m_time;
    @FXML
    TextField m_teama;
    @FXML
    TextField m_teamb;
    @FXML
    TextField m_referee;
    @FXML
    TextField p_index;
    @FXML
    TextField r_index;
    @FXML
    TextField t_index;
    @FXML
    TextField m_index;
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
        if ((new Integer(p_index.getText()) <= Admin.list_of_players.size()-1)) {
            try {
                int i = new Integer(p_index.getText());
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
    public void Edit_Player()
     {
         int i= new Integer(p_index.getText());
         Admin.list_of_players.get(i).setName(p_name.getText());
         Admin.list_of_players.get(i).setPosition(p_position.getText());
         Admin.list_of_players.get(i).setHeight(new Double(p_height.getText()));
         Admin.list_of_players.get(i).setWeight(new Double(p_weight.getText()));
         Admin.list_of_players.get(i).setCurrentTeam(p_currentteam.getText());
         Admin.list_of_players.get(i).setNumber(new Integer(p_number.getText()));}
    @FXML
    public void Display_Match() {
        if ((new Integer(m_index.getText()) <= Admin.list_of_matches.size() - 1)) {
            try {
                int i = new Integer(m_index.getText());
                Admin.list_of_matches.get(i);
                m_stadium.setText(Admin.list_of_matches.get(i).getLocation());
                m_date.setText(Admin.list_of_matches.get(i).getDate());
                m_time.setText(Admin.list_of_matches.get(i).getTime());
                m_teama.setText(Admin.list_of_matches.get(i).getTeamA());
                m_teamb.setText(Admin.list_of_matches.get(i).getTeamB());
                m_referee.setText(Admin.list_of_matches.get(i).getReferee());
            } catch (ArrayIndexOutOfBoundsException e) {
                e.getStackTrace();
            }
        } else
            error2.setText("Invalid Index");
    }
    @FXML
    public void Edit_Match()
    {
        int i= new Integer(m_index.getText());
        Admin.list_of_matches.get(i).setStadium(m_stadium.getText());
        Admin.list_of_matches.get(i).setDate(m_date.getText());
        Admin.list_of_matches.get(i).setReferee(m_referee.getText());
        Admin.list_of_matches.get(i).setTeamA(m_teama.getText());
        Admin.list_of_matches.get(i).setTeamB(m_teamb.getText());
        Admin.list_of_matches.get(i).setTime(m_time.getText());
    }
    @FXML
    public void Display_Referee()
    {
        if ((new Integer(r_index.getText()) <= Admin.list_of_referees.size()-1)) {
            try {


                int i = new Integer(r_index.getText());
                r_name.setText(Admin.list_of_referees.get(i).getName());
                r_height.setText(new String(String.valueOf(Admin.list_of_referees.get(i).getHeight())));
                r_weight.setText(new String(String.valueOf(Admin.list_of_referees.get(i).getWeight())));
            }catch (ArrayIndexOutOfBoundsException e)
            {
                e.getStackTrace();
            }
        }else
            error1.setText("Invalid Index");
    }
    @FXML
    public void Edit_Referee()
    {
        int i= new Integer(r_index.getText());
        Admin.list_of_referees.get(i).setName(r_name.getText());
        Admin.list_of_referees.get(i).setHeight(new Double(r_height.getText()));
        Admin.list_of_referees.get(i).setWeight(new Double(r_weight.getText()));
    }
    @FXML
    public void Display_Team()
    {
        if ((new Integer(t_index.getText()) <= Admin.list_of_teams.size()-1)) {
            try {


                int i = new Integer(t_index.getText());
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
    @FXML
    public void Edit_Team()
    {
        int  i= new Integer(t_index.getText());
        Admin.list_of_teams.get(i).setName(t_name.getText());
    }
}
