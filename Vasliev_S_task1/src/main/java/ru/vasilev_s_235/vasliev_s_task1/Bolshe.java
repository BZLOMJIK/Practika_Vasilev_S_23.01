package ru.vasilev_s_235.vasliev_s_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Bolshe {

    @FXML
    private TextField aText;

    @FXML
    private Label resLabel;

    @FXML
    void resOnAction(ActionEvent event) {
        int A = Integer.parseInt(aText.getText().toString());
        if (A >= 100) {
            resLabel.setText("Число больше чем 100");
        } else {
            int a, b;
        a = A / 10;
        b = A % 10;


        resLabel.setText("bolshe=" + Math.max(a, b));

    }

}
}
