package com.example.adv_ff;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;



public class HelloApplication extends Application {
   static ArrayList<Admin> list_of_admins;

   @Override
    public void start(Stage stage) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("Firstpage.fxml"));
        stage.setTitle("Egyptian Premier League");
        stage.setScene(new Scene(root,583,350));
        stage.show();
    }


    public static void main(String[] args) {
        list_of_admins=new ArrayList<Admin>();
        list_of_admins.add(new Admin("admin","admin"));
        Admin.a_team();
        Admin.p_team();
        Admin.z_team();
        Admin.Stadiums();
        Admin.Referees();
        Admin.Matches();
        launch();
    }
    public static boolean loginverifier(Admin admin)
    {
        for(int i=0;i<list_of_admins.size();i++)
        {
           if( list_of_admins.get(i).login(admin.getUsername(),admin.getPasscode())==true)
               return true;
        }
        return false;
    }
}
