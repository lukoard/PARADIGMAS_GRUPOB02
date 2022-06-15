module com.animalriddle.animalriddle {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.animalriddle.animalriddle to javafx.fxml;
    exports com.animalriddle.animalriddle;
}
