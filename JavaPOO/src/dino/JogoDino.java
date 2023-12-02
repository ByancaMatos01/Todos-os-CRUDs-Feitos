package dino;

import java.util.Scanner;

public class JogoDino {

	public static void main(String[] args) {
		  Dino skeep = new Dino();
			Scanner scan = new Scanner(System.in);

	        while (true) {
	            System.out.println(skeep);
	            System.out.println("Escolha uma opcao: ");
	            System.out.println("(P)ular    (C)orrer    Co(M)er    C(A)ntar    Tomar (S)ol    Ficar na S(O)mbra");

	            String textoMaiusculo = scan.nextLine().toUpperCase();
	            char letra = textoMaiusculo.charAt(0);

	            switch (letra) {
	                case 'P':
	                    skeep.pular();
	                    break;
	                case 'C':
	                    skeep.correr();
	                    break;
	                case 'M':
	                    skeep.comer();
	                    break;
	                case 'A':
	                    skeep.cantar();
	                    break;
	                case 'S':
	                    skeep.tomarSol();
	                    break;
	                case 'O':
	                    skeep.ficarNaSombra();
	                    break;
	                default:
	                    System.out.println("Opcao invalida.");
	            }
	        }
	    }
	}


