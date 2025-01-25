package ru.vasilev_s_235.vasilev_s_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Res {

    @FXML
    private TextField aText;

    @FXML
    private TextField bText;

    @FXML
    private TextField cText;

    @FXML
    private Label resLabel;

    @FXML
    void resOnAction(ActionEvent event) {
        int A = Integer.parseInt(aText.getText().toString());
        int B = Integer.parseInt(bText.getText().toString());
        int C = Integer.parseInt(cText.getText().toString());
        int N = 0;
        if(A>0)N++;
        if (B>0)N++;
        if(C>0)N++;
        resLabel.setText("poloz="+N);




    }

}
