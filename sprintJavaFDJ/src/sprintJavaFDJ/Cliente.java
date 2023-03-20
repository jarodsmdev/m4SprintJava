package sprintJavaFDJ;

import java.util.ArrayList;

/** @author Leonel Briones, Priscila Carrillo, Andres Contreras, Kevin Moreno, Valentina Saldias*/
/**@version 13/03 */
public class Cliente extends Usuario {

	/** definicion de parametros de la clase Cliente */
	private String nombre;
	private String apellido;
	private int telefono;
	private String afp; 
	private String sistemaSalud; 
	private String direccion; 
	private String comuna;
	private int edad; 
	private ArrayList<Accidente> listaAccidentes = new ArrayList<Accidente>();
	private ArrayList<VisitaEnTerreno> listaVisitaEnTerreno = new ArrayList<VisitaEnTerreno>(); 
	
	/** Constructor vacío */
	public Cliente() {}
	
	/** Constructor con los atributos como parametros*/
	public Cliente(String nombreUsuario, String fechaNacimiento, long rut,  String nombre, String apellido, int telefono, String afp, String sistemaSalud, String direccion, String comuna, int edad) {
		super(nombreUsuario, fechaNacimiento, rut);
		this.nombre = nombre;
		this.apellido = apellido; 
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion; 
		this.comuna = comuna;
		this.edad = edad;
	}
	/** @param NOMBRE tipo String
	 * Obligatorio; minimo 5 caracteres - maximo 30
	 * */
	public void setNombre(String nombre) {
		do {
			nombre = nombre.trim();
			if (nombre != null && nombre.length() >= 5 && nombre.length() <= 30) {
				this.nombre = nombre;
			} else {
				Utilidades.escribir("Error de ingreso. Rango de caracteres entre 5 y 30\n");
				nombre = Utilidades.ingresar("Ingrese Nombre:");
			}
		} while (nombre == null || nombre.length() < 5 || nombre.length() > 30);
	}
	
	
	public String getNombre() {
		return nombre; 
	}
	
	/** @param APELLIDO
	 * Obligatorio; minimo 5 caracteres - maximo 30
	 * SETTER Y GETTER */
	public void setApellido(String apellido) {
		do {
			if (apellido.length() > 4 && apellido.length() < 31) {
				this.apellido = apellido;
				break;
			}
			else {
				//opcion invalida
				Utilidades.escribir("[ERROR] Debe tener entre 5 y 30 caracteres\n");
				apellido = Utilidades.ingresar("Ingrese Apellido [Entre 5 y 30 caracteres]: ");
			}
		}while(true);
	}
	public String getApellido() {
		return apellido;
	}
	
