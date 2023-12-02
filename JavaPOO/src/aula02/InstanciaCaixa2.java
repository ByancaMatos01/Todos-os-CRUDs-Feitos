package aula02;

import java.util.Scanner;

public class InstanciaCaixa2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia=new Scanner(System.in);
		Caixa2 caixa1=new Caixa2();
		System.out.println("Informe o valor do  seu Saldo: ");
		caixa1.saldo=leia.nextDouble();
		caixa1.Venda(100.2,33.5,25.8,45.1,10.9);
		System.out.println(" A venda do produto 1 Saldo apos a venda: " + caixa1.saldo);
	}

}


