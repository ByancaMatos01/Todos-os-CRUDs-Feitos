package Aula01;

import java.util.Scanner;

public class somadoisnumeros {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia=new Scanner (System.in);
		double n1,n2, soma;
		System.out.println("Digite um numero: ");
		n1=leia.nextDouble();
		System.out.println("Digite o segundo Numero: ");
		n2=leia.nextDouble();
		soma=(n1+n2);
		System.out.println("A soma e "+ soma);
		

	}

}