	/** @param TELEFONO
	 * Obligatorio
	 * SETTER Y GETTER */
	public void setTelefono(String telefono) {
		String regEx = "^[0-9]+$";
		 
		do {
			if (!telefono.matches(regEx)) {
				Utilidades.escribir("[ERROR] Sólo se aceptan números.\n");
				telefono = Utilidades.ingresar("Ingrese el número de teléfono del cliente");
			}
			else if (telefono.length() < 9) {
				this.telefono = Integer.parseInt(telefono);
				break;
			}
			else if(telefono.length() > 8) {
				Utilidades.escribir("[ERROR] El teléfono no puede superar 8 caracteres\n");
				telefono = Utilidades.ingresar("Ingrese el número de teléfono del cliente");
			}
		} while(true);
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTelefono() {
		return telefono;
	}
	
	/** @param AFP
	 * Minimo 4 caracteres - maximo 30
	 *  SETTER Y GETTER */
	public void setAfp(String afp) {

		do {
			if (afp.length() > 0 && afp.length() < 4) {
				// opcion inválida
				Utilidades.escribir("[ERROR] Ha ingresado menos del Mínimo de caracteres permitidos. Inténtelo otra vez.\n");
				afp = Utilidades.ingresar("Ingrese el nombre de la AFP del cliente [Entre 4 y 30 caracteres]: ");
			} else if (afp.length() > 30) {
				// opcion inválida
				Utilidades.escribir("[ERROR] Ha superado el máximo de caracteres. Inténtelo otra vez.\n");
				afp = Utilidades.ingresar("Ingrese el nombre de la AFP del cliente [Entre 4 y 30 caracteres]: ");
			} else {
				this.afp = afp;
				break;
			}
		} while (true);

	}
	
	/**
	 * 
	 * @return tipo String
	 */
	public String getAfp() {
		return afp;
	}
	
	/** @param SISTEMA DE SALUD 
	 * 1 FONASA / 2 ISAPRE
	 * SETTER, GETTER */

	public void setSistemaSalud(String sistemaSalud) {
		
		do {
			if(sistemaSalud.equals("1") || sistemaSalud.equals("2")) {
				this.sistemaSalud = sistemaSalud;
				break;
			} else if(sistemaSalud.isEmpty()) {
				Utilidades.escribir("[ERROR] Ingrese una opcion válida.\n");
				sistemaSalud = Utilidades.ingresar("Ingrese Sistema de Salud: 1 FONASA || 2 ISAPRE");
			} else {
				Utilidades.escribir("[ERROR] Ingrese una opcion válida.\n");
				sistemaSalud = Utilidades.ingresar("Ingrese Sistema de Salud: 1 FONASA || 2 ISAPRE");
			}
		}while(true);
	}
	
	/**
	 * 
	 * @return
	 */
	public String getSistemaSalud() {
		return sistemaSalud;
	}
	
	/** @param DIRECCION
	 * Maximo 70 caracteres
	 * SETTER Y GETTER */
	public void setDireccion(String direccion) {
	
		do {
			if(direccion.length() < 71) {
				this.direccion = direccion; 
				break;
			}else {
				//opcion invalida
				Utilidades.escribir("[ERROR] Ha superado el límite de caracteres\n");
				direccion = Utilidades.escribir("Ingrese la dirección [Máx 70 caracteres]:");
			}
		}while(true);
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/** @param COMUNA 
	 * Maximo 50 caracteres
	 * SETTER Y GETTER */
	public void setComuna(String comuna) {
		
		do {
			if(comuna.length() < 51) {
				this.comuna = comuna; 
				break;
			}else {
				//opcion invalida
				Utilidades.escribir("Ha superado el máximo de caracteres");
				comuna = Utilidades.ingresar("Ingrese la comuna [Máx 50 caracteres]: ");
			}
		}while(true);
	}
	
	/**
	 * 
	 * @return
	 */
	public String getComuna() {
		return comuna;
	}
	
	/** @param EDAD 
	 * Obligatorio: mayor o igual a 0 - menor que 150
	 * SETTER Y GETTER*/
	public void setEdad(String edad) {
		String regEx = "^[0-9]+$";
		do {
			if(!edad.trim().matches(regEx)){
				//opcion invalida
				Utilidades.escribir("Ingrese una edad válida [0 - 150]\n");
				edad = Utilidades.ingresar("Ingrese su edad [0 - 150]");
			}else if(Integer.parseInt(edad) > -1 && Integer.parseInt(edad) < 151) {
					this.edad = Integer.parseInt(edad);
					break;
			}else{
				//opcion invalida
				Utilidades.escribir("Ingrese una edad válida [0 - 150]\n");
				edad = Utilidades.ingresar("Ingrese su edad [0 - 150]");
			}
		}while(true);
	}
	
	/**
	 * 
	 * @return
	 */
	public int getEdad() {
		return edad;
	}
	
	
	
	/** METODO OBTENER NOMBRE = NOMBRE Y APELLIDOS CONCATENADOS*/
	public String obtenerNombre() {
		return (nombre + " " + apellido);
	}
	
	/** METODO QUE RETORNA EL SISTEMA DE SALUD DEL CLIENTE */
	public String obtenerSistemaSalud(int sistemaSalud) {
//		sistemaSalud = Integer.parseInt(getSistemaSalud()); 
		if(sistemaSalud == 1) {
			return "FONASA";
		}
		else {
			return "ISAPRE";
		}
	}
	
	/**
	 * DEBE MOSTRAR LOS DATOS DE LA CLASE USUARIO + DIRECCION Y COMUNA DEL CLIENTE
	 */
	@Override
	public String analizarUsuario() {
		return "Cliente: " + getNombre() + ", RUN: " + getRun() + ", Dirección: " + getDireccion() + ", Comuna: " + getComuna();
	}

	
	/** METODO QUE AGREGA ACCIDENTES A ARRAYLIST QUE ALMACENA TODOS LOS ACCIDENTES DEL CLIENTE*/
	public void agregarAccidente(Accidente nuevoAccidente) {
		listaAccidentes.add(nuevoAccidente);
	}
	/** METODO QUE AGREGA VISITAS A TERRENO A UN ARRAYLIST QUE GUARDA TODAS LAS VISITAS A TERRENO DEL CLIENTE */
	public void agregarVisitaTerreno(VisitaEnTerreno nuevaVisita) {
			listaVisitaEnTerreno.add(nuevaVisita);
	}

	/**
	 * Getter para obtener array
	 * @return
	 */
	public ArrayList<VisitaEnTerreno> getListaVisitas(){
		return listaVisitaEnTerreno;
	}

	public ArrayList<Accidente> getListaAccidentes(){
		return listaAccidentes;
	}

	/**
	 * Método que muestra todas las visitas
	 * @return
	 */
	public String mostrarVisitas(){
		String visitas = "";
		for(int i = 0; i < listaVisitaEnTerreno.size() ; i++){
			visitas = ((i+1) + ". " + listaVisitaEnTerreno.get(i).toString()+ "\n") + visitas;
		}
		return visitas;
	}

	/**
	 * Método que permite mostrar todos los accidentes asociados al cliente
	 */
	public void mostrarAccidentes(long rut){
		
		int i = 0;
		
		for(Accidente objAccidente : listaAccidentes){
			if(objAccidente.getRutCliente() == rut){
				Utilidades.escribir( (i + 1 ) + ". " + objAccidente.toString() + "\n");
				i++;
			}
		}
	}
	
	/**
	 * Sobrescribe el método analizarUsuario() de la clase padre. Imprime una cadena
	 * que representa al usuario cliente
	 */
	@Override
	public String toString() {
		return "Cliente: \n Nombre Usuario: " + getNombreUsuario() + ", RUN: " + getRun() + ", Fecha Nacimiento: " + getFechaNacimiento() + "\n Nombre Cliente: " + obtenerNombre() + "\n Telefono: " + getTelefono() + "\n AFP: " + getAfp() + "\n Sistema de Salud: " + getSistemaSalud() + "\n Direccion: " + getDireccion() + "\n Comuna: " + getComuna() + "\n Edad: " + getEdad();
		
	}

	/**
	 * Sobre escribe el método soloUsuario de la superClase, Imprime una cadena
	 * @return Una cadena de texto con la información: nombre, rut, y fecha de nacimiento del Cliente
	 */
	@Override
	public String soloUsuario() {
		return "[CLIENTE] Nombre Usuario: " + getNombreUsuario() + ", RUT: " + getRun() + ", Fecha de Nacimiento: " + getFechaNacimiento() ;	
	}
}