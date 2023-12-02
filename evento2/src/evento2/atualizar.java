package evento2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

class Evento implements EventHandler<ActionEvent> {
    private Label lblTexto;
 public Evento(Label lblTexto) {
     this.lblTexto = lblTexto;
 }
 @Override
 public void handle(ActionEvent event) {
     lblTexto.setText("Botão Apertado");
 }
}
public class atualizar extends Application{


   public void start(Stage stage) throws Exception {


         Pane panel = new Pane();
         Scene scn = new Scene(panel, 400, 200);
         Label lblTexto = new Label("Texto");
         lblTexto.relocate(180, 10);
         Button btnOK = new Button("Ok");
         btnOK.relocate(180, 170);
         EventHandler<ActionEvent> manipulador = new Evento(lblTexto);
         stage.addEventFilter(ActionEvent.ACTION, manipulador);
         btnOK.setOnAction(new Evento(lblTexto));
         panel.getChildren().addAll(lblTexto, btnOK);
         stage.setScene( scn );
         stage.setTitle("Teste de Eventos");
         stage.show();
     } 

     public static void main(String[] args) {
         Application.launch(atualizar.class, args);
     }
}