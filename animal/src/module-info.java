module animal {
	requires javafx.controls;
	requires javafx.base;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens controller to javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
}
