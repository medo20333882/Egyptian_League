package com.example.adv_ff;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    Button btn5;
    @FXML
    Button display,add, remove,edit;
    @FXML
    private StackPane contentArea;
    @FXML
    public void handleBtn1() throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("Firstpage.fxml"));
        Stage window=(Stage)btn5.getScene().getWindow();
        window.setScene(new Scene(root,586,350) );
    }
    @FXML
    public void AddButton() throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Add.fxml"));
        Stage window=(Stage)add.getScene().getWindow();
        window.setScene(new Scene(root,586,350) );
    }
    @FXML
    public void EditButton() throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Edit.fxml"));
        Stage window=(Stage)edit.getScene().getWindow();
        window.setScene(new Scene(root,586,350) );
    }
    @FXML
    public void RemoveButton() throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Remove.fxml"));
        Stage window=(Stage)remove.getScene().getWindow();
        window.setScene(new Scene(root,586,350) );
    }
    @FXML
    public void DisplayButton() throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Display.fxml"));
        Stage window=(Stage)display.getScene().getWindow();
        window.setScene(new Scene(root,586,350) );
    }
}
