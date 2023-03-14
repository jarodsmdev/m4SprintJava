package sprintJavaFDJ;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuPrincipal();
	}
	
	public static void menuPrincipal() {
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
				break;
			case 2:
				Utilidades.escribir("Cliente");
				break;
			case 3:
				Utilidades.escribir("Profesional");
				break;
			case 4:
				Utilidades.escribir("Administrativo");
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
}
