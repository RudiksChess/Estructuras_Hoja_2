import java.util.Arrays;

public class pruebitas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vector<Integer> pila = new Vector<Integer>();
		
		//pila.push(55); 
		//pila.push(40); 
		//System.out.println(pila.peek());
		//System.out.println(pila.index(0));
		
		//pila.pop();
		//pila.pop(); 
		//pila.push(95);
		
		//System.out.println(pila.size());
		//System.out.println(pila.index(0));
		
		
		//String input = "7 2 - 5 *";
		//String[] partido =input.split(" ",0);
		//System.out.println(Arrays.toString(partido));
		
		Calculadora elemento = new Calculadora(); 
		double str = elemento.resolver("4 2 * 5 - 5 * &");
		System.out.println(str);
		
	}

}
