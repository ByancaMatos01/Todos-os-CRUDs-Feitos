package Aula01;
import java.util.ArrayList;
import java.util.List;

public class HeapOverflowExample {
    public static void main(String[] args) {
    	System.out.println("Digite numeros ate estourar memoria : ");
        List<Object> list = new ArrayList<>();
        
        try {
            while (true) {
                list.add(new Object());
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Ocorreu um erro de falta de memoria!");
            System.out.println("Numero de objetos adicionados à lista:" + list.size());
        }
    }
}

