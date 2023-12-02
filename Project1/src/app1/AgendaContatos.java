package app1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AgendaContatos extends  Application  {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Agenda de Contatos");
		Pane fp=new Pane();
        Scene Scene = new Scene(fp, 300, 250);
        stage.setScene(Scene);
        Label titulo = new Label("Agenda de Contatos :");
        titulo.relocate(3, 30);
        
        Label id = new Label("ID:");
        id.relocate(11, 70);
        TextField idtxt= new TextField();
        idtxt.relocate(48, 68);
  
        Label nome = new Label("Nome:");
        nome.relocate(11, 108);
        TextField nometxt= new TextField();
        nometxt.relocate(58, 105);
        
        Label telefone= new Label("Telefone:");
        telefone.relocate(11, 145);
        
        TextField telefonetxt= new TextField();
         telefonetxt.relocate(70, 140);
        
        Button btnsalvar = new Button("Salvar");
        btnsalvar.relocate(10, 180);
        Button btnpesquisar = new Button("Pesquisar");
        btnpesquisar.relocate(65, 180);
        fp.getChildren().addAll( titulo, id, nome, telefone, idtxt, nometxt, telefonetxt,btnsalvar, btnpesquisar);
        
        stage.setScene(Scene);
        stage.show();
        
	}

public static void main(String[] args) {
     Application.launch(AgendaContatos.class,args);
 }

	}

