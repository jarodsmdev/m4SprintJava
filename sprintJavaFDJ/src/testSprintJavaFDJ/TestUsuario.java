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

		usuario.setFechaNacimiento("20/07/1988");
		assertEquals("20/07/1988",usuario.getFechaNacimiento());
	}
}
