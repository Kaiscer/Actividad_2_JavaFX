package com.example.javafx_tutorial;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AppController {

    public TextField textField;

    public Button btnSend;
    public TextArea txtArea;

    @FXML
    private void onClick(ActionEvent actionEvent){
        String input = textField.getText();
        txtArea.setText(input);
    }

}