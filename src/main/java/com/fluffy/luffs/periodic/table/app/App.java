package com.fluffy.luffs.periodic.table.app;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws MalformedURLException, IOException {
        Parent root = FXMLLoader.load(new URL(this.getClass().getResource("/fxml/Home.fxml").toExternalForm()));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(this.getClass().getResource("/styles/Home.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}