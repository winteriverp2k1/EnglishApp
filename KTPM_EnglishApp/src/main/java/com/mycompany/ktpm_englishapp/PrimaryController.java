package com.mycompany.ktpm_englishapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    private void LoadScene(int scene){
        int a = 15;
        int b = 20;
        int c = a + b;
    }
}
