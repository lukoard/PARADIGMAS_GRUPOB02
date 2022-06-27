package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
//import javafx.scene.control.Button;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.centerOnScreen();
			primaryStage.setResizable (true);
			primaryStage.setTitle ("Animal R");
			primaryStage.show();
//			Button boton = new Button("JavaFX");
//			boton.setDefaultButton(true);
//			boton.setPrefSize(100, 50);
//			boton.setLayoutX(105);
//			boton.setLayoutY(110);
//			root.getChildren().add(boton);
			
			 
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
