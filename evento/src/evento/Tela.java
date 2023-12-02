package evento;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Tela extends Application {

	@Override
	public void start(Stage Stage) throws Exception {
		Evento1 e = new Evento1();
        Pane panel = new Pane();
        Scene scn = new Scene(panel, 400, 200);
        Stage.addEventFilter(MouseEvent.MOUSE_PRESSED, e);
        Label lblTexto = new Label("Texto");
        lblTexto.relocate(180, 10);
        Button btnOK = new Button("Ok");
        btnOK.relocate(180, 170);
        panel.getChildren().addAll(lblTexto, btnOK);

        Stage.setScene( scn );
        Stage.setTitle("Teste de Eventos");
        Stage.show();
    } 

    public static void main(String[] args) {
        Application.launch(Tela.class, args);
    }
}

