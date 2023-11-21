package com.example.adv_ff;

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

public class HelloController {
    @FXML
    Label error;
@FXML
    Button btn1,btn2;
@FXML
    TextField user;
@FXML
    PasswordField password;
@FXML
public void handleBtn1() throws IOException {

    Parent root= FXMLLoader.load(getClass().getResource("SecondPage.fxml"));
    Stage window=(Stage)btn1.getScene().getWindow();
    window.setScene(new Scene(root,586,350) );
}
@FXML
    public void handleBtn2() throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("Main.fxml"));
        Stage window=(Stage)btn2.getScene().getWindow();
        window.setScene(new Scene(root,586,350) );
    }
    @FXML
    public void error()
    {
    error.setText("invalid username or password");
    }
@FXML
public void login() throws IOException {
    Admin admin = new Admin(user.getText(), password.getText());

    if (HelloApplication.loginverifier(admin) == true) {
        handleBtn2();
    } else
        error();

}
}
