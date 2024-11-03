module com.example.midtermspringsolve {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.midtermspringsolve to javafx.fxml;
    exports com.example.midtermspringsolve;
}