package com.andfr;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.List;


public class AppHBox extends HBox {

    List<String> testList = new ArrayList<>();

    public AppHBox() {
        TextField textField = new TextField();
        textField.setId("testtextfield");

        getChildren().addAll(textField);
        initBigList();
    }

    /**
     * Create and store some data
     */
    public void initBigList() {
        for (int x = 0; x <= 500000; x++) {
            testList.add(x + " aaasas");
        }
    }
}
