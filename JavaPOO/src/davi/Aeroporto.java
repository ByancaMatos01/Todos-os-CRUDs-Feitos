package davi;

public class Aeroporto {
    private String nome;
    private String cidade;
    private String pais;

    public Aeroporto(String nome, String cidade, String pais) {
        this.nome = nome;
        this.cidade = cidade;
        this.pais=pais;
    }

    public void aterrisar() {
        System.out.println("Aeroporto operando aterrisagem do aviao...");
    }
}
