package aula4;

public class Aeroporto {
	 String nome;
	    String localizacao;
	    String codigoIATA;
	    
	    public Aeroporto( String nome, String localização, String codigoIATA ) {
	    	this.nome=nome;
	    	this.codigoIATA=codigoIATA;
	    	this.localizacao=localização;
	    	
	  
	    }
	    void InformacoesAeroporto() {
	    	
	    	System.out.println("Nome do Aeroporto: " + nome);
	        System.out.println("Localização: " + localizacao);
	        System.out.println("Código IATA: " + codigoIATA);
	    	
	    }
}
