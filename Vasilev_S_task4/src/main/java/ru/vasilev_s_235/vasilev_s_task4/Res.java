package ru.vasilev_s_235.vasilev_s_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

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
        double M = A + pow(B, 2) / C;
        int k =(int) M % 3;
        double y = 0;
        if (k == 1) {
            y = exp(M + C);
        }if (k == 0){
            y=log(A/B);
        }else if (k==2){
            y=sqrt(abs(pow(A+B,2)+C));
        }
        resLabel.setText("otvet ="+ y);


    }

}
