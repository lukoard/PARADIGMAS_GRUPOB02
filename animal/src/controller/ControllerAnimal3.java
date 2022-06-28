package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ControllerAnimal3 {
	
	private ControllerInicio ConInicio;
	private Stage stage;
//	private Label lblName;
	
    @FXML
    void close(ActionEvent event) {
    	ConInicio.show();
    	stage.close();

    }

    @FXML
    void b50d0d(ActionEvent event) {

    }
    
    public void init(Object object, Stage stage2, ControllerInicio controllerInicio) {
		// TODO Auto-generated method stub
		
	}

}
