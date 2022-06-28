package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerAnimal1 {
	
	private ControllerInicio ConInicio;
	private Stage stage;
	
    @FXML
    private AnchorPane NameAnimal;

    @FXML
    private TextField nameAnimal;
    	
    @FXML
    void close(ActionEvent event) {
    	ConInicio.show();
    	stage.show();
    }

    @FXML
    void b50d0d(ActionEvent event) {

    }
    
    @FXML
    void onEnter(ActionEvent event) {
    	System.out.println("test") ;
    }
    
 
    
	public void init(Object object, Stage stage2, ControllerInicio controllerInicio) {
				
	}

}
	
	

	

