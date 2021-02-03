
public class Calculadora implements Icalculadora{
	
	private int Verificador(String elementos) {
		int verificador =1; 
		
		for(int i=0; i<elementos.length();i++) {
			char e = elementos.charAt(i);
			String c=String.valueOf(e);
			
			if (c.equals("0")  | c.equals("1") | c.equals("2") |
				c.equals("3")  | c.equals("4") | c.equals("5") |
				c.equals("6")  | c.equals("7") | c.equals("8") | 	
				c.equals("9") | c.equals("+")| c.equals("-")|c.equals("*") | c.equals("/") | c.equals(" ")    )   {
				verificador=1 ;		 
			}
			
			else {
				verificador = 0;
				break;
			}
	
		}
			
		
		
		if (verificador==1) {
			return 1;
		}
		
		else {
			return 0;
			}
	}

	@Override
	public double resolver(String input) {
		
		int verificador = Verificador(input);
		Vector<Integer> pila = new Vector<Integer>();
		
		if (verificador == 0) {
	        throw new IllegalArgumentException("Es un valor que tiene símbolos no reconocidos");
	    }
		
		else {
			
			String[] partido =input.split(" ",0);
			
			for(int i=0; i<partido.length;i++) {
				String c=partido[i];
				boolean isNumeric = c.chars().allMatch( Character::isDigit );
				
				if (isNumeric== true) {
					pila.push(Integer.parseInt(c));
				}
				
				else{
					
				int primero= pila.index(i-1);		
				int segundo= pila.index(i-2);		
				
				switch (c) {
				case "+":
					pila.pop();
					pila.pop();
					pila.push(segundo+primero);
					break;
				case "-":
					pila.pop();
					pila.pop();
					pila.push(segundo-primero);
					break;
				case "/":
					pila.pop();
					pila.pop();
					pila.push(segundo/primero);
					break;
				case "*":
					pila.pop();
					pila.pop();
					pila.push(segundo*primero);
					break;
				}
				
				
				}
				
				
			}
			
			return (double) pila.index(0);
			
			}
			
	}
	


}
