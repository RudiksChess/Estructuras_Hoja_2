import java.util.Arrays;

public class pruebitas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String input = "7 2 - 5 *";
		//String[] partido =input.split(" ",0);
		//System.out.println(Arrays.toString(partido));
		
		Calculadora elemento = new Calculadora(); 
		double str = elemento.resolver("7 2 - 5 *");
		System.out.println(str);
		
	}

}
