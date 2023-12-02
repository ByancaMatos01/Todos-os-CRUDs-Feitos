package davi;

public class Pessoa {
	 private String nome;
	    private int idade;
	    private int CPF;

	    public Pessoa(String nome, int idade, int CPF) {
	        this.CPF = CPF;
	        this.idade = idade;
	        this.nome=nome;
	    }

	    public void trabalhar() {
	        System.out.println("Olá, meu nome é " + nome +  " e tenho " + idade + " anos."+ "seu CPF é "+CPF);
	    }
	}

