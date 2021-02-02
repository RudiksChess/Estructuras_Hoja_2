
public class Seguridad {
	
	private String elementos;

	public Seguridad(String elementos) {
		this.elementos = elementos;
	} 
	
	public int Verificador() {
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
	

}
