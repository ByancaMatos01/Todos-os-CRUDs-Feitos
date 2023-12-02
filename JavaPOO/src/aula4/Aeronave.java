package aula4;

public class Aeronave {
 private int capacidade;
 private String modelo;
 private String serie;
 
public Aeronave(String modelo, int capacidade, String serie) {
	this.capacidade=capacidade;
	this.modelo=modelo;
	this.serie=serie;
}

void IniciarVoar(){
	System.out.println("A aeronave de modelo " + modelo + "Capacidade de "+ capacidade+" iniciou o voo.");
}
 
}
