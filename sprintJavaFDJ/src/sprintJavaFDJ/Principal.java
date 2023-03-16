package sprintJavaFDJ;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contenedor contenedor = new Contenedor();
		menuPrincipal(contenedor);
	}
	
	public static void DebugMode(Contenedor contenedor) {
		Usuario usuario1 = new Usuario();
		usuario1.setNombreUsuario("SOY DE TIPO USUARIO1");
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("SOY DE TIPO CLIENTE1");
		cliente1.setApellido("SOY APELLIDO DE CLIENTE1");
		cliente1.setRut(123456);
		cliente1.setDireccion("DIRECCION CLIENTE");
		cliente1.setComuna("COMUNA CLIENTE");
		Administrativo administrativo1 = new Administrativo();
		administrativo1.setNombreUsuario("SOY DE TIPO ADMINISTRATIVO1");
		Profesional profesional1 = new Profesional();
		profesional1.setNombreUsuario("SOY DE TIPO PROFESIONAL1");
		
		contenedor.almacenarUsuario(usuario1);
		contenedor.almacenarCliente(cliente1);
		contenedor.almacenarAdministrativo(administrativo1);
		contenedor.almacenarProfesional(profesional1);
		contenedor.almacenarProfesional(profesional1);
	}
	
	public static void menuPrincipal(Contenedor contenedor) {
		
		//DATOS DE PRUEBA
		DebugMode(contenedor);
		
		String capturador;
		do{
			Utilidades.escribir("\n\t--MENÚ PRINCIPAL--\n");
			
			Utilidades.escribir("\n\t1. CREAR USUARIO" +
								"\n\t2. CREAR CLIENTE" +
								"\n\t3. CREAR PROFESIONAL" +
								"\n\t4. CREAR ADMINISTRATIVO" +
								"\n\t5. CREAR CAPACITACIÓN" +
								"\n\t6. CREAR ACCIDENTE" +
								"\n\t7. CREAR VISITA EN TERRENO" +
								"\n\t8. CREAR REVISIÓN" +
								"\n\t9. SALIR\n\n"
								);
			
			capturador = Utilidades.ingresar("Ingrese opción a ejecutar: ");
	
			switch(capturador) {
				case "1":
					Utilidades.escribir("\n\t-- CREACIÓN DE USUARIO --\n\n");
					crearUsuario(contenedor);
					break;
				case "2":
					Utilidades.escribir("\n\t-- CREACIÓN DE CLIENTE --\n\n");
					crearCliente(contenedor);
					break;
				case "3":
					Utilidades.escribir("\t-- CREACIÓN DE PROFESIONAL --\n\n");
					break;
				case "4":
					Utilidades.escribir("\t-- CREACIÓN DE ADMINISTRATIVO --\n\n");
					crearAdministrador(contenedor);
					break;
				case "5":
					Utilidades.escribir("\t-- CREACIÓN DE CAPACITACIÓN --\n\n");
					crearCapacitacion(contenedor);
					break;
				case "6":
					Utilidades.escribir("\t-- INGRESO DE ACCIDENTE --\n\n");
					break;
				case "7":
					Utilidades.escribir("\t-- ESTABLECER VISITA EN TERRENO --\n\n");
					break;
				case "8":
					Utilidades.escribir("\t-- REVISIONES --\n\n");
					break;
				case "9":
					Utilidades.escribir("\t-- CERRANDO EL SISTEMA --\n\n");
					System.exit(0);
					break;
				default:
					Utilidades.escribir("[!] OPCIÓN INGRESADA NO ES VÁLIDA, SÓLO INGRESE VALORES ENTRE 1 AL 9.\n\n");
			}
		}while(!capturador.matches("^[1-9]$"));
	}

	public static void crearAdministrador (Contenedor contenedor) {
		
		Administrativo administrativo = new Administrativo();
		
		administrativo.setNombreUsuario(Utilidades.ingresar("Ingresa nombre del Usuario:"));
		administrativo.setArea(Utilidades.ingresar("Ingresa Área:"));
		administrativo.setExpPrevia(Utilidades.ingresar("Ingrese experiencia previa:"));
		administrativo.setRut(Long.parseLong(Utilidades.ingresar("Ingrese RUT:")));
		administrativo.setFechaNacimiento(Utilidades.ingresar("Ingrese la fecha de nacimiento [dd/mm/aaaa]:"));
		
		contenedor.almacenarAdministrativo(administrativo);
		Utilidades.escribir("Personal Administrativo ha sido guardado exitosamente");
		contenedor.listarUsuarios();
		
		//INVOCAR AL MENÚ PARA MANTENER EL LOOP
		menuPrincipal(contenedor);

	}
	
	public static void crearUsuario(Contenedor contenedor) {

		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(Utilidades.ingresar("Ingrese el nombre de Usuario:"));
		usuario.setFechaNacimiento(Utilidades.ingresar("Ingrese la fecha de nacimiento [dd/mm/aaaa]:"));
		usuario.setRut(Long.parseLong(Utilidades.ingresar("Ingrese el RUT del Usuario:")));

		//listaUsuarios.agregarUsuario(usuario);
		
		contenedor.almacenarUsuario(usuario);
		Utilidades.escribir("El Usuario ha sido guardado exitosamente");
		//listaUsuarios.mostrarUsuarios();
		contenedor.listarUsuarios();
		
		
		//INVOCAR AL MENÚ PARA MANTENER EL LOOP
		menuPrincipal(contenedor);
		}

	public static void crearCliente(Contenedor contenedor) {
		//VALIDAR QUE EL CONTENIDO DE capturador sea tipo long
		long capturador = Long.parseLong(Utilidades.ingresar("Ingrese el RUT del Cliente"));
		
		//VERIFICA QUE NO PUEDA INGRESAR RUT DUPLICADOS
		if(!contenedor.existeUsuario(capturador)) {
			Cliente cliente = new Cliente();
			cliente.setNombre(Utilidades.ingresar("Ingrese el nombre del cliente"));
			cliente.setApellido(Utilidades.ingresar("Ingrese el apellido del cliente"));
			cliente.setTelefono(Integer.parseInt(Utilidades.ingresar("Ingrese numero de telefono")));
			cliente.setAfp(Utilidades.ingresar("Ingrese AFP"));
			String capChar = Utilidades.ingresar("Ingrese Sistema de Salud: 1 FONASA || 2 ISAPRE");
			cliente.setSistemaSalud(capChar.charAt(0));
			cliente.setDireccion(Utilidades.ingresar("Ingrese la dirección"));
			cliente.setComuna(Utilidades.ingresar("Ingrese la comuna"));
			cliente.setEdad(Integer.parseInt(Utilidades.ingresar("Ingrese la edad del cliente")));
			contenedor.almacenarCliente(cliente);
			Utilidades.escribir(cliente.analizarUsuario());

		}else {
			Utilidades.escribir("El RUT ingresado ya existe, favor revise los datos y vuelva a intentarlo.");
		}

		
		//INVOCAR AL MENÚ PARA MANTENER EL LOOP
		menuPrincipal(contenedor);
	}
	
	/**
	 * Permite Instanciar Objetos Capacitación
	 * @param contenedor tipo Contenedor
	 */
	public static void crearCapacitacion(Contenedor contenedor) {
		//MOSTRAR CLIENTES
		contenedor.listarUsuariosPorTipo(Cliente.class);
	}

}
