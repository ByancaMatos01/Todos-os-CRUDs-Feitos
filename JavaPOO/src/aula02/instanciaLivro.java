package aula02;

	public class instanciaLivro {
		public static void main(String[] args) {
			Livro livro1= new Livro ("1984", "George Orweel", 1949, 324);
			livro1.emprestar();
			livro1.ler();
			livro1.devolver();
			System.out.println("=====================================================");
			Livro book2= new Livro("Cool for the summer","Dahlia Adler",284,2021);
			book2.emprestar();
			book2.ler();
			book2.devolver();


		}
}
