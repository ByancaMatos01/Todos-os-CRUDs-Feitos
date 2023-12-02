package aula02;

class Livro {
 
    String titulo;
    String autor;
    int anoPublicacao;
    int numeroPaginas;
    boolean emprestado;

   
    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.emprestado = false;
    }


    void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro foi emprestado.");
        } else {
            System.out.println("O livro ja esta emprestado.");
        }
    }

    void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro foi devolvido.");
        } else {
            System.out.println("O livro nao esta emprestado no momento.");
        }
    }

    void ler() {
        System.out.println("Voce esta lendo o livro: " + titulo);
    }
}
