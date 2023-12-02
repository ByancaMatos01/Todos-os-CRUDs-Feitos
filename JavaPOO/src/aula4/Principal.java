package aula4;

public class Principal {

	public static void main(String[] args) {
		Piloto piloto1= new Piloto("Everson", 45, "Masculino", "555425254A", "28/11/98", 10);
		Piloto piloto2 = new Piloto("Maria", 28, "Feminino", "PL456", "14/05/19",3);
	
		 Passageiro passageiro1 = new Passageiro("Carlos", 42, "Masculino", "PF789",3,45);
	      Passageiro passageiro2 = new Passageiro("Ana", 30, "Feminino", "PF012",5,10);
	
	      Aeroporto aeroporto1 = new Aeroporto("AREOPORTO A", "CIDADE SP", "ITAT005");
	        Aeroporto aeroporto2 = new Aeroporto("Aeroporto B", "Cidade B", "IATA002");
	
	      Aeronave aeronave1 = new Aeronave("Boeing 747", 400, "SN12345");
	       Aeronave aeronave2 = new Aeronave("Airbus A320", 200, "SN67890");
	
	       aeronave1.IniciarVoar();
	        piloto1.PilotarAeronave();
	        passageiro1.comprarPassagem();
	        aeroporto1.InformacoesAeroporto();
	
	}

}
