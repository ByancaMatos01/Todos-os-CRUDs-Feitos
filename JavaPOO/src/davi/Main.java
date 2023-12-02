package davi;

public class Main {
    public static void main(String[] args) {
        Aeronave aviao1 = new Aeronave("Boeing 737", 150, 900);
        Aeronave aviao2 = new Aeronave("Airbus A320", 200, 850);

        Piloto piloto1 = new Piloto("João", 30, 123456789, "12345",7,7);
        Piloto piloto2 = new Piloto("Maria", 35,222222222, "67890",5,10);

        Passageiro passageiro1 = new Passageiro("Carlos", 25, 333333333, "economica",12,6);
        Passageiro passageiro2 = new Passageiro("Ana", 28,    55555555,"executiva",5,6);

        Aeroporto aeroporto1 = new Aeroporto("Aeroporto Internacional", "São Paulo", "BRASIL");
        Aeroporto aeroporto2 = new Aeroporto("Aeroporto Internacional", "Nova York", "EUA");

        // Associações
        piloto1.trabalhar();
        piloto1.pilotar();
        aviao1.voar();

        passageiro1.trabalhar();
        passageiro1.comprarBilhete();
        aeroporto1.aterrisar();
    }
}
 