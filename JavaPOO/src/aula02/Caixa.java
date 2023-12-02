package aula02;
/*
 * Crie uma classe chamada Caixa que faça venda de produtos, conforme o layout em anexo. 
 * A função da venda deverá acrescer o valor do produto no saldo, e deverá retornar o valor do novo saldo
 * Faça também uma classe para testes que instancie o objeto Caixa e invoque a função venda.
 */
public class Caixa {
	  double saldo;
	  
	  public double Venda(double Produto) {		
			saldo+=Produto;
			return saldo;	
		}
	  

	}

