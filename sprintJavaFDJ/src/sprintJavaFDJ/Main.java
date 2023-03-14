package sprintJavaFDJ;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario usuario1 = new Usuario();
		
		Cliente cliente1 = new Cliente();
		
		Capacitacion cap1 = new Capacitacion();
		
		cliente1.setNombreUsuario("madness");
		cliente1.setRut(19616866);
		cliente1.setNombre("Loui");
		cliente1.setApellido("Vuitton");
		
		cliente1.mostrarCantCapacitaciones();
	}

}
