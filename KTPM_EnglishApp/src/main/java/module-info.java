module com.mycompany.ktpm_englishapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ktpm_englishapp to javafx.fxml;
    exports com.mycompany.ktpm_englishapp;
}
