package curso;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlunoBondery extends Application {
    private TextField txtId;
    private TextField txtRa;
    private TextField txtNome;
    private TextField txtNascimento;
    private AlunoControl control = new AlunoControl();

    @Override
    public void start(Stage stage) throws Exception {
        VBox painel = new VBox();
        Scene scn = new Scene(painel, 800, 600);

        Label lblId = new Label("ID: ");
        txtId = new TextField();
        Label lblRa = new Label("RA: ");
        txtRa = new TextField();
        Label lblNome = new Label("Nome Completo: ");
        txtNome = new TextField();
        Label lblNascimento = new Label("Nascimento: ");
        txtNascimento = new TextField();
        Button btnSalvar = new Button("Salvar");
        Button btnPesquisar = new Button("Pesquisar");
        Label lblResultado = new Label();

        Bindings.bindBidirectional(control.idProperty(), txtId.textProperty());
        Bindings.bindBidirectional(control.raProperty(), txtRa.textProperty());
        Bindings.bindBidirectional(control.nomeProperty(), txtNome.textProperty());
        Bindings.bindBidirectional(control.nascimentoProperty(), txtNascimento.textProperty());

        btnSalvar.setOnMouseClicked( 
            e-> { 
                control.salvarAluno();
            }
        );

        btnPesquisar.setOnMousePressed(
            e -> { 
                control.procurar();
            }
        );

        painel.getChildren().addAll(lblId, txtId, lblRa, txtRa, lblNome, txtNome, lblNascimento, txtNascimento, btnSalvar, btnPesquisar, lblResultado);

        stage.setScene(scn);
        stage.setTitle("Gestão de Alunos");
        stage.show();
    } 

    public static void main(String[] args) {
        Application.launch(AlunoBondery.class, args);
    }
}

