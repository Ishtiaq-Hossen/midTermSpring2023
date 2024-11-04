package com.example.midtermspringsolve;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import java.util.ArrayList;


public class ArrayDesign
{
    @javafx.fxml.FXML
    private RadioButton arr3fxid;
    @javafx.fxml.FXML
    private TextArea showTextAreaFxid;
    @javafx.fxml.FXML
    private RadioButton forwardRadioButtonFxid;
    @javafx.fxml.FXML
    private ComboBox<String> oddEvenFxid;
    @javafx.fxml.FXML
    private RadioButton backwardRadioButtonFxid;
    @javafx.fxml.FXML
    private RadioButton arr1Fxid;
    @javafx.fxml.FXML
    private Label showOddEvenLabelFxid;
    @javafx.fxml.FXML
    private TextField valListAddTextFieldfxid;
    @javafx.fxml.FXML
    private RadioButton arr2Fxid;
    ArrayList<String> oddEvenSelector;
    ToggleGroup tg1=new ToggleGroup();
    ToggleGroup tg2=new ToggleGroup();
    @javafx.fxml.FXML
    public void initialize() {
        oddEvenSelector=new ArrayList<String>();
        oddEvenSelector.add("Even");
        oddEvenSelector.add("Odd");
        oddEvenFxid.getItems().addAll(oddEvenSelector);
        oddEvenFxid.setValue(oddEvenSelector.get(0));
        arr1Fxid.setToggleGroup(tg2);
        arr2Fxid.setToggleGroup(tg2);
        arr3fxid.setToggleGroup(tg2);
        forwardRadioButtonFxid.setToggleGroup(tg1);
        backwardRadioButtonFxid.setToggleGroup(tg1);

    }

    @javafx.fxml.FXML
    public void traverseButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addElementToValListOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void mergeArrayOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createA1OnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createarr2OnAction(ActionEvent actionEvent) {
    }
}