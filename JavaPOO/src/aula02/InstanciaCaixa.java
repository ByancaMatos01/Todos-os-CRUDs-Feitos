package aula02;

import java.util.Scanner;

public class InstanciaCaixa {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia=new Scanner(System.in);
		Caixa caixa1=new Caixa();
		System.out.println("Informe o valor do  seu Saldo: ");
		caixa1.saldo=leia.nextDouble();
		caixa1.Venda(100);
		System.out.println(" A venda do produto 1 Saldo apos a venda: " + caixa1.saldo);
	}

}
