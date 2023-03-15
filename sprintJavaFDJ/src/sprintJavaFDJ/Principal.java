package sprintJavaFDJ;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		menuPrincipal();
	}
	
	public static void menuPrincipal() {
		Contenedor contenedor = new Contenedor();
		
		
		Utilidades.escribir("\t--MENÚ PRINCIPAL--");
		
		Utilidades.escribir("\n\t1. CREAR USUARIO" +
							"\n\t2. CREAR CLIENTE" +
							"\n\t3. CREAR PROFESIONAL" +
							"\n\t4. CREAR ADMINISTRATIVO" +
							"\n\t5. CREAR CAPACITACIÓN" +
							"\n\t6. CREAR ACCIDENTE" +
							"\n\t7. CREAR VISITA EN TERRENO" +
							"\n\t8. CREAR REVISIÓN" +
							"\n\t9. CREAR SALIR\n"
							);
		
		
		
		String capturador = Utilidades.ingresar("Ingrese opción a ejecutar: ");
		int opcion = Integer.parseInt(capturador);
		switch(opcion) {
			case 1:
				Utilidades.escribir("Usuario");
				Utilidades.ingresar("hohlhl");
				break;
			case 2:
				Utilidades.escribir("Cliente");
				break;
			case 3:
				Utilidades.escribir("Profesional");
				break;
			case 4:
				Utilidades.escribir("Administrativo");
				crearAdministrador(contenedor);
				break;
			case 5:
				Utilidades.escribir("Capacitación");
				break;
			case 6:
				Utilidades.escribir("Accidente");
				break;
			case 7:
				Utilidades.escribir("Visita en Terreno");
				break;
			case 8:
				Utilidades.escribir("Revisión");
				break;
			case 9:
				Utilidades.escribir("SALIR");
				break;
			default:
				Utilidades.escribir("[!] Opción No Válida.");
		}
	}
	public static void crearAdministrador (Contenedor contenedor) {
		
		Administrativo administrativo = new Administrativo();
		
		administrativo.setNombreUsuario(Utilidades.ingresar("Ingresa nombre del Usuario"));
		administrativo.setArea(Utilidades.ingresar("Ingresa Area"));
		administrativo.setExpPrevia(Utilidades.ingresar("Ingrese experiencia previa"));
		administrativo.setRut(Long.parseLong(Utilidades.ingresar("Ingrese rut")));
		administrativo.obtenerFechaNac();
		
//		String nombreUsuario, String area, String expPrevia, String nombreuser, String fechaN, int run
//		String nUsuario = Utilidades.ingresar("Ingresa nombre del Usuario");
//		String area =Utilidades.ingresar("Ingresa Area");
//		String exPrevia = Utilidades.ingresar("Ingrese experiencia previa");
//		String nombreUser = Utilidades.ingresar("Ingrese nombre del Administrador");
//		String fechaN = Utilidades.ingresar("Ingrese fecha de nacimiento");
//		int run = Integer.parseInt(Utilidades.ingresar("Ingrese rut"));
////		
//	Administrativo administrativo = new Administrativo(nUsuario, area, exPrevia, nombreUser, fechaN, run);
	
	contenedor.almacenarAdministrativo(administrativo);
	contenedor.listarUsuarios();
	contenedor.toString();
	}
}
