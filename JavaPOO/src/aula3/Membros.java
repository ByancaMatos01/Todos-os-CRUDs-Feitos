package aula3;


public class Membros {
    String nome;
    String tipo;
    String localizacao;

    public Membros(String nome, String tipo, String localizacao) {
        this.nome = nome;
        this.tipo = tipo;
        this.localizacao = localizacao;
    }

    public Membros() {
        this.nome = "Braco Direito";
        this.tipo = "Superior";
        this.localizacao = "Direito";
    }

    // Método para retornar uma representação de string dos membros
    public String retornar() {
        return "Nome: " + nome + ", Tipo: " + tipo + ", Localizacao: " + localizacao;
    }
}
