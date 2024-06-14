module com.example.qnyhrecordinginstrument {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.qnyhrecordinginstrument to javafx.fxml;
    exports com.example.qnyhrecordinginstrument;
}