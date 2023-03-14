package sprintJavaFDJ;
/** @author Leonel Briones, Priscila Carrillo, Andres Contreras, Kevin Moreno, Valentina Saldias*/
/**@version 13/03 */
public class Capacitacion extends Cliente{
	private int iD;
	private Cliente rut;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadAsistentes;
	
	
	/** metodo constructor vacio*/
	public Capacitacion() {
	}
	
	/** metodo constructor con los atributos como parametros */
	public Capacitacion(int iD, long rut, String dia, String hora, String lugar, String duracion, int cantidadAsistentes ) {
		super.getRun();
		this.iD = iD;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}
	
	/**@param IDS
	 * Obligatorio
	 * SETTER Y GETTER */
	public void setID(int iD) {
		this.iD = iD;
	}
	public int getID() {
		return iD;
	}
	
	/** @param RUT 
	 * Obligatorio
	 * SETTER Y GETTER */
	public void setRut(Cliente rut) {
		this.rut = rut;
	}
	public Cliente getRut() {
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
			Utilidades.escribir("Ingrese un dia valido.");
		}
	}
	public String getDia() {
		return dia;
	}
	
	/** @param HORA 
	 * HH : MM
	 * SETTER Y GETTER */
	public void setHora(String hora) {
		if(hora.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")) {
			this.hora = hora;
		}
		else {
			Utilidades.escribir("Ingrese una hora valida. HH:MM");
		}
	}
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
			Utilidades.escribir("Ha superado el limite de caracteres");
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
			Utilidades.escribir("Ha superado el limite de caracteres");
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
			Utilidades.escribir("Ingrese una cantidad valida de asistentes.");
		}
	}
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}
	
	public void mostrarDetalle() {
		Utilidades.escribir("La capacitacion será en " + getLugar() + "\n A las " + getHora() + " del día " + getDia() + "\n Y durara " + getDuracion() + " minutos.");
	}
}
