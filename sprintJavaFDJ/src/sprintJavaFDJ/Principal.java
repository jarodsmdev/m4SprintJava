package sprintJavaFDJ;

import java.util.ArrayList;

public class Principal {

	static ListaUsuarios listaUsuarios = new ListaUsuarios();
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// usuario de prueba
//		Usuario usuario = new Usuario("mundenius", "20/07/1997", 12345678);
//		ListaUsuarios.agregarUsuario(usuario);
//		lista1.mostrarUsuarios();
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
							"\n\t9. SALIR\n"
							);
		
		
		
		String capturador = Utilidades.ingresar("Ingrese opción a ejecutar: ");
		int opcion = Integer.parseInt(capturador);
		switch(opcion) {
			case 1:
				Utilidades.escribir("Usuario");
				crearUsuario();
				break;
			case 2:
				Utilidades.escribir("Cliente");
				crearCliente();
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
				System.exit(0);
				break;
			default:
				Utilidades.escribir("[!] Opción No Válida.");
		}
	}
	
	public static void crearUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(Utilidades.ingresar("Ingrese el nombre de Usuario"));
		usuario.setFechaNacimiento(Utilidades.ingresar("Ingrese la fecha de nacimiento [dd/mm/aaaa]"));
		usuario.setRut(Long.parseLong(Utilidades.ingresar("Ingrese el RUT del Usuario")));
		listaUsuarios.agregarUsuario(usuario);
		Utilidades.escribir("El Usuarios ha sido guardado exitosamente");
		listaUsuarios.mostrarUsuarios();
		}
	
	public static void crearCliente() {
		String capturador = Utilidades.ingresar("Ingrese el RUT del Cliente");
		
		if(Long.parseLong(respuesta) ==  Usuario.getRun()) { //cuando este listo el crear usuario hay q arreglar esta condicion
			Cliente cliente = new Cliente();
			cliente.setNombre(Utilidades.ingresar("Ingrese el nombre del cliente"));
			cliente.setApellido(Utilidades);
		}
		else {
			Utilidades.escribir("El RUT no corresponde a ningun Usuario; cree un Usuario primero para continuar");
		}
	}

}
