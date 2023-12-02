package Aula01;

import java.text.NumberFormat;
import java.util.Scanner;

public class Caracteres_diversos {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		String nome_empresa;
		System.out.println("Digite o nome da empresa: ");
		nome_empresa=leia.next();
		
		if(nome_empresa.length() <=25) {
			System.out.println("Nome da empresa e a: "+ nome_empresa);
		}else {
			while(nome_empresa.length() >25) {
		System.out.println("Digite novamente o nome da empresa com no maximo 25 caracteres !");
		nome_empresa=leia.next();
		
			}
			System.out.println("Nome da empresa e: "+ nome_empresa);
			System.out.println("============================================");
		}
		
		salariosmes();
		faturamento();
		notas();
		carros();
		ouromatematica();
		nomesAlunos();
		paresSapato();
		

	}
	
	public static void salariosmes() {
		Scanner leia=new Scanner(System.in);
		double valorsalario;
		System.out.println("Total de salarios pagos no mes: ");
		valorsalario=leia.nextDouble();
		NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance();
        String valorFormatado = formatoMoeda.format(valorsalario); 
        System.out.println("O valor total dos salarios pagos no mes e:" + valorFormatado);
	System.out.println("=====================================================================");
		
	}
	public static void faturamento() {
		int diasFaturamento = 30;
		System.out.println("Os dias de faturamento e "+ diasFaturamento);
		System.out.println("===================================================================");
	}

	public static void notas() {
		Scanner leia=new Scanner (System.in);
		
		double [] notas= new double [2];
		
		for (int i=0; i<notas.length; i++) {
			System.out.println("Digite as notas: ");
			notas[i]=leia.nextDouble();
			
		}
		for (int i=0; i< notas.length; i++) {
		System.out.println("As notas foram "+ notas[i]);
		System.out.println("=========================================================================");
		}
	}
	public static void carros() {
		Scanner leia=new Scanner(System.in);
		String nome, cor, modelo,placa, chassi;
		int ano;
		
		System.out.println("Digite o nome  do dono que levou a multa : ");
		nome=leia.next();
		
		System.out.println("Digite a Placa do carro: ");
		placa=leia.next();
		
		System.out.println("Digite a chassi do carro: ");
		chassi=leia.next();
		
		System.out.println("Digite  o modelo do carro: ");
		modelo=leia.next();
		
		System.out.println("Digite o ano do carro: ");
		ano=leia.nextInt();
		
		System.out.println("Digite a cor do carro: ");
		cor=leia.next();
		
		
		System.out.println("AS INFORMAÇOES CADASTRDAS FORAM =========================");
		System.out.printf( "dono e  "+ nome + "  " +placa +"  "+ chassi + "  "+ modelo +" "+ ano+ " " + " "+ cor);
		System.out.println("==============================================================================================");
	}
	public static void ouromatematica() {
		Scanner leia=new Scanner(System.in);
		float numeroOuro;
		System.out.println("Digite o numero  do ouro na matematica: ");
		numeroOuro=leia.nextFloat();
		
	}
	public static void nomesAlunos() {
        Scanner leia=new Scanner (System.in);
		
        String[] nomesAlunos = new String[10];
		
		for (int i=0; i<nomesAlunos.length; i++) {
			System.out.println("Digite as nomes: ");
			nomesAlunos[i]=leia.next();
			
		}
		for (int i=0; i< nomesAlunos.length; i++) {
		System.out.println("As nomes dos alunos são "+ nomesAlunos[i]);
		System.out.println("=========================================================================");
		}
	}
	private static void paresSapato() {
		
		 Scanner leia = new Scanner(System.in);
	        
	        System.out.print("Digite a quantidade de pares de sapatos: ");
	        int quantidadeParesSapato = leia.nextInt();
	        
	        System.out.println("Você possui " + quantidadeParesSapato + " pares de sapatos.");
	    }
		
	}
		
	
	
	
	



