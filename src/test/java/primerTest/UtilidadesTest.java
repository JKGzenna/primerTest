package primerTest;

import org.junit.Assert;
import org.junit.Test;

public class UtilidadesTest {
	
	//todos los test en junit deben ser publicos y no devolver nada
	@Test
	public void testConcatenar () {
		//instanciar la clase a probar
		Utilidades utilidades = new Utilidades();
		//ejecutar el método a probar
		String resultado = utilidades.concatenar("Hola", "Sopra");
		
		//validaciones OJO A LA IMPORTACION DEL ASSERT, HA DE SER EL DE ORG.JUNIT
//		Assert.assertEquals("HolaSopra", resultado);
//		Assert.assertEquals("Hola Sopra", resultado);
		
		//podemos meter un primer parametro que lo tomara como mensaje de error mas claro
		Assert.assertEquals("Las cadenas son diferentes","HolaSopra", resultado);
	}
		
	@Test
	public void testConcatenarFallo () {
			
		Utilidades utilidades = new Utilidades();
		String resultado = utilidades.concatenar("Hola", "Sopra");
		Assert.assertEquals("Las cadenas son diferentes","Hola Sopra", resultado);
	}
			
	@Test
	public void testConcatenarError () {
				
		Utilidades utilidades = new Utilidades();
		String resultado = utilidades.concatenar(null, "Sopra");
		Assert.assertEquals("Las cadenas son diferentes","Hola Sopra", resultado);
		
	}
	

}
