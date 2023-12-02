package aula4;

public class Piloto extends Pessoa{
private String breve;
private String dataformacao;
private int experiencia;

	public Piloto(String nome, int idade, String sexo, String breve, String dataformacao,int experiencia) {
		super(nome, idade, sexo);
		this.breve=breve;
		this.dataformacao=dataformacao;
		this.experiencia=experiencia;
	}
	void PilotarAeronave() {
		System.out.println(nome + " está pilotando uma aeronave.");
	}
}
