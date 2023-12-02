package aula3;

	public class Main {

	    public static void main(String[] args) {
	        Coraçao c1 = new Coraçao(87.5);
	        @SuppressWarnings("unused")
			Coraçao c2 = new Coraçao();

	        Membros m1 = new Membros("Perna", "Inferior", "Esquerda");
	        @SuppressWarnings("unused")
			Membros m2 = new Membros();

	        CorpoHumano ch1 = new CorpoHumano(2000, 390000, c1, m1);
	        CorpoHumano ch2 = new CorpoHumano();

	        ch1.batimentos();

	        // Exibe a representação de string do corpo humano
	        System.out.println("Corpo Humano 1:\n" + ch1.retornar());
	        System.out.println("\nCorpo Humano 2:\n" + ch2.retornar());
	    }
	}

