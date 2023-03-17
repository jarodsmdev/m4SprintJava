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
		cliente1.setNombre("SOY CLIENTE1");
		cliente1.setApellido("SOY APELLIDO DE CLIENTE1");
		cliente1.setRut(1234561);
		cliente1.setDireccion("DIRECCION CLIENTE1");
		cliente1.setComuna("COMUNA CLIENTE1");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNombre("SOY CLIENTE2");
		cliente2.setApellido("SOY APELLIDO DE CLIENTE2");
		cliente2.setRut(7894662);
		cliente2.setDireccion("DIRECCION CLIENTE2");
		cliente2.setComuna("COMUNA CLIENTE2");
		
		Administrativo administrativo1 = new Administrativo();
		administrativo1.setNombreUsuario("SOY DE TIPO ADMINISTRATIVO1");
		
		Profesional profesional1 = new Profesional();
		profesional1.setNombreUsuario("SOY DE TIPO PROFESIONAL1");
		
		contenedor.almacenarUsuario(usuario1);
		contenedor.almacenarCliente(cliente1);
		contenedor.almacenarCliente(cliente2);
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
					crearVisitaTerreno(contenedor);
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
			Utilidades.escribir("El Cliente ha sido guardado correctamente");


		}else {
			Utilidades.escribir("El RUT ingresado ya existe, favor revise los datos y vuelva a intentarlo.");
		}
		//INVOCAR AL MENÚ PARA MANTENER EL LOOP
		menuPrincipal(contenedor);
	}
	 /**
     * Metodo crear visita en terreno
     */
    public static void crearVisitaTerreno(Contenedor contenedor) {
    	
    	//MOSTRAR CLIENTES
		String input;
		String regEx = "^[0-9]+$";
		contenedor.listarUsuariosPorTipo(Cliente.class);
		
		do {
			input = Utilidades.ingresar("Ingrese RUT Cliente: ");
			if(input.trim().length() == 0) {
				Utilidades.escribir("Error de Ingreso, Debe escribir RUT del Cliente a modificar.\n");
			}else if(!input.matches(regEx)) {
				Utilidades.escribir("Error de Ingreso, sólo se aceptan números\n");
			}else {
				//VALIDACION CORRECTA
				//Utilidades.escribir("VALIDACIÓN CORRECTA!\n");
				long inputRut = Long.parseLong(input);
				if(contenedor.existeUsuario(inputRut)) {
					//EXISTE USUARIO OBTIENE CLIENTE
					//Cliente cliente = contenedor.obtenerCliente(inputRut);
					Utilidades.escribir("SE HA ENCONTRADO AL CLIENTE\n");
			        VisitaEnTerreno visitaTerreno = new VisitaEnTerreno();
			        Cliente cl1 = new Cliente();
			        
			        cl1.setRut(inputRut);
					visitaTerreno.setDia(Utilidades.ingresar("Ingresar Fecha con formato: DD/MM/AAAA"));
					visitaTerreno.setHora(Utilidades.ingresar("Ingrese hora formato [HH:MM]: "));
					visitaTerreno.setLugar(Utilidades.ingresar("Ingrese Lugar: (Texto entre 10 y 50 caracteres)"));
					visitaTerreno.setComentarios(Utilidades.ingresar("Ingrese comentarios de la visita : "));
					
					//Agrega capacitación a la lista de visita terreno
//					contenedor
					cl1.agregarVisitaTerreno(visitaTerreno);
					

					Utilidades.escribir("Se ha creado la Visita Terreno correctamente.");

					//TODO: PREGUNTAR SI DESEA SEGUIR INGRESANDO CAPACITACIONES AL MISMO CLIENTE
					//VOLVER AL MENÚ
				}else {
					//NO EXISTE USUARIO
				}
			}
		}while(!input.matches(regEx));



    }/**
	 * Permite Instanciar Objetos Capacitación
	 * @param contenedor tipo Contenedor
	 */
	public static void crearCapacitacion(Contenedor contenedor) {
		//MOSTRAR CLIENTES
		String input;
		String regEx = "^[0-9]+$";
		contenedor.listarUsuariosPorTipo(Cliente.class);
		
		do {
			input = Utilidades.ingresar("Ingrese RUT Cliente: ");
			if(input.trim().length() == 0) {
				Utilidades.escribir("Error de Ingreso, Debe escribir RUT del Cliente a modificar.\n");
			}else if(!input.matches(regEx)) {
				Utilidades.escribir("Error de Ingreso, sólo se aceptan números\n");
			}else {
				//VALIDACION CORRECTA
				//Utilidades.escribir("VALIDACIÓN CORRECTA!\n");
				long inputRut = Long.parseLong(input);
				if(contenedor.existeUsuario(inputRut)) {
					//EXISTE USUARIO OBTIENE CLIENTE
					//Cliente cliente = contenedor.obtenerCliente(inputRut);
					Utilidades.escribir("SE HA ENCONTRADO AL CLIENTE\n");
					Capacitacion capacitacion = new Capacitacion();
					capacitacion.setRut(inputRut);
					capacitacion.setDia(Utilidades.ingresar("Ingrese día de la Semana: (Ej.: 'Lunes')"));
					capacitacion.setHora(Utilidades.ingresar("Ingrese hora formato [HH:MM]: "));
					capacitacion.setLugar(Utilidades.ingresar("Ingrese Lugar: (Texto entre 10 y 50 caracteres)"));
					capacitacion.setDuracion(Utilidades.ingresar("Ingrese Duración en minutos: "));
					capacitacion.setCantidadAsistentes(Integer.parseInt(Utilidades.ingresar("Ingrese cantidad de asistentes: (Máximo 999)")));
					
					//Agrega capacitación a la lista de Capacitacion
					contenedor.almacenarCapacitacion(capacitacion);

					Utilidades.escribir("Se ha creado la Capacitación correctamente.");

					//TODO: PREGUNTAR SI DESEA SEGUIR INGRESANDO CAPACITACIONES AL MISMO CLIENTE
					//VOLVER AL MENÚ
				}else {
					//NO EXISTE USUARIO
				}
			}
		}while(!input.matches(regEx));
	}
	//crear profesional
	public static void crearProfesional (Contenedor contenedor) {

 		Profesional profesional = new Profesional();

		profesional.setNombreUsuario(Utilidades.ingresar("Ingresa nombre del profesional"));
		profesional.setFechaNacimiento(Utilidades.ingresar("Ingrese la fecha de nacimiento [dd/mm/aaaa]"));
		profesional.setRut(Long.parseLong(Utilidades.ingresar("Ingrese RUT")));

		profesional.setTitulo(Utilidades.ingresar("Ingresa titulo: "));
		profesional.setFechaIngreso(Utilidades.ingresar("Ingrese Fecha de ingreso: "));

		contenedor.almacenarProfesional(profesional);
		Utilidades.escribir("Personal Profesional ha sido guardado exitosamente");
		contenedor.listarUsuarios();

		//INVOCAR AL MENÚ PARA MANTENER EL LOOP
		menuPrincipal(contenedor);


	}
	
   
	

}
