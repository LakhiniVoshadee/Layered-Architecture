module com.example.layeredarchitecture {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;
    requires java.sql;

    opens lk.ijse.pos to javafx.fxml;
    opens lk.ijse.pos.controller to javafx.fxml;
    opens lk.ijse.pos.view.tdm to javafx.base;

    exports lk.ijse.pos;
    exports lk.ijse.pos.controller;
}
