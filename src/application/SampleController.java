package application;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class SampleController {
    @FXML
    private GridPane tablero;

	  @FXML
	    void Click(MouseEvent event) {
		  System.out.println(tablero.getColumnConstraints());
	    }
}
