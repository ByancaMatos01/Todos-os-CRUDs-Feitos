package aula02;

class Fruta {
    // Características
    String nome;
    String cor;
    boolean doce;
    boolean temCasca;
    boolean possuiVitaminas;

    // Construtor
    public Fruta(String nome, String cor, boolean doce, boolean temCasca, boolean possuiVitaminas) {
        this.nome = nome;
        this.cor = cor;
        this.doce = doce;
        this.temCasca = temCasca;
        this.possuiVitaminas = possuiVitaminas;
    }

    // Comportamentos
    void lavar() {
        System.out.println("A fruta esta sendo lavada.");
    }

    void descascar() {
        if (temCasca) {
            System.out.println("A casca da fruta esta sendo removida.");
        } else {
            System.out.println("Essa fruta nao possui casca.");
        }
    }

    void consumir() {
        System.out.println("A fruta esta sendo consumida.");
    }
}

