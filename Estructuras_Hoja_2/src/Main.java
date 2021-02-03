
import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class Main {
    public static void main(String args[]){
        Calculadora calculadora = new Calculadora();
        try {
      File myObj = new File("datos.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(calculadora.resolver(data));
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    }
}
