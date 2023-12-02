package aula02;

class Bolsa {
    // Características
    String material;
    String cor;
    int tamanho;
    double preco;
    String marca;

    // Construtor
    public Bolsa(String material, String cor, int tamanho, double preco, String marca) {
        this.material = material;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
        this.marca=marca;
        
    }

    // Comportamentos
    void abrir() {
        System.out.println("A bolsa esta sendo aberta.");
    }

    void fechar() {
        System.out.println("A bolsa esta sendo fechada.");
    }

    void carregar() {
        System.out.println("A bolsa esta  carregada com itens.");
    }
}