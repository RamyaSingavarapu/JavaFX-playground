module ramya.practice.hellofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ramya.practice.hellofx to javafx.fxml;
    exports ramya.practice.hellofx;
}