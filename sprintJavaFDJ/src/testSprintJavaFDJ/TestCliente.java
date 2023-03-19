package testSprintJavaFDJ;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sprintJavaFDJ.Cliente;

public class TestCliente{
	private final Cliente cliente = new Cliente();
	String rptaCorrectaFONASA;
	String rptaCorrectaISAPRE;
	@Test 
	public void testObtenerSistemaSalud() {
		int fonasa = 1;
		int isapre = 2;
		rptaCorrectaFONASA = cliente.obtenerSistemaSalud(fonasa);
		rptaCorrectaISAPRE = cliente.obtenerSistemaSalud(isapre);
		assertEquals("FONASA", rptaCorrectaFONASA);
		assertEquals("ISAPRE",rptaCorrectaISAPRE );
		
	}
	
}
