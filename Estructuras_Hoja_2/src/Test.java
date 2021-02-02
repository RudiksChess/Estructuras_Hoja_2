import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
			Seguridad test = new Seguridad("+12 44  2*/+");
			int respuesta = test.Verificador(); 
			assertEquals(1,respuesta);
			
	}

}
