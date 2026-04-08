package com.example.sanmarino;

import com.sun.javafx.binding.ObjectConstant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class TransactFormControl implements Initializable {


    

    //datePicker
    @FXML
    private DatePicker addFormDPicker;
    @FXML
    private Label DtrasanctLabel;

    public void getDate(ActionEvent event){

    }


//Payment

    @FXML
    private Label payTypeLabel;
    @FXML
    private ChoiceBox<String> payChoiceBox;

    private String[] paymentModes ={"Gcash", "Paymaya", "Cash", "Other"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        payChoiceBox.getItems().addAll(paymentModes);
        payChoiceBox.setOnAction(this::PayModeTypes);

    }

    public void PayModeTypes(ActionEvent event){}



    public void buttonForAll(ActionEvent event){
        String bayadMethod = payChoiceBox.getValue();
        System.out.println(bayadMethod);





        LocalDate FormDPicker = addFormDPicker.getValue();
        System.out.println(FormDPicker.toString());
    };


}






