package DinoDavi;

import java.util.Scanner;

public class JogoDinossauro {
	public static void main(String[] args) {
        Dinossauro skeep = new Dinossauro();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println(skeep);
            System.out.println("Escolha uma opção: ");
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
                    System.out.println("Opção inválida.");
            }
        }
    }
}

