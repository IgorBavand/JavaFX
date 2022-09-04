module fx.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens fx.javafx to javafx.fxml;
    exports fx.javafx;
}