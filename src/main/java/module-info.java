module com.mar.primermongo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mar.primermongo to javafx.fxml;
    exports com.mar.primermongo;
}