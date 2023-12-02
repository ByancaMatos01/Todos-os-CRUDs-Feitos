package aula02;

public class instanciaBolsa {
public static void main(String[] args) {
	Bolsa prada= new Bolsa("Prada Double Bag", "preta", 15, 12.600,"prada");
	prada.abrir();
	prada.carregar();
	prada.fechar();
	System.out.println("========================================================");
	Bolsa gucci=new Bolsa("Soho","Caramelho",20, 20.000,"gucci");
	gucci.abrir();
	gucci.carregar();
	gucci.fechar();
	
}
}
