package aula02;

public class Caixa2 {
	 double saldo;
	  
	  public double Venda(double... Produto) {		
		  for( double Produto1: Produto) {
			  saldo+=Produto1;
		  }
			return saldo;	
		}
	  
}
