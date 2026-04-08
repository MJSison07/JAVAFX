package com.example.sanmarino;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.util.Objects;

public class smUiController {

  private Stage stage;
  private Scene scene;
  private Parent root;

  public void switchToAnnouncement(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ANNOUNCEMENT.fxml")));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();



  }

  public void switchToHOME(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HOME.fxml")));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();



  }

  public void switchToRecords(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("RECORDS.fxml")));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setMaximized(true);
    stage.setScene(scene);
    stage.show();




  }

  public void switchToAbout(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ABOUT.fxml")));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();




  }

  public void switchToPROFILE(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("PROFILE.fxml")));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();


  }

  public void Logout(ActionEvent event) {
    Alert LogoutAlert = new Alert(Alert.AlertType.CONFIRMATION);
    LogoutAlert.setHeaderText("Leaving already?");
    LogoutAlert.setContentText("do you wanna die?");
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    if (LogoutAlert.showAndWait().get() == ButtonType.OK) {
      stage = (Stage) stage.getScene().getWindow();
      System.out.println("You've succesfully logged out");
      stage.close();
    }


  }


  //MODAL FOR TFORMS
  @FXML
  private void AddTForm(ActionEvent event) {
    try {

      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddTFormm.fxml"));
      Parent root = fxmlLoader.load();


      Stage stage = new Stage();
      stage.setTitle("My Form");
      stage.setScene(new Scene(root));


      stage.initModality(Modality.APPLICATION_MODAL);


      stage.showAndWait();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  @FXML
  private void DeleteTForm(ActionEvent event) {
    try {

      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DeleteTForm.fxml"));
      Parent root = fxmlLoader.load();


      Stage stage = new Stage();
      stage.setTitle("My Form");
      stage.setScene(new Scene(root));


      stage.initModality(Modality.APPLICATION_MODAL);


      stage.showAndWait();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}
