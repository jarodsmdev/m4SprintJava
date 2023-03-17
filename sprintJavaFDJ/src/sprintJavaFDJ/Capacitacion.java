package sprintJavaFDJ;

/** @author Leonel Briones, Priscila Carrillo, Andres Contreras, Kevin Moreno, Valentina Saldias*/
/**@version 13/03 */

public class Capacitacion{
	private int id;
	private static int idSiguiente;
	private long rut; //SE CAMBIA DE TIPO CLIENTE A LONG PARA CONTINUAR CON LA RELACION DE TIPO AGREGACION
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadAsistentes;
	
	
	/** metodo constructor vacio*/
	public Capacitacion() {
		++idSiguiente;
		id = idSiguiente;
	}
	
	/** metodo constructor con los atributos como parametros */
	public Capacitacion(long rut, String dia, String hora, String lugar, String duracion, int cantidadAsistentes ) {
		++idSiguiente;
		this.id = idSiguiente;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}
	
	/**@param IDS
	 * Obligatorio
	 * SETTER Y GETTER */
	public void setId(int id) {
		//ID AUTOINCREMENTAL MÉTODO INNECESARIO
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	/** @param RUT 
	 * Obligatorio
	 * SETTER Y GETTER */
	public void setRut(long rut) {
		this.rut = rut;
	}

	/**
	 * MÉTODO QUE RETORNA RUT DEL CLIENTE
	 * @return rut tipo long
	 */
	public long getRut() {
		return rut;
	}
	
	/** @param DIA
	 * Texto 
	 * SETTER Y GETTER*/
	public void setDia(String dia) {
		if(dia.toUpperCase().matches("LUNES") ||
			dia.toUpperCase().matches("MARTES") ||
			dia.toUpperCase().matches("MIERCOLES") ||
			dia.toUpperCase().matches("JUEVES") ||
			dia.toUpperCase().matches("VIERNES") ||
			dia.toUpperCase().matches("SABADO") ||
			dia.toUpperCase().matches("DOMINGO")) {
			this.dia = dia;
		}
		else {
			Utilidades.ingresar("Ingrese un día válido.");
		}
	}

	
	/**
	 * Método que retorna dia
 	 * @return dia tipo String
	 */
	public String getDia() {
		return dia;
	}
	
	/** @param HORA 
	 * HH : MM
	 * SETTER Y GETTER */
	public void setHora(String hora) {
		String regEx = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$";

		do{
			if(hora.matches(regEx)) {
				this.hora = hora;
			}
			else {
				Utilidades.ingresar("Ingrese una hora válida. HH:MM");
			}
		}while(!hora.matches(regEx));
	}

	/**
	 * Método que retorna hora formato HH:MM
	 * @return hora tipo String 
	 */
	public String getHora() {
		return hora;
	}
	
	
	/** @param LUGAR 
	 * Obligatorio; minimo 10 caracteres - maximo 50
	 * SETTER Y GETTER */
	public void setLugar(String lugar) {
		if(lugar.length() > 11 && lugar.length() < 51) {
			this.lugar = lugar; 
		}
		else {
			Utilidades.escribir("Ha superado el límite de caracteres");
		}
	}
	public String getLugar() {
		return lugar;
	}
	
	/** @param DURACION 
	 * Maximo 70 caracteres
	 * SETTER Y GETTER */
	public void setDuracion(String duracion) {
		if(duracion.length() < 71) {
			this.duracion = duracion;
		}
		else{
			Utilidades.escribir("Ha superado el límite de caracteres");
		}
	}
	public String getDuracion() {
		return duracion;
	}
	
	/** @param CANTIDAD DE ASISTENTES
	 * Obligatorio; int menor que 1000
	 * SETTER Y GETTER*/
	public void setCantidadAsistentes(int cantidadAsistentes) {
		if(cantidadAsistentes < 1000) {
			this.cantidadAsistentes = cantidadAsistentes;
		}
		else {
			Utilidades.escribir("Ingrese una cantidad válida de asistentes.");
		}
	}
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}
	
	/** METODO MOSTRAR DETALLES CAPACITACIONES*/
	public void mostrarDetalle() {
		Utilidades.escribir("La capacitación será en " + getLugar() + "\n A las " + getHora() + " del día " + getDia() + "\n Y durará " + getDuracion() + " minutos.");
	}
	
	/** SOBREESCRITURA DEL METODO TOSTRING() */
	@Override
	public String toString() {
		return "Capacitación ID: " + getId() + "\n Rut Cliente: " + getRut() + "\n Lugar: " + getLugar() + "\n Día: "+ getDia() + "\n Hora: " + getHora() + "\n Duración: " + getDuracion() + "\n Cantidad Asistentes: " + getCantidadAsistentes() + "\n";
	}
}