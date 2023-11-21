package com.example.adv_ff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SecondPageController {
    @FXML
    Button btn1;
    @FXML
    Button btn2;
    @FXML
    TextField newuser;
    @FXML
    PasswordField newpass;
    @FXML
    Label errorL;

    @FXML
    public void handle2Btn1() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Firstpage.fxml"));
        Stage window = (Stage) btn1.getScene().getWindow();
        window.setScene(new Scene(root, 586, 350));
    }

    @FXML
    public void handle2Btn2() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Firstpage.fxml"));
        Stage window = (Stage) btn2.getScene().getWindow();
        window.setScene(new Scene(root, 586, 350));
    }
    @FXML
    public void error()
    {
        errorL.setText("Enter username and password");
    }

    @FXML
    public void signup() throws IOException {
        if (newuser.getText().isEmpty() || newpass.getText().isEmpty()) {
        error();
        } else {
            Admin a1=new Admin(newuser.getText(),newpass.getText());
            HelloApplication.list_of_admins.add(a1);
            handle2Btn2();
        }
    }
}
