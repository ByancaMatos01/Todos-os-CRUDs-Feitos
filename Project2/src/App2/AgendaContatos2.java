package App2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AgendaContatos2 extends Application {

	@Override
	public void start(Stage Stage) throws Exception {
		
		Stage.setTitle("Agenda de Contatos");

		Label Id=new Label("ID: "); // parte texto
		TextField Idtxt =new TextField(); // o campo que insere texto
		
		Label Nome=new Label("Nome : ");
		TextField Nometxt =new TextField();
		
		Label Telefone=new Label("Telefone: ");
		TextField Teltxt =new TextField();
		
		HBox hbox=new HBox(10);
		hbox.getChildren().addAll(Id,Idtxt);
		
		HBox hbox2=new HBox(10);
		hbox2.getChildren().addAll(Nome,Nometxt);
		
		HBox hbox3=new HBox(10);
		hbox3.getChildren().addAll(Telefone,Teltxt);
		
		
		Button pesquisa = new Button("Pesquisar");
        Button salva = new Button("Salvar");

        HBox hbox4 = new HBox(10); 
        hbox4.getChildren().addAll(pesquisa, salva);
        
        VBox vbox=new VBox(10);
        
		vbox.getChildren().addAll(hbox, hbox2, hbox3, hbox4);

		
		Scene Scene = new Scene(vbox, 300, 100);
		
		Stage.setScene(Scene);
		Stage.show();

	}
	public static void main(String[] args) {
		Application.launch(AgendaContatos2.class,args);
	}
}