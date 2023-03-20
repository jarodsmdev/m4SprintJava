package sprintJavaFDJ;

/**
 * 
 * @version 1.0
 * @author Leonel Briones, Kevin Moreno, Valentia Saldias, Priscila Carrillo,
 *         Andres Contreras.
 *
 */

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Contenedor contenedor = new Contenedor();

		// DATOS DE PRUEBA
		DebugMode(contenedor);
		menuPrincipal(contenedor);
	}

	public static void DebugMode(Contenedor contenedor) {
		Usuario usuario1 = new Usuario();
		usuario1.setNombreUsuario("SOY USUARIO1");
		usuario1.setFechaNacimiento("22/03/1983");
		usuario1.setRut(1552123);

		Cliente cliente1 = new Cliente();
		cliente1.setNombre("SOY CLIENTE1");
		cliente1.setApellido("APELLIDO CLIENTE1");
		cliente1.setFechaNacimiento("22/14/1999");
		cliente1.setRut(1234561);
		cliente1.setDireccion("DIRECCION CLIENTE1");
		cliente1.setComuna("COMUNA CLIENTE 1");

		Cliente cliente2 = new Cliente();
		cliente2.setNombre("SOY CLIENTE2");
		cliente2.setApellido("APELLIDO CLIENTE2");
		cliente2.setFechaNacimiento("12/01/1998");
		cliente2.setRut(7894662);
		cliente2.setDireccion("DIRECCION CLIENTE2");
		cliente2.setComuna("COMUNA CLIENTE2");

		Capacitacion capacitacion1 = new Capacitacion();
		capacitacion1.setRut(7894662);
		capacitacion1.setDia("LUNES");
		capacitacion1.setHora("22:00");
		capacitacion1.setLugar("[CAP1] Este texto tiene mas de 10 caracteres");
		capacitacion1.setDuracion("55");
		capacitacion1.setCantidadAsistentes(20);

		Capacitacion capacitacion2 = new Capacitacion();
		capacitacion2.setRut(1234561);
		capacitacion2.setDia("LUNES");
		capacitacion2.setHora("09:00");
		capacitacion2.setLugar("[CAP2 Este texto tiene mas de 10 caracteres");
		capacitacion2.setDuracion("45");
		capacitacion2.setCantidadAsistentes(30);

		Administrativo administrativo1 = new Administrativo();
		administrativo1.setNombreUsuario("SOY ADMINISTRATIVO1");
		administrativo1.setArea("AREA 51 ADM1");
		administrativo1.setExpPrevia("MUCHA EXP ADM1");
		administrativo1.setFechaNacimiento("12/07/1983");
		administrativo1.setNombreUsuario("NICKNAME ADM1");
		administrativo1.setRut(1452654);

		Profesional profesional1 = new Profesional();
		profesional1.setNombreUsuario("SOY PROFESIONAL1");
		profesional1.setFechaIngreso("14/03/1999");
		profesional1.setFechaNacimiento("05/02/1956");
		profesional1.setNombreUsuario("NICKNAME PROF1");
		profesional1.setRut(458744);
		profesional1.setTitulo("INGENIERO EN BOTÁNICA DE ESPACIOS REDUCIDOS");

		Profesional profesional2 = new Profesional();
		profesional2.setNombreUsuario("SOY PROFESIONAL2");
		profesional2.setFechaIngreso("14/03/1996");
		profesional2.setFechaNacimiento("05/02/1956");
		profesional2.setNombreUsuario("NICKNAME PROF2");
		profesional2.setRut(1554744);
		profesional2.setTitulo("INGENIERÍA EN COMUNICACIONES");

		VisitaEnTerreno visita1 = new VisitaEnTerreno();
		visita1.setRutCliente(cliente1.getRun());
		visita1.setLugar("ESTE ES UN LUGAR PARA LA VISITA 1");
		visita1.setComentarios("ESTOS COMENTARIOS SON PARA LA VISITA 1");
		
		Revision revision1 = new Revision();
		revision1.setNombreRevision("Revision A");
		revision1.setDetalleRevisar("Detalle Revisión A");
		revision1.setEstado(1);
		visita1.agregarRevision(revision1);
		
		Revision revision2 = new Revision();
		revision2.setNombreRevision("Revision B");
		revision2.setDetalleRevisar("Detalle Revisión B");
		revision2.setEstado(2);
		visita1.agregarRevision(revision2);
		
		Revision revision3 = new Revision();
		revision3.setNombreRevision("Revision C");
		revision3.setDetalleRevisar("Detalle Revisión C");
		revision3.setEstado(3);
		visita1.agregarRevision(revision3);

		VisitaEnTerreno visita2 = new VisitaEnTerreno();
		visita2.setRutCliente(cliente2.getRun());
		visita2.setLugar("ESTE ES UN LUGAR PARA LA VISITA 2");
		visita2.setComentarios("ESTOS COMENTARIOS SON PARA LA VISITA 2");
		
		Revision revision4 = new Revision();
		revision4.setNombreRevision("Revisión D");
		revision4.setDetalleRevisar("Detalle Revisión D");
		revision4.setEstado(2);
		visita2.agregarRevision(revision4);

		VisitaEnTerreno visita3 = new VisitaEnTerreno();
		visita3.setRutCliente(cliente2.getRun());
		visita3.setLugar("ESTE ES UN LUGAR PARA LA VISITA 3");
		visita3.setComentarios("ESTOS COMENTARIOS SON PARA LA VISITA 3");
		
		Revision revision5 = new Revision();
		revision5.setNombreRevision("Revision B");
		revision5.setDetalleRevisar("Detalle Revision B");
		revision5.setEstado(3);
		visita3.agregarRevision(revision5);

		contenedor.almacenarUsuario(usuario1);
		contenedor.almacenarCliente(cliente1);
		contenedor.almacenarCliente(cliente2);
		contenedor.almacenarAdministrativo(administrativo1);
		contenedor.almacenarProfesional(profesional1);
		contenedor.almacenarProfesional(profesional2);
		contenedor.almacenarCapacitacion(capacitacion1);
		contenedor.almacenarCapacitacion(capacitacion2);
		cliente1.agregarVisitaTerreno(visita1);
		cliente2.agregarVisitaTerreno(visita2);
		cliente2.agregarVisitaTerreno(visita3);
	}

	public static void menuPrincipal(Contenedor contenedor) {

		String capturador;
		do {
			Utilidades.escribir("\n[\t--MENÚ PRINCIPAL--\t]\n");
			Utilidades.escribir("\n\t1. MENÚ USUARIOS" +
					"\n\t2. MENÚ INFORMES" +
					"\n\t3. MENÚ ADMINISTRATIVO" +
					"\n\t4. SALIR DEL SISTEMA\n\n"

			);

			capturador = Utilidades.ingresar("Ingrese una opción para ingresar: ");

			switch (capturador) {
				case "1":
					Utilidades.escribir("\t-- MENÚ USUARIOS --\n\n");
					menuUsuarios(contenedor);
					break;
				case "2":
					// Utilidades.escribir("\t-- MENÚ INFORMES --\n\n");
					menuInformes(contenedor);
					break;
				case "3":
					Utilidades.escribir("\t-- MENÚ ADMINISTRATIVO --\n\n");
					menuGestion(contenedor);
					break;
				case "4":
					Utilidades.escribir("\t-- CERRANDO EL SISTEMA --\n\n");
					System.exit(0);
					break;
				default:
					Utilidades.escribir("[!] OPCIÓN INGRESADA NO ES VÁLIDA, SÓLO INGRESE VALORES ENTRE 1 AL 4.\n\n");
			}

		} while (!capturador.matches("^[1-4]$"));
	}

	public static void menuGestion(Contenedor contenedor) {
		String capturador;

		do {

			Utilidades.escribir("\n[\t-- MENÚ ADMINISTRATIVO --\t]\n");
			Utilidades.escribir("\n\t1. CREAR CAPACITACIÓN" +
					"\n\t2. CREAR VISITA A TERRENO" +
					"\n\t3. INGRESAR ACCIDENTE" +
					"\n\t4. ELIMINAR USUARIO" +
					"\n\t5. VOLVER AL MENÚ PRINCIPAL\n\n");

			capturador = Utilidades.ingresar("Ingrese una opción para ingresar: ");

			switch (capturador) {
				case "1":
					Utilidades.escribir("\t-- CREAR CAPACITACIÓN --\n\n");
					crearCapacitacion(contenedor);
					menuGestion(contenedor);
					break;
				case "2":
					Utilidades.escribir("\t-- CREAR VISITA A TERRENO --\n\n");
					crearVisitaTerreno(contenedor);
					menuGestion(contenedor);
					break;
				case "3":
					Utilidades.escribir("\t-- INGRESAR ACCIDENTE --\n\n");
					crearAccidente(contenedor);
					menuGestion(contenedor);
					break;
				case "4":
					Utilidades.escribir("\t-- ELIMINAR USUARIO --\n\n");
					eliminarUsuario(contenedor);
					break;
				case "5":
					Utilidades.escribir("\t-- VOLVER AL MENÚ PRINCIPAL--\n\n");
					menuPrincipal(contenedor);
					break;
				default:
					Utilidades.escribir("[!] OPCIÓN INGRESADA NO ES VÁLIDA, SÓLO INGRESE VALORES ENTRE 1 AL 5.\n\n");
			}

		} while (!capturador.matches("^[1-5]$"));
	}

	public static void menuUsuarios(Contenedor contenedor) {
		String capturador;
		do {
			Utilidades.escribir("\n[\t--MENÚ USUARIO--\t]\n\n");
			Utilidades.escribir("\n\t1. CREAR USUARIO" +
					"\n\t2. CREAR CLIENTE" +
					"\n\t3. CREAR PROFESIONAL" +
					"\n\t4. CREAR ADMINISTRATIVO" +
					"\n\t5. VOLVER AL MENÚ PRINCIPAL\n\n"

			);

			capturador = Utilidades.ingresar("Ingrese una opción para ingresar: ");

			switch (capturador) {
				case "1":
					Utilidades.escribir("\t-- CREAR USUARIO --\n\n");
					crearUsuario(contenedor);
					break;
				case "2":
					Utilidades.escribir("\t-- CREAR CLIENTE --\n\n");
					crearCliente(contenedor);
					break;
				case "3":
					Utilidades.escribir("\t-- CREAR PROFESIONAL --\n\n");
					crearProfesional(contenedor);
					break;
				case "4":
					Utilidades.escribir("\t-- CREAR ADMINISTRATIVO --\n\n");
					crearAdministrativo(contenedor);
					break;
				case "5":
					// Utilidades.escribir("\t-- REGRESANDO AL MENÚ PRINCIPAL --\n\n");
					menuPrincipal(contenedor);
					break;
				default:
					Utilidades.escribir("[!] OPCIÓN INGRESADA NO ES VÁLIDA, SÓLO INGRESE VALORES ENTRE 1 AL 5.\n\n");
			}

		} while (!capturador.matches("^[1-5]$"));
	}

	public static void menuInformes(Contenedor contenedor) {
		String capturador;
		do {
			Utilidades.escribir("\n[\t-- MENÚ INFORMES --\t]\n");
			Utilidades.escribir("\n\t1. MOSTRAR TODOS LOS USUARIOS" +
					"\n\t2. MOSTRAR USUARIOS POR TIPO" +
					"\n\t3. MOSTRAR CAPACITACIONES" +
					"\n\t4. MOSTRAR VISITAS" +
					"\n\t5. VOLVER AL MENÚ PRINCIPAL\n\n"

			);

			capturador = Utilidades.ingresar("Ingrese una opción para ingresar: ");

			switch (capturador) {
				case "1":
					Utilidades.escribir("\t-- MOSTRAR TODOS LOS USUARIOS --\n\n");
					//contenedor.listarUsuarios();
					contenedor.listarSoloUsuarios();
					menuInformes(contenedor);
					break;
				case "2":
					// Utilidades.escribir("\t-- MOSTRAR TODOS LOS USUARIOS POR TIPO --\n\n");
					menuFiltrarUsuariosPorTipo(contenedor);
					// menuInformes(contenedor);
					break;
				case "3":
					Utilidades.escribir("\t-- MOSTRAR CAPACITACIONES --\n\n");
					contenedor.listarCapacitaciones();
					menuInformes(contenedor);
					break;
				case "4":
					Utilidades.escribir("\t-- MOSTRAR VISITAS --\n\n");
					mostrarVisitas(contenedor);
					menuInformes(contenedor);
					break;
				case "5":
					// Utilidades.escribir("\t-- REGRESANDO AL MENÚ PRINCIPAL --\n\n");
					menuPrincipal(contenedor);
					break;
				default:
					Utilidades.escribir("[!] OPCIÓN INGRESADA NO ES VÁLIDA, SÓLO INGRESE VALORES ENTRE 1 AL 5.\n\n");
			}

		} while (!capturador.matches("^[1-6]$"));
	}

	public static void menuFiltrarUsuariosPorTipo(Contenedor contenedor) {
		String capturador;
		do {
			Utilidades.escribir("\n\t-- SELECCIONE PARA APLICAR FILTRO --\n");
			Utilidades.escribir("\n\t1. MOSTRAR CLIENTES" +
					"\n\t2. MOSTRAR ADMINISTRATIVOS" +
					"\n\t3. MOSTRAR PROFESIONALES" +
					"\n\t4. VOLVER\n\n");

			capturador = Utilidades.ingresar("Ingrese una opción para ingresar: ");

			switch (capturador) {
				case "1":
					Utilidades.escribir("\t-- MOSTRAR TODOS LOS CLIENTES --\n\n");
					contenedor.listarUsuariosPorTipo(Cliente.class);
					menuFiltrarUsuariosPorTipo(contenedor);
					break;
				case "2":
					Utilidades.escribir("\t-- MOSTRAR TODOS LOS ADMINISTRATIVOS --\n\n");
					contenedor.listarUsuariosPorTipo(Administrativo.class);
					menuFiltrarUsuariosPorTipo(contenedor);
					break;
				case "3":
					Utilidades.escribir("\t-- MOSTRAR TODOS LOS PROFESIONALES --\n\n");
					contenedor.listarUsuariosPorTipo(Profesional.class);
					menuFiltrarUsuariosPorTipo(contenedor);
					break;
				case "4":
					// Utilidades.escribir("\t-- VOLVER --\n\n");
					menuInformes(contenedor);
					break;
				default:
					Utilidades.escribir("[!] OPCIÓN INGRESADA NO ES VÁLIDA, SÓLO INGRESE VALORES ENTRE 1 AL 4.\n\n");
			}

		} while (!capturador.matches("^[1-4]$"));
	}

	public static void crearAdministrativo(Contenedor contenedor) {
		long rutLong;
		// VALIDAR QUE EL CONTENIDO DE capturador sea tipo long
		String capturador = (Utilidades.ingresar("Ingresar RUT:"));

		if (Utilidades.esNumerica(capturador)) {
			rutLong = Long.parseLong(capturador);

			//VERIFICAR QUE NO SE INGRESEN DUPLICADOS
			if(!contenedor.existeUsuario(rutLong)){
				registrarAdministrativo(contenedor, rutLong);
			}else{
				Utilidades.escribir("[!] RUT ingresado existe en los registros.\n");
				menuUsuarios(contenedor);
			}

		} else {
			Utilidades.escribir("[ERROR] Valor ingresado no es válido.\n");
			menuUsuarios(contenedor);
		}

	}

	/**
	 * 
	 * @param contenedor
	 * @param rutLong
	 */
	public static void registrarAdministrativo(Contenedor contenedor, long rutLong){

		Administrativo administrativo = new Administrativo();

		administrativo.setRut(rutLong);
		administrativo.setNombreUsuario(Utilidades.ingresar("Ingresa nombre del Administrativo: "));
		administrativo.setFechaNacimiento(Utilidades.ingresar("Ingrese la fecha de nacimiento [dd/mm/aaaa]: "));
		administrativo.setArea(Utilidades.ingresar("Ingresa Área: "));
		administrativo.setExpPrevia(Utilidades.ingresar("Ingrese su experiencia previa [Máx. 100 caracteres]: "));
		// administrativo.setRut(Utilidades.ingresar("Ingrese RUT:"));

		contenedor.almacenarAdministrativo(administrativo);
		Utilidades.escribir("Personal Administrativo ha sido guardado exitosamente");

		// DEBUG MODE
		Utilidades.escribir("[RETORNO MÉTODO ANALIZAR ADMINISTRATIVO]" + administrativo.analizarUsuario());// DEBUGMODE
		contenedor.listarUsuarios();

		// INVOCAR AL MENÚ PARA MANTENER EL LOOP
		menuUsuarios(contenedor);
	}

	/**
	 * 
	 * @param contenedor
	 */
	public static void crearUsuario(Contenedor contenedor) {

		String rutString;
		do {
			rutString = Utilidades.ingresar("Ingrese el RUT del Usuario ['SALIR' para cancelar]: ");

			if (rutString.equalsIgnoreCase("SALIR")) {
				// break;
				menuUsuarios(contenedor);
			} else if (rutString.length() == 0) {
				Utilidades.escribir("[ERROR] Valor ingresado no es válido, sólo ingrese Números\n");
				rutString = Utilidades.ingresar("Ingrese el RUT del Usuario ['SALIR' para cancelar]: ");
			} else if (Utilidades.esNumerica(rutString)) {
				long rutLong = Long.parseLong(rutString);

				// VALIDAR QUE NO SE ENCUENTRE DUPLICADO
				if (!contenedor.existeUsuario(rutLong)) {
					// NO EXISTE RUT, CONTINUAR CON LA CREACION DE USUARIO
					registrarUsuario(contenedor, rutLong);
				} else {
					Utilidades.escribir("[!] RUT Ingresado existe en los registros.\n");
					crearUsuario(contenedor);
				}
				// break;
			} else {
				Utilidades.escribir("[ERROR] Valor ingresado no es válido, sólo ingrese Números\n");
				rutString = Utilidades.ingresar("Ingrese el RUT del Usuario ['SALIR' para cancelar]: ");
			}
		} while (true);

	}

	public static void registrarUsuario(Contenedor contenedor, long rutLong) {

		String rutString;
		do {
			rutString = Utilidades.ingresar("Ingrese el RUT del Usuario ['SALIR' para cancelar]: ");

			if (rutString.equalsIgnoreCase("SALIR")) {
				// break;
				menuUsuarios(contenedor);
			} else if (rutString.length() == 0) {
				Utilidades.escribir("[ERROR] Valor ingresado no es válido, sólo ingrese Números\n");
				rutString = Utilidades.ingresar("Ingrese el RUT del Usuario ['SALIR' para cancelar]: ");
			} else if (Utilidades.esNumerica(rutString)) {
				rutLong = Long.parseLong(rutString);

				// VALIDAR QUE NO SE ENCUENTRE DUPLICADO
				if (!contenedor.existeUsuario(rutLong)) {
					// NO EXISTE RUT, CONTINUAR CON LA CREACION DE USUARIO
					registrarUsuario(contenedor, rutLong);
				} else {
					Utilidades.escribir("[!] RUT Ingresado existe en los registros.\n");
					crearUsuario(contenedor);
				}
				// break;
			} else {
				Utilidades.escribir("[ERROR] Valor ingresado no es válido, sólo ingrese Números\n");
				rutString = Utilidades.ingresar("Ingrese el RUT del Usuario ['SALIR' para cancelar]: ");
			}
		} while (true);

	}

	/**
	 * MÉTODO QUE SE ASEGURA QUE EL RUT INGRESADO SEA NUMERICO PODER CONTINUAR CON
	 * LA CREACION DE OBJETO CLIENTE
	 * 
	 * @param contenedor
	 */
	public static void crearCliente(Contenedor contenedor) {
		// VALIDAR QUE EL CONTENIDO DE capturador sea tipo long
		String capturador = (Utilidades.ingresar("Ingresar RUT:"));

		if (Utilidades.esNumerica(capturador)) {
			registrarCliente(contenedor, Long.parseLong(capturador));
		} else {
			Utilidades.escribir("[ERROR] Valor ingresado no es válido.\n");
			crearCliente(contenedor);
		}
	}

	/**
	 * MÉTODO QUE PERMITE LA CREACIÓN DE OBJETOS TIPO CLIENTE
	 * 
	 * @param contenedor
	 * @param rutLong
	 */
	public static void registrarCliente(Contenedor contenedor, long rutLong) {
		// VERIFICA QUE NO PUEDA INGRESAR RUT DUPLICADOS
		if (!contenedor.existeUsuario(rutLong)) {

			Cliente cliente = new Cliente();

			cliente.setRut(rutLong);
			cliente.setNombre(Utilidades.ingresar("Ingrese Nombre Cliente:"));
			cliente.setFechaNacimiento(Utilidades.ingresar("Ingrese Fecha de Nacimiento: "));
			cliente.setApellido(Utilidades.ingresar("Ingrese Apellido [Entre 5 y 30 caracteres]: ")); // OK OBLIGATORIO
			cliente.setTelefono(Utilidades.ingresar("Ingrese el número de teléfono del cliente")); // OK OBLIGATORIO
			cliente.setAfp(Utilidades.ingresar("Ingrese el nombre de la AFP del cliente [Entre 4 y 30 caracteres]: ")); 																										
			cliente.setSistemaSalud(Utilidades.ingresar("Ingrese Sistema de Salud: 1 FONASA || 2 ISAPRE"));																		
			cliente.setDireccion(Utilidades.ingresar("Ingrese la dirección [Máx 70 caracteres]: ")); // OK OPCIONAL
			cliente.setComuna(Utilidades.ingresar("Ingrese la comuna [Máx 50 caracteres]: ")); // OK OPCIONAL
			cliente.setEdad(Utilidades.ingresar("Ingrese su edad [0 - 150]: ")); // FALLA CON LETRAS //CORREGIDO
			contenedor.almacenarCliente(cliente);
			Utilidades.escribir("El Cliente ha sido guardado correctamente\n");

			Utilidades.escribir("[CLIENTE] " + cliente.analizarUsuario() + "\n");

			// INVOCAR VISITA EN TERRENO
			registrarVisitaEnTerreno(contenedor, rutLong);

			// INVOCAR AL MENÚ USUARIOS PARA MANTENER EL LOOP
			menuUsuarios(contenedor);

		} else {
			Utilidades.escribir("El RUT ingresado ya existe, favor revise los datos y vuelva a intentarlo.\n");
			// INVOCAR AL MENÚ USUARIOS PARA MANTENER EL LOOP
			menuUsuarios(contenedor);
		}
	}

	/**
	 * MÉTODO QUE PERMITE LA CREACIÓN DE OBJETOS VISITA EN TERRENO
	 * 
	 * @param contenedor
	 */
	public static void crearVisitaTerreno(Contenedor contenedor) {

		String input;
		String regEx = "^[0-9]+$";

		// MOSTRAR CLIENTES
		Utilidades.escribir("[-- SELECCIONE UN CLIENTE --]\n\n");
		contenedor.listarUsuariosPorTipo(Cliente.class);

		// VALIDA CORRECTAMENTE EL INGRESO DEL RUT DEL CLIENTE
		do {
			input = Utilidades.ingresar("Ingrese RUT Cliente ['SALIR' para cancelar]: ");
			if (input.trim().length() == 0) {
				Utilidades.escribir("[ERROR] Debe escribir RUT del Cliente.\n");
			} else if (input.trim().equalsIgnoreCase("SALIR")) {
				// SALIR DEL BUCLE HACIA UN MENU
				Utilidades.escribir("[!] Se ha cancelado el ingreso de Visitas en Terreno\n");
				menuGestion(contenedor);
			} else if (!input.matches(regEx)) {
				Utilidades.escribir("[ERROR] Sólo se aceptan números\n");
			} else {

				long inputRut = Long.parseLong(input);

				registrarVisitaEnTerreno(contenedor, inputRut);
			}
		} while (!input.matches(regEx) || !input.trim().equalsIgnoreCase("SALIR"));
	}

	public static void registrarVisitaEnTerreno(Contenedor contenedor, long inputRut) {
		// REGISTRA LA VISTA EN TERRENO CUANDO EL RUT ES VÁLIDO
		if (contenedor.existeUsuario(inputRut)) {

			// EXISTE USUARIO OBTIENE CLIENTE
			Cliente cl1 = contenedor.obtenerCliente(inputRut);

			VisitaEnTerreno visitaTerreno = new VisitaEnTerreno();

			Utilidades.escribir("\n [ID VISITA: " + visitaTerreno.getIdentificador() + "] [CLIENTE: "
					+ cl1.obtenerNombre() + "]\n\n");

			visitaTerreno.setRutCliente(inputRut);
			visitaTerreno.setDia(Utilidades.ingresar("Ingresar Fecha con formato [DD/MM/AAAA]: "));
			visitaTerreno.setHora(Utilidades.ingresar("Ingrese hora formato [HH:MM]: "));
			visitaTerreno.setLugar(Utilidades.ingresar("Ingrese Lugar: (Texto entre 10 y 50 caracteres)"));
			visitaTerreno.setComentarios(
					Utilidades.ingresar("Ingrese comentarios de la visita [Máx 100 caracteres]: "));

			// Agrega capacitación a la lista de visita terreno contenedor
			cl1.agregarVisitaTerreno(visitaTerreno);

			Utilidades.escribir("\nSe ha ingresado la Visita en Terreno correctamente.\n\n");

			// MOSTRAR DATOS DE LA VISITA
			Utilidades.escribir(visitaTerreno.toString() + "\n\n"); // DEBUGMODE

			// INGRESAR LAS REVISIONES NECESARIAS PARA ESTA VISITA
			crearRevision(visitaTerreno, contenedor);

			// VOLVER AL MENÚ ADMINISTRACIÓN
			menuGestion(contenedor);
		} else {
			// NO EXISTE USUARIO
		}
	}

	/**
	 * Realiza validaciones antes de invocar al método que permite instanciar
	 * objetos capacitaciones
	 * 
	 * @param contenedor tipo Contenedor
	 */
	public static void crearCapacitacion(Contenedor contenedor) {
		// MOSTRAR CLIENTES
		String input;
		String regEx = "^[0-9]+$";

		// System.out.println("EXISTEN CLIENTES " +
		// contenedor.contarUsuariosClientes(Cliente.class));

		if (contenedor.contarUsuariosClientes(Cliente.class) > 0) {

			Utilidades.escribir("[-- SELECCIONE UN CLIENTE --]\n\n");

			contenedor.listarUsuariosPorTipo(Cliente.class);

			do {
				input = Utilidades.ingresar("Ingrese RUT Cliente: ['SALIR' PARA CANCELAR]: ");
				if (input.trim().equalsIgnoreCase("SALIR")) {
					Utilidades.escribir("[!] Se ha cancelado el Ingreso de Capacitacion.\n");
					menuGestion(contenedor);
				}
				if (input.trim().length() == 0) {
					Utilidades.escribir("[ERROR] Debe escribir RUT del Cliente.\n");
				} else if (!input.matches(regEx)) {
					Utilidades.escribir("[ERROR] Sólo se aceptan números, corrija y vuelva a intentar.\n");
				} else {
					registrarCapacitacion(contenedor, input);
				}
			} while (!input.matches(regEx) || input.trim().equalsIgnoreCase("SALIR"));
		}

	}

	/**
	 * Permite Instanciar Objetos Capacitación cuanto pasa por todas las
	 * validaciones
	 * 
	 * @param contenedor
	 * @param input      tipo long
	 */
	public static void registrarCapacitacion(Contenedor contenedor, String input) {
		// VALIDACION CORRECTA
		long inputRut = Long.parseLong(input);
		if (contenedor.existeUsuario(inputRut)) {

			Capacitacion capacitacion = new Capacitacion();
			capacitacion.setRut(inputRut);
			capacitacion.setDia(Utilidades.ingresar("Ingrese día de la Semana (Ej.: 'Lunes'): "));
			capacitacion.setHora(Utilidades.ingresar("Ingrese hora formato [HH:MM]: "));
			capacitacion.setLugar(Utilidades.ingresar("Ingrese Lugar (Texto entre 10 y 50 caracteres): "));
			capacitacion.setDuracion(Utilidades.ingresar("Ingrese Duración en minutos: "));

			do {
				String capturador = Utilidades.ingresar("Ingrese cantidad de asistentes (Máximo 999): ");
				if (Utilidades.esNumerica(capturador)) {
					capacitacion.setCantidadAsistentes(Integer.parseInt(capturador));
					break;
				} else {
					Utilidades.escribir("[ERROR] Ingrese una cantidad válida de asistentes.\n");
				}
			} while (true);

			// Agrega capacitación a la lista de Capacitacion
			contenedor.almacenarCapacitacion(capacitacion);
			contenedor.listarCapacitaciones();

			Utilidades.escribir("\nSe ha creado la Capacitación correctamente.\n");

			// PREGUNTA SI DESEA SEGUIR INGRESANDO CAPACITACIONES AL MISMO CLIENTE
			String respuesta;
			do {
				respuesta = Utilidades.ingresar("¿Desea continuar ingresando otra Capacitación? ('s|n')");
				if (respuesta.equalsIgnoreCase("s")) {
					// CONTINUAR CON OTRO INGRESO
					crearCapacitacion(contenedor);
				} else if (respuesta.equalsIgnoreCase("n")) {
					// VOLVER AL MENU PRINCIPAL
					menuGestion(contenedor);
				} else {
					Utilidades.escribir("[!] Error de ingreso. opción ingresada no válida. (s|n)");
				}
			} while (!respuesta.trim().matches("^[sn]$"));
			// VOLVER AL MENÚ
		} else {
			// NO EXISTE USUARIO
			Utilidades.escribir("[ERROR] RUT ingresado no existe en la base de datos.\n");
			crearCapacitacion(contenedor);
		}
	}

	/**
	 * MÉTODO QUE PERMITE CREAR OBJETOS DE TIPO PROFESIONAL
	 * 
	 * @param contenedor
	 */
	public static void crearProfesional(Contenedor contenedor) {

		long rutLong;
		// VALIDAR QUE EL CONTENIDO DE capturador sea tipo long
		String capturador = (Utilidades.ingresar("Ingresar RUT:"));

		if (Utilidades.esNumerica(capturador)) {
			rutLong = Long.parseLong(capturador);

			// VALIDAR SI EXISTE EL RUT ANTES DE CONTINUAR
			if(!contenedor.existeUsuario(rutLong)){
				registrarProfesional(contenedor, rutLong);
			}else{
				Utilidades.escribir("[!] RUT ingresado existe en los registros.\n");
				menuUsuarios(contenedor);
			}

		} else {
			Utilidades.escribir("[ERROR] Valor ingresado no es válido.\n");
			menuUsuarios(contenedor);
		}

	}

	/**
	 * 
	 * @param contenedor
	 * @param rutLong
	 */
	public static void registrarProfesional(Contenedor contenedor, long rutLong){

		Profesional profesional = new Profesional();
		profesional.setRut(rutLong);
		profesional.setNombreUsuario(Utilidades.ingresar("Ingresa nombre del profesional: "));
		profesional.setFechaNacimiento(Utilidades.ingresar("Ingrese la fecha de nacimiento [dd/mm/aaaa]: "));

		profesional.setTitulo(Utilidades.ingresar("Ingresa título: "));
		profesional.setFechaIngreso(Utilidades.ingresar("Ingrese Fecha de ingreso [dd/mm/aaaa]: "));

		contenedor.almacenarProfesional(profesional);
		Utilidades.escribir("Profesional ha sido guardado exitosamente");

		Utilidades.escribir("[PROFESIONAL]" + profesional.analizarUsuario() + "\n");

		// INVOCAR AL MENÚ PARA MANTENER EL LOOP
		menuPrincipal(contenedor);
	}

	/**
	 * MÉTODO QUE PERMITE LA CREACIÓN DE OBJETOS TIPO ACCIDENTE
	 * 
	 * @param contenedor
	 */
	public static void crearAccidente(Contenedor contenedor) {

		String input;
		String regEx = "^[0-9]+$";

		if (contenedor.contarUsuariosClientes(Cliente.class) > 0) {

			// MOSTRAR CLIENTES
			Utilidades.escribir("[-- SELECCIONE UN CLIENTE --]\n\n");

			contenedor.listarUsuariosPorTipo(Cliente.class);

			// VALIDA CORRECTAMENTE EL INGRESO DEL RUT DEL CLIENTE
			do {
				input = Utilidades.ingresar("Ingrese RUT Cliente ['SALIR' para cancelar]: ");
				if (input.trim().length() == 0) {
					Utilidades.escribir("[ERROR] Debe escribir RUT del Cliente.\n");
				} else if (input.trim().equalsIgnoreCase("SALIR")) {
					// SALIR DEL BUCLE HACIA UN MENU
					Utilidades.escribir("[!] Se ha cancelado el ingreso de Accidentes\n");
					menuGestion(contenedor);
				} else if (!input.matches(regEx)) {
					Utilidades.escribir("[ERROR] Sólo se aceptan números\n");
				} else {

					long inputRut = Long.parseLong(input);

					if (contenedor.existeUsuario(inputRut)) {

						// EXISTE USUARIO OBTIENE CLIENTE
						Cliente cliente = contenedor.obtenerCliente(inputRut);

						Accidente accidente = new Accidente();

						Utilidades.escribir("\n [ID ACCIDENTE: " + accidente.getIdentificador() + "] [CLIENTE: "
								+ cliente.obtenerNombre() + "]\n\n");

						accidente.setRutCliente(inputRut);
						accidente.setFecha(Utilidades.ingresar("Ingresar Fecha con formato [DD/MM/AAAA]: "));
						accidente.setHora(Utilidades.ingresar("Ingrese hora formato [HH:MM]: "));
						accidente.setLugar(Utilidades.ingresar("Ingrese Lugar (Texto entre 10 y 50 caracteres): "));
						accidente.setOrigen(Utilidades.ingresar("Ingrese origen del accidente (máx 100 caracteres): "));
						accidente.setConsecuencias(
								Utilidades.ingresar("Ingrese consecuencias del accidente(máx 100 caracteres): "));

						// Agrega accidente
						cliente.agregarAccidente(accidente);

						Utilidades.escribir("\nSe ha ingresado el Accidente correctamente.\n\n");

						// MUESTRA TODOS LOS ACCIDENTES
						cliente.mostrarAccidentes(inputRut);

						// TODO: PREGUNTAR SI DESEO SEGUIR INGRESANDO ACCIDENTES
						menuGestion(contenedor);
					} else {
						Utilidades.escribir("[ERROR] RUT Ingresado no existe en los registros.\n\n");
						crearAccidente(contenedor);
					}
				}
			} while (!input.matches(regEx) || !input.trim().equalsIgnoreCase("SALIR"));
		}

	}

	/**
	 * Método que permite crear objetos tipos revisión, requiere un objeto
	 * VisitaEnTerreno como parámetro
	 * 
	 * @param visitaEnTerreno
	 */
	public static void crearRevision(VisitaEnTerreno visitaEnTerreno, Contenedor contenedor) {
		Revision revision = new Revision();

		Utilidades.escribir(" [ID REVISION: " + revision.getIdRevision() + "]\n\n");

		revision.setIdVisita(visitaEnTerreno.getIdentificador());
		revision.setNombreRevision(Utilidades.ingresar("Ingrese nombre Revisión [Entre 10 y 50 caracteres]: "));
		revision.setDetalleRevisar(Utilidades.ingresar("Detallar Revisión [Máx. 100 caracteres]: "));

		do {
			String capturador = Utilidades.ingresar("Ingrese Resultado de la Revisión [1 - 3]: \n\n" +

					"1. SIN PROBLEMAS\n" +
					"2. CON OBSERVACIONES\n" +
					"3. NO APRUEBA\n\n");

			if (Utilidades.esNumerica(capturador)) {
				if (capturador.equals("1") || capturador.equals("2") || capturador.equals("3")) {
					revision.setEstado(Integer.parseInt(capturador));
					break;
				}
			} else {
				Utilidades.escribir("[ERROR] Debe seleccionar una opción [1 - 3]\n");
			}
		} while (true);

		// Muestra el detalle de la revisíón
		Utilidades.escribir(revision.toString() + "\n");

		// Agrega la revisión al listado de revisiones del objeto VisitaEnTerreno
		visitaEnTerreno.agregarRevision(revision);

		do {
			String respuesta = Utilidades.ingresar("¿Desea ingresar otra revisión? ['s|n']");
			if (respuesta.equalsIgnoreCase("s")) {
				// VOLVER A INVOCAR ESTE MÉTODO
				crearRevision(visitaEnTerreno, contenedor);
			} else if (respuesta.equalsIgnoreCase("n")) {
				menuGestion(contenedor);
			} else {
				Utilidades.escribir("[ERROR] Respuesta ingresada no es válida ['s|n']");
			}
		} while (true);

	}

	/**
	 * Método que permite Mostrar Todas las Visitas a Terreno con sus respectivas
	 * revisiones
	 * 
	 * @param contenedor
	 */
	public static void mostrarVisitas(Contenedor contenedor) {
		int nVisita = 1;
		int nRevision = 1;
		// RECORRER LISTA DE ASESORIAS
		for (int i = 0; i < contenedor.listaAsesoria.size(); i++) {
			// IDENTIFICAR A CADA OBJETO DE LA LISTA QUE SEA UNO DE TIPO CLIENTE

			if (contenedor.listaAsesoria.get(i) instanceof Cliente) {

				Cliente cliente = (Cliente) contenedor.listaAsesoria.get(i); // CASTING A CLIENTE
				// OBTENGO LA LISTA DEL CLIENTE EN CADA ITERACION
				ArrayList<VisitaEnTerreno> visitas = cliente.getListaVisitas();

				for (VisitaEnTerreno objVisita : visitas) {
					Utilidades.escribir("\n" + (nVisita++) + ". " + objVisita.toString() + "\n");
					// OBTENER REVISIONES POR CADA VISITA
					ArrayList<Revision> revisiones = objVisita.getRevisiones();

					for (Revision objRevision : revisiones) {
						Utilidades.escribir("\t" + (nRevision++) + ". " + objRevision.toString() + "\n");
					}
				}
			}
		}
	}

	public static void eliminarUsuario(Contenedor contenedor) {
		String input;
		String regEx = "^[0-9]+$";

		if (contenedor.contarUsuariosClientes(Cliente.class) > 0) {

			// MOSTRAR TODOS LOS USUARIOS
			Utilidades.escribir("[-- SELECCIONE UN CLIENTE --]\n\n");

			contenedor.listarUsuariosPorTipo(Cliente.class);
			// contenedor.listarUsuarios();
			// SOLICITAR RUT
			do {
				input = Utilidades.ingresar("Ingrese RUT Cliente ['SALIR' para cancelar]: ");
				if (input.trim().length() == 0) {
					Utilidades.escribir("[ERROR] Debe escribir RUT del Cliente.\n");
				} else if (input.trim().equalsIgnoreCase("SALIR")) {
					// SALIR DEL BUCLE HACIA UN MENU
					Utilidades.escribir("[!] Se ha cancelado la Eliminación\n");
					menuGestion(contenedor);
				} else if (!input.matches(regEx)) {
					Utilidades.escribir("[ERROR] Sólo se aceptan números\n");
				} else {
					// CUMPLE CON EL FORMATO PARA SER UN RUT VÁLIDO
					long inputRut = Long.parseLong(input);

					if (contenedor.existeUsuario(inputRut)) {
						Utilidades.escribir(contenedor.eliminarUsuario(inputRut) + "\n"); // RETORNA MENSAJE
						menuGestion(contenedor);
					} else {
						Utilidades.escribir("[ERROR] RUT Ingresado no existe en los registros.\n\n");
						menuGestion(contenedor);
					}

				}
			} while (!input.matches(regEx) || !input.trim().equalsIgnoreCase("SALIR"));
			// RECORRER ARRAY PARA ENCONTRAR EL OBJETO Y POSTERIORMENTE ELIMINARLO
		}
	}

}