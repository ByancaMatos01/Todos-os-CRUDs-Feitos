package Aula01;

public class estoura {

	public static void main(String[] args) {
		estoraRecursiva(100);

	}

	private static void estoraRecursiva(int i) {
		System.out.println("vai estourar"+i);
		estoraRecursiva(i+4);
		
	}

}
