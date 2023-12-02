package aula4;

public class Pessoa {
protected String nome;
private int idade;
private String sexo;


public Pessoa(String nome, int idade, String sexo) {
	this.nome=nome;
	this.idade=idade;
	this.sexo=sexo;
}
void Informaçoes() {
	System.out.println("O nome da pessoa é "+ nome+ "sua idade é "+ idade+ "seu sexo é "+ sexo);

}
}
