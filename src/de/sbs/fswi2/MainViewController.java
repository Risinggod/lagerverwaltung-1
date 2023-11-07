package de.sbs.fswi2;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainViewController implements Initializable {

    @FXML
    private void beenden(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private Label lblDatum;

    @FXML
    private Label lblanzalLabel;

    @FXML
    private void addTab(ActionEvent event) {
        int i = 1;
        int counter = i++;
        lblanzalLabel.setText(Integer.toString(counter));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblDatum.setText(new java.text.SimpleDateFormat("dd.MM.yyyy").format(new Date()));
    }

    public void setStage(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Beispiel");
    }

}
