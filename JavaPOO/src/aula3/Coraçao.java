package aula3;


public class Coraçao {
    private double batimentosPorMinuto;

    public Coraçao(double batimentosPorMinuto) {
        this.batimentosPorMinuto = batimentosPorMinuto;
    }

    public Coraçao() {
        this.batimentosPorMinuto = 70.0; 
    }

   
    public double getBatimentosPorMinuto() {
        return batimentosPorMinuto;
    }

    public void setBatimentosPorMinuto(double batimentosPorMinuto) {
        this.batimentosPorMinuto = batimentosPorMinuto;
    }

    public String retornar() {
        return "Batimentos por Minuto: " + batimentosPorMinuto;
    }
}

