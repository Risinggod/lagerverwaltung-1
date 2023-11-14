package de.sbs.fswi2;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import de.sbs.fswi2.dao.DataAccesObject;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class MainViewController implements Initializable {

    DataAccesObject dao = new DataAccesObject();

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
        setAnzahlDaten();
    }

    @FXML
    private void about(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("FSWI2-Herzogenaurach");
        alert.setHeaderText("über die Software");
        String text = """
                LagerverwaltungFX
                version 1.0
                Copyright (c) 2023 Fachschule für Wirtschaftsinformatik
                """;
        alert.setContentText(text);
        alert.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblDatum.setText(new java.text.SimpleDateFormat("dd.MM.yyyy").format(new Date()));
        setAnzahlDaten();
    }

    @FXML
    private void setAnzahlDaten() {
        Thread getDaThread = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dao.getAll();
        });
        getDaThread.start();
    }

    public void setStage(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Beispiel");
    }

}
