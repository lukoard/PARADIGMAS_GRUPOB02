package application;

	
import java.io.IOException;
import controller.ControllerInicio;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.control.Button;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException  {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/inicio.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene (root);
		primaryStage.setScene(scene);
		ControllerInicio controller = loader.getController();
		controller.setStage(primaryStage);
		primaryStage.show();
		primaryStage.setTitle("Animal Riddle");
	}
		
	public static void main(String[] args) {
		launch(args);
	}
}
