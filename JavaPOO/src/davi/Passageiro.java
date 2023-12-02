package davi;

public class Passageiro extends Pessoa {
	private int numeroCartao;
	private String classe;
    private int bagagem;

    public Passageiro(String nome, int idade,  int CPF, String classe,int numeroCartao, int bagagem)  {
        super(nome, idade, CPF);
        this.numeroCartao= numeroCartao;
        this.classe=classe;
        this.bagagem= bagagem;
    }

    public void comprarBilhete() {
        System.out.println("Passageiro esta comprando Bilhete...");
    }
}
