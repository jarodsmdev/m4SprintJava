package test;

/**

La clase VisitaEnTerrenoTest contiene pruebas unitarias para la clase VisitaEnTerreno.
*/

import sprintJavaFDJ.VisitaEnTerreno;
import sprintJavaFDJ.Revision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class VisitaEnTerrenoTest {

	private VisitaEnTerreno visita;

	@BeforeEach
	void setUp() {
		visita = new VisitaEnTerreno();
	}

	@Test
	void testIdentificador() {
		Assertions.assertEquals(1, visita.getIdentificador());
		visita.setIdentificador(2);
		Assertions.assertEquals(2, visita.getIdentificador());
	}

	@Test
	void testRutCliente() {
		Assertions.assertEquals(0, visita.getRutCliente());
		visita.setRutCliente(123456789);
		Assertions.assertEquals(123456789, visita.getRutCliente());
	}

	@Test
	void testDia() {
		visita.setDia("31/12/2022");
		Assertions.assertEquals("31/12/2022", visita.getDia());
		visita.setDia("29/02/2021"); // Fecha no valida
		Assertions.assertNotEquals("29/02/2021", visita.getDia());
	}

	@Test
	void testHora() {
		visita.setHora("09:30");
		Assertions.assertEquals("09:30", visita.getHora());
		visita.setHora("24:00"); // Hora no valida
		Assertions.assertNotEquals("24:00", visita.getHora());
	}

	@Test
	void testLugar() {
		visita.setLugar("Oficina");
		Assertions.assertEquals("Oficina", visita.getLugar());
		visita.setLugar("Lugar con menos de 10 caracteres"); // Lugar no valido
		Assertions.assertNotEquals("Lugar con menos de 10 caracteres", visita.getLugar());
	}

	@Test
	void testComentarios() {
		visita.setComentarios("Comentario");
		Assertions.assertEquals("Comentario", visita.getComentarios());
		visita.setComentarios("Comentario con mas de 100 caracteres, deberia dar error"); // Comentario no valido
		Assertions.assertNotEquals("Comentario con mas de 100 caracteres, deberia dar error", visita.getComentarios());
	}

	@Test
	void testAgregarRevision() {
		Revision revision = new Revision();
		visita.agregarRevision(revision);
		ArrayList<Revision> revisiones = visita.getRevisiones();
		Assertions.assertEquals(1, revisiones.size());
		Assertions.assertEquals(revision, revisiones.get(0));
	}
}
