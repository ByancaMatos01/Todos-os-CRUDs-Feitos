package davi;

public class Piloto extends Pessoa {
    private String licenca;
    private int horasVoou;
    int expereiencia;

    public Piloto(String nome, int idade, int CPF,  String licenca, int horasVoou, int experiencia) {
        super(nome, idade, CPF );
        this.licenca=licenca;
        this.horasVoou=horasVoou;
        this.expereiencia=experiencia;
    }

    public void pilotar() {
        System.out.println("Piloto esta pilotando aeronave...");
    }
}