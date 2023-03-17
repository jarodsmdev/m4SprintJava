package sprintJavaFDJ;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contenedor contenedor = new Contenedor();
		
		//DATOS DE PRUEBA
		DebugMode(contenedor);
		menuPrincipal(contenedor);
	}

	
	public static void DebugMode(Contenedor contenedor) {
		Usuario usuario1 = new Usuario();
		usuario1.setNombreUsuario("SOY USUARIO1");
		usuario1.setFechaNacimiento("22/03/1983");
		usuario1.setRut(15521239);
		
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
		administrativo1.setArea("51");
		administrativo1.setExpPrevia("5");
		administrativo1.setFechaNacimiento("22/03/1983");
		administrativo1.setNombreUsuario("NICKNAME ADM1");
		administrativo1.setRut(1452654);
		
		Profesional profesional1 = new Profesional();
		profesional1.setNombreUsuario("SOY PROFESIONAL1");
		profesional1.setFechaIngreso("14/03/1999");
		profesional1.setFechaNacimiento("05/02/1956");
		profesional1.setNombreUsuario("NICKNAME PROF1");
		profesional1.setRut(458744);
		profesional1.setTitulo("INGENIER@");

		Profesional profesional2 = new Profesional();
		profesional2.setNombreUsuario("SOY PROFESIONAL2");
		profesional2.setFechaIngreso("14/03/1996");
		profesional2.setFechaNacimiento("05/02/1956");
		profesional2.setNombreUsuario("NICKNAME PROF2");
		profesional2.setRut(1554744);
		profesional2.setTitulo("ARQUITECT@");
		
		contenedor.almacenarUsuario(usuario1);
		contenedor.almacenarCliente(cliente1);
		contenedor.almacenarCliente(cliente2);
		contenedor.almacenarAdministrativo(administrativo1);
		contenedor.almacenarProfesional(profesional1);
		contenedor.almacenarProfesional(profesional2);
		contenedor.almacenarCapacitacion(capacitacion1);
		contenedor.almacenarCapacitacion(capacitacion2);
	}

		public static void menuPrincipal(Contenedor contenedor){
			

			String capturador;
			do{
				Utilidades.escribir("\n\t--MENÚ PRINCIPAL--\n");
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
						//Utilidades.escribir("\t-- MENÚ INFORMES --\n\n");
						menuInformes(contenedor);
						break;
					case "3":
						Utilidades.escribir("\t-- MENÚ ADMINISTRATIVO --\n\n");
						break;
					case "4":
						Utilidades.escribir("\t-- CERRANDO EL SISTEMA --\n\n");
						System.exit(0);
						break;
					default:
					Utilidades.escribir("[!] OPCIÓN INGRESADA NO ES VÁLIDA, SÓLO INGRESE VALORES ENTRE 1 AL 4.\n\n");
				}

			}while(!capturador.matches("^[1-4]$"));
		}

	public static void menuUsuarios(Contenedor contenedor){
		String capturador;
		do{
			//Utilidades.escribir("\n\t--MENÚ PRINCIPAL--\n");
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
					crearAdministrador(contenedor);
					break;
				case "5":
					//Utilidades.escribir("\t-- REGRESANDO AL MENÚ PRINCIPAL --\n\n");
					menuPrincipal(contenedor);
					break;
				default:
					Utilidades.escribir("[!] OPCIÓN INGRESADA NO ES VÁLIDA, SÓLO INGRESE VALORES ENTRE 1 AL 5.\n\n");
			}

		}while(!capturador.matches("^[1-5]$"));
	}

	public static void menuInformes(Contenedor contenedor){
		String capturador;
		do{
			Utilidades.escribir("\n\t-- MENÚ INFORMES --\n");
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
					contenedor.listarUsuarios();
					menuInformes(contenedor);
					break;
				case "2":
					//Utilidades.escribir("\t-- MOSTRAR TODOS LOS USUARIOS POR TIPO --\n\n");
					menuFiltrarUsuariosPorTipo(contenedor);
					//menuInformes(contenedor);
					break;
				case "3":
					Utilidades.escribir("\t-- MOSTRAR CAPACITACIONES --\n\n");
					contenedor.listarCapacitaciones();
					menuInformes(contenedor);
					break;
				case "4":
					Utilidades.escribir("\t-- MOSTRAR VISITAS --\n\n");
					Utilidades.escribir("NO IMPLEMENTADO AÚN");
					break;
				case "5":
					//Utilidades.escribir("\t-- REGRESANDO AL MENÚ PRINCIPAL --\n\n");
					menuPrincipal(contenedor);
					break;
				default:
					Utilidades.escribir("[!] OPCIÓN INGRESADA NO ES VÁLIDA, SÓLO INGRESE VALORES ENTRE 1 AL 5.\n\n");
			}

		}while(!capturador.matches("^[1-5]$"));
	}

	public static void menuFiltrarUsuariosPorTipo(Contenedor contenedor){
		String capturador;
		do{
			Utilidades.escribir("\n\t-- SELECCIONE PARA APLICAR FILTRO --\n");
			Utilidades.escribir("\n\t1. MOSTRAR CLIENTES" +
								"\n\t2. MOSTRAR ADMINISTRATIVOS" +
								"\n\t3. MOSTRAR PROFESIONALES" +
								"\n\t4. VOLVER\n\n"
			);

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
					//Utilidades.escribir("\t-- VOLVER --\n\n");
					menuInformes(contenedor);
					break;
				default:
					Utilidades.escribir("[!] OPCIÓN INGRESADA NO ES VÁLIDA, SÓLO INGRESE VALORES ENTRE 1 AL 4.\n\n");
			}

		}while(!capturador.matches("^[1-4]$"));
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
		
		contenedor.almacenarUsuario(usuario);
		Utilidades.escribir("El Usuario ha sido guardado exitosamente");
		
		//contenedor.listarUsuarios();

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

					//TODO: PREGUNTAR SI DESEA SEGUIR INGRESANDO VISITAS AL MISMO CLIENTE
					//INVOCAR AL MENÚ PARA MANTENER EL LOOP
					menuPrincipal(contenedor);
				}else {
					//NO EXISTE USUARIO
				}
			}
		}while(!input.matches(regEx));

    }
	
	/**
	 * Realiza validaciones antes de invocar al método que permite instanciar objetos capacitaciones
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
				Utilidades.escribir("Error de Ingreso, Debe escribir RUT del Cliente.\n");
			}else if(!input.matches(regEx)) {
				Utilidades.escribir("Error de Ingreso, sólo se aceptan números\n");
			}else {
				registrarCapacitacion(contenedor, input);
			}
		}while(!input.matches(regEx));
	}

	/**
	 * Permite Instanciar Objetos Capacitación cuanto pasa por todas las validaciones
	 * @param contenedor
	 * @param input tipo long
	 */
	public static void registrarCapacitacion(Contenedor contenedor, String input){
		//VALIDACION CORRECTA
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
			contenedor.listarCapacitaciones();

			Utilidades.escribir("Se ha creado la Capacitación correctamente.\n");

			//PREGUNTA SI DESEA SEGUIR INGRESANDO CAPACITACIONES AL MISMO CLIENTE
			String respuesta;
			do{
				respuesta = Utilidades.ingresar("¿Desea continuar ingresando otra Capacitación? ('s'/'n')");
				if(respuesta.equalsIgnoreCase("s")){
					//CONTINUAR CON OTRO INGRESO
					crearCapacitacion(contenedor);
				}else if(respuesta.equalsIgnoreCase("n")){
					//VOLVER AL MENU PRINCIPAL


				}else{
					Utilidades.escribir("[!] Error de ingreso. opción ingresada no válida. (s|n)");
				}
			}while(!respuesta.trim().matches("^[sn]$"));
			//VOLVER AL MENÚ
		}else {
			//NO EXISTE USUARIO
			Utilidades.escribir("RUT ingresado no existe en la base de datos.\n");
			crearCapacitacion(contenedor);
		}
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
