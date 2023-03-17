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
	private char sistemaSalud; 
	private String direccion; 
	private String comuna;
	private int edad; 
	private ArrayList <Capacitacion> numeroCapacitacion = new ArrayList<Capacitacion>();
	private int cantidadCapacitaciones;
	private ArrayList<Accidente> numeroAccidente = new ArrayList<Accidente>();
	private int cantidadAccidentes;
	private ArrayList<VisitaEnTerreno> numeroVisitaTerreno = new ArrayList<VisitaEnTerreno>();
	private int cantidadVisitas; 
	
	/** Constructor vacío */
	public Cliente() {}
	
	/** Constructor con los atributos como parametros*/
	public Cliente(String nombreUsuario, String fechaNacimiento, long rut,  String nombre, String apellido, int telefono, String afp, char sistemaSalud, String direccion, String comuna, int edad) {
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
			if (nombre.length() > 4 && nombre.length() < 31) {
				this.nombre = nombre; 
			}
			else {
				//opcion invalida
				Utilidades.ingresar("Error de ingreso. Rango de caracteres entre 5 y 30");
			}
		}while(nombre.length() < 5 || nombre.length() > 30);
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
			}
			else {
				//opcion invalida
				Utilidades.ingresar("Ha superado el límite de caracteres");
			}
		}while(apellido.length() < 5 || apellido.length() > 30);
	}
	public String getApellido() {
		return apellido;
	}
	
	/** @param TELEFONO
	 * Obligatorio
	 * SETTER Y GETTER */
	public void setTelefono(int telefono) {
		this.telefono = telefono; 
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
			if(afp.length()> 3 && afp.length()<31) {
				this.afp = afp;

			}else {
				//opcion invalida
				Utilidades.ingresar("Ha superado el máximo de caracteres");
			}
		}while(afp.length() < 4  && afp.length()> 30);

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
	public void setSistemaSalud(char sistemaSalud) {
		do {
			if(sistemaSalud == '1' || sistemaSalud == '2') {
				this.sistemaSalud = sistemaSalud;
			}else {
				//opcion invalida
				Utilidades.ingresar("Ingrese una opcion válida. 1 FONASA || 2 ISAPRE");
			}
		}while(sistemaSalud != '1' && sistemaSalud != '2');
	}
	
	/**
	 * 
	 * @return
	 */
	public char getSistemaSalud() {
		return sistemaSalud;
	}
	
	/** @param DIRECCION
	 * Maximo 70 caracteres
	 * SETTER Y GETTER */
	public void setDireccion(String direccion) {
		do {
			if(direccion.length() < 71) {
				this.direccion = direccion; 
			}else {
				//opcion invalida
				Utilidades.ingresar("Ha superado el límite de caracteres");
			}
		}while(direccion.length() > 70);
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
			}else {
				//opcion invalida
				Utilidades.ingresar("Ha superado el máximo de caracteres");
			}
		}while(comuna.length() > 50);
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
	public void setEdad(int edad) {
		do {
			if(edad > -1 && edad < 150) {
				this.edad = edad; 
			}else{
				//opcion invalida
				Utilidades.ingresar("Ingrese una edad válida [0-149]");
			}
		}while(edad < 0 || edad > 149);
	}
	
	/**
	 * 
	 * @return
	 */
	public int getEdad() {
		return edad;
	}
	
	/** @param CANTIDAD DE CAPACITACIONES
	 * SETTER Y GETTER */
	public void setCantidadCapacitaciones(int cantidadCapacitaciones) {
		this.cantidadCapacitaciones = cantidadCapacitaciones;
	}
	public int getCantidadCapacitaciones() {
		return cantidadCapacitaciones;
	}
	
	/** @param CANTIDAD DE ACCIDENTES
	 * SETTER Y GETTER*/
	public void setCantidadAccidentes(int cantidadAccidentes) {
		this.cantidadAccidentes = cantidadAccidentes;
	}
	public int getCantidadAccidentes() {
		return cantidadAccidentes;
	}
	
	/** @param CANTIDAD DE VISITAS EN TERRENO
	 * SETTER Y GETTER*/
	public void setCantidadVisitas(int cantidadVisitas) {
		this.cantidadVisitas = cantidadVisitas;
	}
	public int getCantidadVisitas() {
		return cantidadVisitas;
	}
	
	/** METODO OBTENER NOMBRE = NOMBRE Y APELLIDOS CONCATENADOS*/
	public String obtenerNombre() {
		return Utilidades.ingresar(nombre + " " + apellido);
	}
	
	/** METODO QUE RETORNA EL SISTEMA DE SALUD DEL CLIENTE */
	public void obtenerSistemaSalud(char sistemaSalud) {
		if(sistemaSalud ==1) {
			Utilidades.ingresar("FONASA");
		}
		else {
			Utilidades.ingresar("ISAPRE");
		}
	}
	
	/**
	 * DEBE MOSTRAR LOS DATOS DE LA CLASE USUARIO + DIRECCION Y COMUNA DEL CLIENTE
	 */
	@Override
	public String analizarUsuario() {
		return "Cliente: " + getNombre() + ", RUT: " + getRun() + ", Dirección: " + getDireccion() + ", Comuna: " + getComuna();
	}

	/** METODO  QUE AGREGA CAPACITACIONES A ARRAYLIST QUE CONTIENEN TODAS LAS CAPACITACIONES DE CADA CLIENTE*/
	public void agregarCapacitacion(Capacitacion nuevaCapacitacion) {
		if(numeroCapacitacion.size() > -1) {
			numeroCapacitacion.add(nuevaCapacitacion);
			cantidadCapacitaciones++;
		}
	}
	/** METODO QUE AGREGA ACCIDENTES A ARRAYLIST QUE ALMACENA TODOS LOS ACCIDENTES DEL CLIENTE*/
	public void agregarAccidente(Accidente nuevoAccidente) {
		if (numeroAccidente.size() > -1) {
			numeroAccidente.add(nuevoAccidente);
			cantidadAccidentes++;
		}
	}
	/** METODO QUE AGREGA VISITAS A TERRENO A UN ARRAYLIST QUE GUARDA TODAS LAS VISITAS A TERRENO DEL CLIENTE */
	public void agregarVisitaTerreno(VisitaEnTerreno nuevaVisita) {
		if(numeroVisitaTerreno.size() > 0 ) {
			numeroVisitaTerreno.add(nuevaVisita);
			cantidadVisitas++;
		}
	}
	
	/** METODOS QUE MUESTRAN LA CANTIDAD DE CAPACITACIONES, VISITAS A TERRENO Y ACCIDENTES DEL CLIENTE*/
	
	public void mostrarCantCapacitaciones() {
		Utilidades.ingresar("El cliente " + obtenerNombre() + " ha realizado " + cantidadCapacitaciones + " capacitaciones." );
	}
	public void mostrarCantAccidentes() {
		Utilidades.ingresar("El cliente " + obtenerNombre() + " ha tenido " + cantidadAccidentes + " accidentes.");
	}
	public void mostrarCantVisitasTerreno() {
		Utilidades.ingresar("El cliente " + obtenerNombre() + " ha recibido " + cantidadVisitas + " visitas a terreno.");
	}
	@Override
	public String toString() {
		return "Cliente: " + obtenerNombre() + "\n Telefono: " + getTelefono() + "\n AFP: " + getAfp() + "\n Sistema de Salud: " + getSistemaSalud() + "\n Direccion: " + getDireccion() + "\n Comuna: " + getComuna() + "\n Edad: " + getEdad();
		
	}
}