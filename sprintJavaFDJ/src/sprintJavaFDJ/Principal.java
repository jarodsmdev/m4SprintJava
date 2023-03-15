package sprintJavaFDJ;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contenedor contenedor = new Contenedor();
		menuPrincipal(contenedor);
	}
	
	public static void menuPrincipal(Contenedor contenedor) {
		
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
				Utilidades.escribir("\t-- CREACIÓN DE USUARIO --\n");
				crearUsuario(contenedor);
				break;
			case 2:
				Utilidades.escribir("\t-- CREACIÓN DE CLIENTE --\n");
				crearCliente(contenedor);
				break;
			case 3:
				Utilidades.escribir("\t-- CREACIÓN DE PROFESIONAL --\n");
				break;
			case 4:
				Utilidades.escribir("\t-- CREACIÓN DE ADMINISTRATIVO --\n");
				crearAdministrador(contenedor);
				break;
			case 5:
				Utilidades.escribir("\t-- CREACIÓN DE CAPACITACIÓN --\n");
				break;
			case 6:
				Utilidades.escribir("\t-- INGRESO DE ACCIDENTE --\n");
				break;
			case 7:
				Utilidades.escribir("\t-- ESTABLECER VISITA EN TERRENO --\n");
				break;
			case 8:
				Utilidades.escribir("\t-- REVISIONES --\n");
				break;
			case 9:
				Utilidades.escribir("\t-- CERRANDO EL SISTEMA --\n");
				System.exit(0);
				break;
			default:
				Utilidades.escribir("Opción No Válida.");
		}
	}
	public static void crearAdministrador (Contenedor contenedor) {
		
		Administrativo administrativo = new Administrativo();
		
		administrativo.setNombreUsuario(Utilidades.ingresar("Ingresa nombre del Usuario"));
		administrativo.setArea(Utilidades.ingresar("Ingresa Área"));
		administrativo.setExpPrevia(Utilidades.ingresar("Ingrese experiencia previa"));
		administrativo.setRut(Long.parseLong(Utilidades.ingresar("Ingrese RUT")));
		//administrativo.obtenerFechaNac();
		
		contenedor.almacenarAdministrativo(administrativo);
		Utilidades.escribir("Personal Administrativo ha sido guardado exitosamente");
		contenedor.listarUsuarios();
		
		//INVOCAR AL MENÚ PARA MANTENER EL LOOP
		menuPrincipal(contenedor);

	}
	
	public static void crearUsuario(Contenedor contenedor) {
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(Utilidades.ingresar("Ingrese el nombre de Usuario"));
		usuario.setFechaNacimiento(Utilidades.ingresar("Ingrese la fecha de nacimiento [dd/mm/aaaa]"));
		usuario.setRut(Long.parseLong(Utilidades.ingresar("Ingrese el RUT del Usuario")));
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
		
		
		if(contenedor.existeUsuario(capturador)) {
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
		}else {
			Utilidades.escribir("El RUT no corresponde a ningún Usuario; cree un Usuario primero para continuar");
		}
		
		//INVOCAR AL MENÚ PARA MANTENER EL LOOP
		menuPrincipal(contenedor);
	}
}
