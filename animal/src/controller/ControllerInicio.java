package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Labeled;
//import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerInicio {

	private Stage stage;
//	private TextField NameAnimal;
    @FXML
    private Button animal1;

    @FXML
    private Button animal2;

    @FXML
    private Button animal3;
	
    @FXML
    void showanimal1(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/animal1.fxml"));
    	Parent root	= loader.load();
    	ControllerAnimal1 controller1 = loader.getController();
    	Scene scene = new Scene(root);
    	Stage stage = new Stage();
    	stage.setScene(scene);
//    	Labeled NameAnimal;
//		controller1.init(NameAnimal.getText(), stage, this);
//		NameAnimal.getText().equals("DOG");
    	controller1.init(null, stage, this);
    	stage.show ();
    	this.stage.close();
    	}

    @FXML
    void showanimal2(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/animal2.fxml"));
    	Parent root	= loader.load();
    	ControllerAnimal2 controller2 = loader.getController();
    	Scene scene = new Scene(root);
    	Stage stage = new Stage();
    	stage.setScene(scene);
//    	Labeled NameAnimal;
//    	controller2.init(NameAnimal.getText(), stage, this);
    	controller2.init(null, stage, this);
    	stage.show ();
    	this.stage.close();
    }

    @FXML
    void showanimal3(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/animal3.fxml"));
    	Parent root	= loader.load();
    	ControllerAnimal3 controller3 = loader.getController();
    	Scene scene = new Scene(root);
    	Stage stage = new Stage();
    	stage.setScene(scene);
//    	Labeled NameAnimal;
//    	controller3.init(NameAnimal.getText(), stage, this);
    	controller3.init(null, stage, this);
	   	stage.show ();
    	this.stage.close();
    }

    @FXML
    void close(ActionEvent event) {

    }

    @FXML
    void b50d0d(ActionEvent event) {

    }

	public void setStage(Stage primaryStage) {
		stage = primaryStage;
		
	}
	
	public void show() {
		stage.show();
		
	}
}
