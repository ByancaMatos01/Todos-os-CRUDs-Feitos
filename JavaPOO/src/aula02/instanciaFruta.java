package aula02;

public class instanciaFruta {
       public static void main (String[]args) {
	 Fruta pera= new Fruta("Pera", "amarela-esverdeada", true, true, true);
	 pera.lavar();
	 pera.descascar();
	 pera.consumir();
	 System.out.println("=============================================================");
	 Fruta carambola=new Fruta("Carambola","verde",true,true,true);
	 carambola.lavar();
	 carambola.descascar();
	 carambola.consumir();
	
 }
       
}
