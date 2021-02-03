/**
	@author Rudik Roberto Rompich Cotzojay
	@version 1.0 
	Hoja 2 - Algoritmos y Estrucutras de Datos 
	Se trabajó individualmente.
	*/
import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class Main {
    public static void main(String args[]){
    	
      Calculadora calculadora = new Calculadora();
        try {
        	
      File base = new File("datos.txt");
      Scanner lector = new Scanner(base);
      while (lector.hasNextLine()) {
        String data = lector.nextLine();
        System.out.println(calculadora.resolver(data));
      }
      
      lector.close();
    } catch (FileNotFoundException e) {
      System.out.println("Un error desconocido ha sido detectado.");
      e.printStackTrace();
    }

    }
}
