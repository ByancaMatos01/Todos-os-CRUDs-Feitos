package davi;

public class Aeronave {
	
	   private String modelo;
	    private int capacidade;
	    private int velocidade;

	    public Aeronave(String modelo, int capacidade, int velocidade) {
	        this.modelo = modelo;
	        this.capacidade = capacidade;
	        this.velocidade = velocidade;
	    }

	    public void voar() {
	        System.out.println("Aeronave decolando...");
	    }
	}


