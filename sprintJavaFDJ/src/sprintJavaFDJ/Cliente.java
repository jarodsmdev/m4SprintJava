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
	private ArrayList <Capacitacion> numeroCapacitacion = new ArrayList<Capacitacion>();
	private int cantidadCapacitaciones;
	private ArrayList<Accidente> numeroAccidente = new ArrayList<Accidente>();
	private int cantidadAccidentes;
	private ArrayList<VisitaEnTerreno> numeroVisitaTerreno = new ArrayList<VisitaEnTerreno>();
	private int cantidadVisitas;  
	
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
	public void setNombre() {
		String capt = Utilidades.ingresarObligatorio("Ingrese nombre del cliente");
		do {
//			System.out.println(capt.length()); //debug
			if(capt.length() > 4 && capt.length() < 31) {
					this.nombre = capt;
					break;
				}
			else {
				//opcion invalida
				capt = Utilidades.ingresarObligatorio("Error de ingreso. Rango de caracteres entre 5 y 30");
			}
		}while(true);
	}
	
	public String getNombre() {
		return nombre; 
	}
	
	/** @param APELLIDO
	 * Obligatorio; minimo 5 caracteres - maximo 30
	 * SETTER Y GETTER */
	public void setApellido() {
		String apellido = Utilidades.ingresarObligatorio("Ingrese el apellido del cliente");
		do {
			if (apellido.length() > 4 && apellido.length() < 31) {
				this.apellido = apellido;
				break;
			}
			else {
				//opcion invalida
				apellido = Utilidades.ingresarObligatorio("Debe tener entre 5 y 30 caracteres");
			}
		}while(true);
	}
	public String getApellido() {
		return apellido;
	}
	
	/** @param TELEFONO
	 * Obligatorio
	 * SETTER Y GETTER */
	public void setTelefono() {
		String regEx = "^[0-9]+$";
		String telefono = Utilidades.ingresarObligatorio("Ingrese el numero de telefono del cliente");
		do {
			if (!telefono.matches(regEx)) {
				telefono = Utilidades.ingresarObligatorio("Solo se aceptan numeros");
			}
			else if (telefono.length() < 9) {
				this.telefono = Integer.parseInt(telefono);
				break;
			}
			else if(telefono.length() > 8) {
				telefono = Utilidades.ingresarObligatorio("Error: El telefono no puede superar 8 caracteres");
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
	public void setAfp() {
		String afp = Utilidades.ingresar("Ingrese el nombre de la AFP del cliente");
		do {
			if(afp.length()> 3 && afp.length()<31) {
				this.afp = afp;
				break;
			}else if(afp.length() < 4  && afp.length()> 30) {
				//opcion invalida
				afp = Utilidades.ingresar("Ha superado el máximo de caracteres. Intentelo otra vez. ");
			}
			else {
				break;
			}
		}while(true);

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
	public void setSistemaSalud() {
		String sistemaSalud = Utilidades.ingresar("Ingrese Sistema de Salud: 1 FONASA || 2 ISAPRE");
		do {
			if(sistemaSalud == "1" || sistemaSalud == "2" || sistemaSalud.length() == 0) {
				this.sistemaSalud = sistemaSalud;
				break;
			}else {
				//opcion invalida
				sistemaSalud = Utilidades.ingresar("Ingrese una opcion válida. 1 FONASA || 2 ISAPRE");
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
	public void setDireccion() {
		String direccion = Utilidades.ingresar("Ingrese la dirección");
		do {
			if(direccion.length() < 71) {
				this.direccion = direccion; 
				break;
			}else {
				//opcion invalida
				direccion = Utilidades.escribir("Ha superado el límite de caracteres");
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
	public void setComuna() {
		String comuna = Utilidades.ingresar("Ingrese la comuna");
		do {
			if(comuna.length() <= 50) {
				this.comuna = comuna; 
				break;
			}else {
				//opcion invalida
				comuna = Utilidades.escribir("Ha superado el máximo de caracteres");
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
	public void setEdad() {
		String edad = Utilidades.ingresarObligatorio("Ingrese su edad");
		do {
			if(Integer.parseInt(edad) > -1 && Integer.parseInt(edad) < 150) {
				this.edad = Integer.parseInt(edad); 
				break;
			}else{
				//opcion invalida
				Utilidades.escribir("Ingrese una edad válida [0-149]");
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
		return Utilidades.escribir(nombre + " " + apellido);
	}
	
	/** METODO QUE RETORNA EL SISTEMA DE SALUD DEL CLIENTE */
	public void obtenerSistemaSalud(String sistemaSalud) {
		if(sistemaSalud == "1") {
			Utilidades.escribir("FONASA");
		}
		else {
			Utilidades.escribir("ISAPRE");
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
		Utilidades.escribir("El cliente " + obtenerNombre() + " ha realizado " + cantidadCapacitaciones + " capacitaciones." );
	}
	public void mostrarCantAccidentes() {
		Utilidades.escribir("El cliente " + obtenerNombre() + " ha tenido " + cantidadAccidentes + " accidentes.");
	}
	public void mostrarCantVisitasTerreno() {
		Utilidades.escribir("El cliente " + obtenerNombre() + " ha recibido " + cantidadVisitas + " visitas a terreno.");
	}
	@Override
	public String toString() {
		return "Cliente: " + obtenerNombre() + "\n Telefono: " + getTelefono() + "\n AFP: " + getAfp() + "\n Sistema de Salud: " + getSistemaSalud()
		+ "\n Direccion: " + getDireccion() + "\n Comuna: " + getComuna() + "\n Edad: " + getEdad();
		
	}
}