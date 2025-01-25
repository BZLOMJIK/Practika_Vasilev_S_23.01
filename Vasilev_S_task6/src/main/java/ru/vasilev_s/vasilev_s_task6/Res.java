package ru.vasilev_s.vasilev_s_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Res {

    @FXML
    private TextField chText;

    @FXML
    private Label resLabel;

    @FXML
    void resOnAction(ActionEvent event) {
        int num = Integer.parseInt(chText.getText());
        String result = "";
        if (num == 0) result += "нулевое";
        else {
            if (num > 0) result += "положительное ";
            else result += "отрицательное ";
            if (num % 2 == 0) result += "четное ";
            else result += "нечетное ";
        }
        resLabel.setText(result + "число");
    }

}
