package DinoDavi;

class Dinossauro {
    private int energia;
    private int velocidade;
    private int temperatura;
    private String humor;

    public Dinossauro() {
        this.energia = 100;
        this.velocidade = 50;
        this.temperatura = 25;
        this.humor = "feliz";
    }

    public void pular() {
        this.energia -= 10;
        this.velocidade -= 5;
        this.humor = "feliz";
    }

    public void correr() {
        this.energia -= 20;
        this.velocidade -= 10;
        this.humor = "feliz";
    }

    public void comer() {
        this.energia += 30;
        this.velocidade -= 10;
        this.humor = "feliz";
    }

    public void cantar() {
        this.energia -= 15;
        this.humor = "feliz";
    }

    public void tomarSol() {
        this.velocidade += 10;
        this.temperatura += 5;
        this.humor = "feliz";
    }

    public void ficarNaSombra() {
        this.energia += 20;
        this.humor = "triste";
        this.temperatura -= 5;
    }

    @Override
    public String toString() {
        return "Energia: " + this.energia + ", Velocidade: " + this.velocidade + ", Temperatura: " + this.temperatura + ", Humor: " + this.humor;
    }
}

