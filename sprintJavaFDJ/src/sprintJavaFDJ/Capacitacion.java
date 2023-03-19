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
	public void setId() {
		//MÉTODO INNECESARIO ID AUTOINCREMENTAL
		String id = Utilidades.ingresarObligatorio("Ingrese el ID de la capacitacion");
			do {
				if(id.length() != 0) {
					this.id = Integer.parseInt(id);
					break;
				}
			}while(true);
	}

	/**
	 * 
	 * @return
	 */
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

		do{
			if(dia.toUpperCase().matches("LUNES") ||
				dia.toUpperCase().matches("MARTES") ||
				dia.toUpperCase().matches("MIERCOLES") ||
				dia.toUpperCase().matches("JUEVES") ||
				dia.toUpperCase().matches("VIERNES") ||
				dia.toUpperCase().matches("SABADO") ||
				dia.toUpperCase().matches("DOMINGO"))
			{
				this.dia = dia;
				break;
			}
			else {
				Utilidades.escribir("[ERROR] Ingrese un dia de la semana válido.\n");
				dia = Utilidades.ingresar("Ingrese día de la Semana: (Ej.: 'Lunes') ");
			}
		}while(true);
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
				Utilidades.escribir("[ERROR] Ingrese una hora válida. HH:MM\n");
				hora = Utilidades.ingresar("Ingrese hora formato [HH:MM]: ");
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

		do{
			if(lugar.length() > 9 && lugar.length() < 51) {
				this.lugar = lugar;
				break;
			}
			else {
				Utilidades.escribir("[ERROR] Obligatorio, cantidad de caracteres debe estar entre 10 y 50.\n");
				lugar = Utilidades.ingresar("Ingrese Lugar (Texto entre 10 y 50 caracteres): ");
			}
		}while(true);
	}
	
	public String getLugar() {
		return lugar;
	}
	
	/** @param DURACION 
	 * Maximo 70 caracteres
	 * SETTER Y GETTER */
	public void setDuracion(String duracion) {
	    do {
			if (duracion.length() == 0) {
				this.duracion = duracion;
				break;
			} else if (!Utilidades.esNumerica(duracion)) {
				Utilidades.escribir("[ERROR] Debe ingresar un número\n");
				duracion = Utilidades.ingresar("Ingrese Duración en minutos: ");
			} else if (Integer.parseInt(duracion) > 70) {
				Utilidades.escribir("[ERROR] Caracteres máximos 70\n");
				duracion = Utilidades.ingresar("Ingrese Duración en minutos: ");
			} else {
				this.duracion = duracion;
				break;
			}
		} while (true);
	}
	public String getDuracion() {
		return duracion;
	}
	
	/** @param CANTIDAD DE ASISTENTES
	 * Obligatorio; int menor que 1000
	 * SETTER Y GETTER*/
	public void setCantidadAsistentes(int cantidadAsistentes) {
		String capturador = null;
		do{
			if(cantidadAsistentes > 0 && cantidadAsistentes < 1000 || Utilidades.esNumerica(capturador)) {
				this.cantidadAsistentes = cantidadAsistentes;
				break;
			}
			else {
				Utilidades.escribir("[ERROR] Ingrese una cantidad válida de asistentes.\n");
				capturador = Utilidades.ingresar("Ingrese cantidad de asistentes (Máximo 999): ");
				if(Utilidades.esNumerica(capturador)){
					cantidadAsistentes = Integer.parseInt(capturador);
				}
			}
		}while(true);
	}
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}
	
	/** METODO MOSTRAR DETALLES CAPACITACIONES*/
	public void mostrarDetalle() {
		Utilidades.ingresar("La capacitación será en " + getLugar() + "\n A las " + getHora() + " del día " + getDia() + "\n Y durará " + getDuracion() + " minutos.");
	}
	
	/** SOBREESCRITURA DEL METODO TOSTRING() */
	@Override
	public String toString() {
		return "Capacitación ID: " + getId() + "\n Rut Cliente: " + getRut() + "\n Lugar: " + getLugar() + "\n Día: "+ getDia() + "\n Hora: " + getHora() + "\n Duración: " + getDuracion() + "\n Cantidad Asistentes: " + getCantidadAsistentes() + "\n";
	}
}