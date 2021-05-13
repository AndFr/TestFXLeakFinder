package com.andfr;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) {

        stage.setTitle("HBox Experiment 1");

        AppHBox hbox = new AppHBox();

        Scene scene = new Scene(hbox, 200, 100);
        stage.setScene(scene);
        stage.show();
    }
}
