package de.sbs.fswi2;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class MainViewController implements Initializable{

    @FXML
    private void beenden(ActionEvent event) {
        Platform.exit();
    }
    @FXML
    private Label lblDatum;

    @FXML
    private Label lblanzalLabel;
    
    @FXML
    private void addTab(ActionEvent event){
    }
     
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblDatum.setText(new java.text.SimpleDateFormat("dd.MM.yyyy").format(new Date()));
    }
    
}
