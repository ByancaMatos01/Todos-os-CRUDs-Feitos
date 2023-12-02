package curso;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Aluno {
    private StringProperty id = new SimpleStringProperty("");
    private StringProperty ra = new SimpleStringProperty("");
    private StringProperty nome = new SimpleStringProperty("");
    private StringProperty nascimento = new SimpleStringProperty("");

    // Construtor
    public Aluno() {}

    // Getters e Setters
    public String getId() { 
        return this.id.get();
    }
    public void setId(String valor) { 
        this.id.set(valor);
    }
    public StringProperty idProperty() { 
        return this.id;
    }

    public String getRa() { 
        return this.ra.get();
    }
    public void setRa(String valor) { 
        this.ra.set(valor);
    }
    public StringProperty raProperty() { 
        return this.ra;
    }

    public String getNome() { 
        return this.nome.get();
    }
    public void setNome(String valor) { 
        this.nome.set(valor);
    }
    public StringProperty nomeProperty() { 
        return this.nome;
    }

    public String getNascimento() { 
        return this.nascimento.get();
    }
    public void setNascimento(String valor) { 
        this.nascimento.set(valor);
    }
    public StringProperty nascimentoProperty() { 
        return this.nascimento;
    }
}
