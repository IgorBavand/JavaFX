package fx.javafx;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label lbMensagem;

    @FXML
    private void btClicou(Event e){
        lbMensagem.setText("OLÁ MUNDO!");
    }
}
