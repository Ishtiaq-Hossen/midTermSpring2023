package com.example.midtermspringsolve;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import java.util.ArrayList;


public class ArrayDesign
{
    @FXML
    private RadioButton arr3fxid;
    @FXML
    private TextArea showTextAreaFxid;
    @FXML
    private RadioButton forwardRadioButtonFxid;
    @FXML
    private ComboBox<String> oddEvenFxid;
    @FXML
    private RadioButton backwardRadioButtonFxid;
    @FXML
    private RadioButton arr1Fxid;
    @FXML
    private Label showOddEvenLabelFxid;
    @FXML
    private TextField valListAddTextFieldfxid;
    @FXML
    private RadioButton arr2Fxid;
    ArrayList<String> oddEvenSelector;
    ToggleGroup tg1=new ToggleGroup();
    ToggleGroup tg2=new ToggleGroup();
    ArrayList<Integer> valList;//declare korlam
    ArrayModel arrayModel;
    ArrayList<Integer>a1;
    ArrayList<Integer>a2;
    @FXML
    public void initialize() {

        valList=new ArrayList<>();
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
    public void forwardEvenShow(ArrayList<Integer>a,boolean even){
        String text = "";
        if(even){
                for(int i=0;i<a.size();i++){
                    if(a.get(i)%2==0){
                        text+=a.get(i).toString()+',';
                    }

                }
                showOddEvenLabelFxid.setText(text);
            }
        else{
            for(int i=0;i<a.size();i++){
                if(a.get(i)%2!=0){
                    text+=a.get(i).toString()+',';
                }

            }
            showOddEvenLabelFxid.setText(text);
        }

    }
    public void backwardEvenShow(ArrayList<Integer>a,boolean even){
        String text = "";
        if(even){
            for(int i=a.size()-1;i>=0;i--){
                if(a.get(i)%2==0){
                    text+=a.get(i).toString()+',';
                }

            }
            showOddEvenLabelFxid.setText(text);
        }
        else{
            for(int i=a.size()-1;i>=0;i--){
                if(a.get(i)%2!=0){
                    text+=a.get(i).toString()+',';
                }

            }
            showOddEvenLabelFxid.setText(text);
        }

    }


    @FXML
    public void traverseButtonOnAction(ActionEvent actionEvent) {
        if(forwardRadioButtonFxid.isSelected()) {
            boolean even;
            if("Even".equals(oddEvenFxid.getValue())){
                even=true;
            }
            else{
                even=false;
            }
            if(arr1Fxid.isSelected()) {
                forwardEvenShow(arrayModel.arr1,even);
            }
            else if(arr2Fxid.isSelected()){
                forwardEvenShow(arrayModel.arr2,even);
            }
            else{
                forwardEvenShow(arrayModel.arr3,even);
            }

        }
        else{
            boolean even;
            if("Even".equals(oddEvenFxid.getValue())){
                even=true;
            }
            else{
                even=false;
            }
            if(arr1Fxid.isSelected()) {
                backwardEvenShow(arrayModel.arr1,even);
            }
            else if(arr2Fxid.isSelected()){
                backwardEvenShow(arrayModel.arr2,even);
            }
            else{
                backwardEvenShow(arrayModel.arr3,even);
            }

        }
    }

    @FXML
    public void addElementToValListOnAction(ActionEvent actionEvent) {

        int a=Integer.parseInt(valListAddTextFieldfxid.getText());
        valList.add(a);
        valListAddTextFieldfxid.clear();
    }

    @FXML
    public void mergeArrayOnAction(ActionEvent actionEvent) {
        arrayModel=new ArrayModel(a1,a2);
        arrayModel.arrayMerge();
        showTextAreaFxid.setText(arrayModel.toString());
    }

    @FXML
    public void createA1OnAction(ActionEvent actionEvent) {
        a1=new ArrayList<>();
        for(int i=0; i<valList.size(); i++){
            a1.add(valList.get(i));
        }
        valList.clear();
    }

    @FXML
    public void createarr2OnAction(ActionEvent actionEvent) {
        a2=new ArrayList<>();
        for(int i=0; i<valList.size(); i++){
            a2.add(valList.get(i));
        }
        valList.clear();
    }
}