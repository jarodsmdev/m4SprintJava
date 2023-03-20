package testSprintJavaFDJ;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sprintJavaFDJ.Revision;

public class RevisionTest {

	private Revision revision;

	@BeforeClass
	public static void setUpClass() throws Exception {
		// Código para inicializar variables de clase, si es necesario
	}

	@Before
	public void setUp() throws Exception {
		revision = new Revision("Revisión de prueba", 1, "Detalles de prueba", 1);
	}

	
	@Test
	public void testGetIdVisita() {
		assertEquals(1, revision.getIdVisita());
	}

	@Test
	public void testSetNombreRevision() {
		revision.setNombreRevision("Nueva revisión");
		assertEquals("Nueva revisión", revision.getNombreRevision());
	}

	@Test
	public void testSetDetalleRevisar() {
		revision.setDetalleRevisar("Nuevos detalles");
		assertEquals("Nuevos detalles", revision.getDetalles());
	}

	@Test
	public void testSetEstado() {
		revision.setEstado(2);
		assertEquals(2, revision.getEstado());
	}

	@Test
	public void testMostrarResultadoRevision() {
		assertEquals("SIN PROBLEMAS", revision.mostrarResultadoRevision());
	}

}
