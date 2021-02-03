import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
			Calculadora test = new Calculadora();
			
			int respuesta = (int) test.resolver("4 1+"); 
			assertEquals(19,respuesta);
	}

}
