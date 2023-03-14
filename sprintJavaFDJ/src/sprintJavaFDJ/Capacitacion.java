package sprintJavaFDJ;
/** @author Leonel Briones, Priscila Carrillo, Andres Contreras, Kevin Moreno, Valentina Saldias*/
/**@version 13/03 */
public class Capacitacion {
	private int iD;
	private long rut;
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
		this.iD = iD;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}
	
	/**@param ID
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
	public void setRut(long rut) {
		this.rut = rut;
	}
	public long getRut() {
		return rut;
	}
	
	/** @param DIA
	 * Texto 
	 * SETTER Y GETTER*/
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getDia() {
		return dia;
	}
	
	/** @param HORA 
	 * HH : MM
	 * SETTER Y GETTER */
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getHora() {
		return hora;
	}
	
	
	/** @param LUGAR 
	 * Obligatorio; minimo 10 caracteres - maximo 50
	 * SETTER Y GETTER */
	public void setLugar(String lugar) {
		this.lugar = lugar; 
	}
	public String getLugar() {
		return lugar;
	}
	
	/** @param DURACION 
	 * Maximo 70 caracteres
	 * SETTER Y GETTER */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getDuracion() {
		return duracion;
	}
	
	/** @param CANTIDAD DE ASISTENTES
	 * Obligatorio; int menor que 1000
	 * SETTER Y GETTER*/
	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}
}
