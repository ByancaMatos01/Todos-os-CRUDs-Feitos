package aula4;

public class Passageiro extends Pessoa {
	String passagem;
	int qtdMalas;
	int Nassento;

	public Passageiro(String nome, int idade, String sexo, String passagem, int qtdmalas,int Nassento) {
		super(nome, idade, sexo);
		this.Nassento=Nassento;
		this.qtdMalas=qtdmalas;
		this.passagem=passagem;
	}
	   void comprarPassagem() {
	        System.out.println(nome + " comprou uma passagem."+ "e carrega  essa quantdade de malas "+ qtdMalas);
	    }

}
