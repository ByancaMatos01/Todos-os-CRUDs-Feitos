package aula3;

public class CorpoHumano {
    int peso;
    int altura;
    Coraçao coracao;
    Membros membro;

    public CorpoHumano(int peso, int altura, Coraçao coracao, Membros membro) {
        this.peso = peso;
        this.altura = altura;
        this.coracao = coracao;
        this.membro = membro;
    }

    public CorpoHumano() {
        this.peso = 70; // Valores padrão para peso e altura
        this.altura = 170;
        this.coracao = new Coraçao(); // Instância um Coraçao padrão
        this.membro = new Membros(); // Instância um Membros padrão
    }

    public void batimentos() {
        System.out.println("O coracao esta batendo!");
    }

    // Método para retornar uma representação de string do corpo humano
    public String retornar() {
        return "Peso: " + peso + " kg, Altura: " + altura + " cm\nCoracao: " + coracao.retornar() + "\nMembro: " + membro.retornar();
    }
}
