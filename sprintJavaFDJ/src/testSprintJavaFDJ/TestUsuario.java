package testSprintJavaFDJ;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sprintJavaFDJ.Usuario;

public class TestUsuario {

	private final Usuario usuario = new Usuario();
	String rptaCorrecta;
	String rptaIncorrecta;
	
	@Test 
	public void testObtenerFechaNac() {
		int dia = 20;
		int mes = 7;
		int anio = 1997;
		
		rptaCorrecta = usuario.obtenerFechaNac();
		assertEquals(dia + "/" + mes + "/" + anio, rptaCorrecta);
		
	}
}
