package ru.vasilev_s_235.vasilev_s_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ress {

    @FXML
    private ImageView img;

    @FXML
    private Label otvLabel;

    @FXML
    private TextField xText;

    @FXML
    private TextField yText;

    @FXML
    void resOnAction(ActionEvent event) {
        float X = Float.parseFloat(xText.getText().toString());
        float Y = Float.parseFloat(yText.getText().toString());
        if (X < 0 && X > -15 && Y < 0 && Y > -15) 
            otvLabel.setText("Нет");
            else if (X > 0 && X < -15 && Y > 0 && Y < -15)
                otvLabel.setText("Да");
            else otvLabel.setText("на границе");

    }

}
