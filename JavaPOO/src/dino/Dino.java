package dino;

public class Dino {
	private int energia;
	private int velocidade;
	private int temperatura;
	private String humor;

	public Dino() {
		this.energia = 100;
		this.velocidade = 40;
		this.temperatura = 40;
		this.humor = "feliz :) ";
	}

	public void pular() {
		this.energia=energia-10;
		this.velocidade=velocidade-15;
		this.humor="FELIZ :) ";
		System.out.println("O dino esta pulando ...  ...  ... ");

	}
	public void correr() {
		this.energia = energia - 20;
		this.velocidade = velocidade -10;
		this.humor = "feliz :) ";
		System.out.println("O DINO esta correndo .... vruummm........");
	}

	public void comer() {
		this.energia = energia + 30;
		this.velocidade = velocidade - 10;
		this.humor = "feliz";
		System.out.println("O DINO esta comendo ........");
	}

	public void cantar() {
		this.energia = energia - 15;
		this.humor = "feliz :) ";
		System.out.println("O Dino está cantando .**...***.****...***");
	}

	public void tomarSol() {
		this.velocidade = velocidade  + 10;
		this.temperatura = temperatura + 5;
		this.humor = "feliz :)";
		System.out.println(" Dino está tomando sol ********");
	}
	public void ficarNaSombra() {
		this.energia = energia + 20;
		this.humor = "triste :( ";
		this.temperatura = temperatura-5;
		System.out.println("Dino esta na sombra");
	}
	public String toString() {
        return "Energia: " + this.energia + ", Velocidade: " + this.velocidade + ", Temperatura: " + this.temperatura + ", Humor: " + this.humor;
    }
}



