package ru.vasilev_s_235.vasilev_s_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Res {

    @FXML
    private Label aLabel;

    @FXML
    private TextField aText;

    @FXML
    private Label bLabel;

    @FXML
    private TextField bText;

    @FXML
    private Label cLabel;

    @FXML
    private TextField cText;

    @FXML
    void resOnAction(ActionEvent event) {
        double A = Double.parseDouble(aText.getText().toString());
        double B = Double.parseDouble(bText.getText().toString());
        double C = Double.parseDouble(cText.getText().toString());
        if (A > B && A > C) {
            A = A * 2;
            B = B * 2;
            C = C * 2;
            aLabel.setText("A =" + A);
            bLabel.setText("B =" + B);
            cLabel.setText("C =" + C);
        } else {
            A = -A;
            B = -B;
            C = -C;
            aLabel.setText("A=" + A);
            bLabel.setText("B=" + B);
            cLabel.setText("C=" + C);
        }

    }

}
