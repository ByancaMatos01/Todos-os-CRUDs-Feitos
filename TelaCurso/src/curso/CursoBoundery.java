package curso;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CursoBoundery extends Application  {
	 private TextField idTextField;
	    private TextField nomeTextField;
	    private TextField codigoTextField;
	    private TextField coordenadorTextField;
	    private TextField quantidadeAlunosTextField;
	    
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("CRUD de Cursos");

	        GridPane gridPane = new GridPane();
	        gridPane.setPadding(new Insets(10));
	        gridPane.setHgap(10);
	        gridPane.setVgap(10);

	        Label idLabel = new Label("Id:");
	        idTextField = new TextField();
	        gridPane.add(idLabel, 0, 0);
	        gridPane.add(idTextField, 1, 0);

	        Label nomeLabel = new Label("Nome:");
	        nomeTextField = new TextField();
	        gridPane.add(nomeLabel, 0, 1);
	        gridPane.add(nomeTextField, 1, 1);

	        Label codigoLabel = new Label("Código do Curso:");
	        codigoTextField = new TextField();
	        gridPane.add(codigoLabel, 0, 2);
	        gridPane.add(codigoTextField, 1, 2);

	        Label coordenadorLabel = new Label("Nome do Coordenador:");
	        coordenadorTextField = new TextField();
	        gridPane.add(coordenadorLabel, 0, 3);
	        gridPane.add(coordenadorTextField, 1, 3);

	        Label quantidadeAlunosLabel = new Label("Quantidade de Alunos:");
	        quantidadeAlunosTextField = new TextField();
	        gridPane.add(quantidadeAlunosLabel, 0, 4);
	        gridPane.add(quantidadeAlunosTextField, 1, 4);

	        Button adicionarButton = new Button("Adicionar");
	        Button pesquisarButton = new Button("Pesquisar");
	        gridPane.add(adicionarButton, 0, 5);
	        gridPane.add(pesquisarButton, 1, 5);

	        Scene scene = new Scene(gridPane, 400, 200);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}

