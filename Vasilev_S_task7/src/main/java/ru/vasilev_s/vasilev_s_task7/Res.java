package ru.vasilev_s.vasilev_s_task7;

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
        if (num % 2 == 0) result += "четное ";
        else result += "нечетное ";
        if (num >= 1 && num <= 9) result += "однозначное ";
        else if (num >= 10 && num <= 99) result += "двузначное ";
        else if (num >= 100 && num <= 999) result += "трехзначное ";
        resLabel.setText(result + "число");

    }

}
