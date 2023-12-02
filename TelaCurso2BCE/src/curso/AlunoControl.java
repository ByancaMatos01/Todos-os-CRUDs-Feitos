package curso;


import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class AlunoControl {

    private StringProperty id = new SimpleStringProperty("");
    private StringProperty ra = new SimpleStringProperty("");
    private StringProperty nome = new SimpleStringProperty("");
    private StringProperty nascimento = new SimpleStringProperty("");

    private List<Aluno> lista = new ArrayList<>();

    public void salvar(Aluno a) { 
        lista.add(a);
        System.out.println("Tamanho Lista: " + lista.size());
    }

    public Aluno pesquisar(String texto) { 
        for (Aluno a : lista) { 
            if (a.getNome().toLowerCase().contains(texto.toLowerCase())) { 
                return a;
            }
        }
        return null;
    }

    public void salvarAluno() { 
        salvar(toEntity());
        clearBoundary();
    }

    public void procurar() { 
        Aluno a = pesquisar(nome.get());
        fromEntity(a);
    }

    public void clearBoundary() { 
        id.set("");
        ra.set("");
        nome.set("");
        nascimento.set("");
    }

    public Aluno toEntity() { 
        Aluno a = new Aluno();
        a.setId(id.get());
        a.setRa(ra.get());
        a.setNome(nome.get());
        a.setNascimento(nascimento.get());
        return a;
    }

    public void fromEntity(Aluno a) { 
        if (a != null) { 
            id.set(a.getId());
            ra.set(a.getRa());
            nome.set(a.getNome());
            nascimento.set(a.getNascimento());
        } else { 
            Alert alert = new Alert(
                AlertType.INFORMATION, 
                    "Aluno não encontrado", 
                    new ButtonType("Ok")
            );
            alert.show();
        }
    }

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
