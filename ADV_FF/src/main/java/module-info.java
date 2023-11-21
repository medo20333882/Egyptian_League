module com.example.adv_ff {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.adv_ff to javafx.fxml;
    exports com.example.adv_ff;
}