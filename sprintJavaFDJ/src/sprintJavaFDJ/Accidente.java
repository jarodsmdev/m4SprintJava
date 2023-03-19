package sprintJavaFDJ;

/**
 * 
 * @author Leonel Briones, Kevin Moreno, Valentia Saldías, Priscila Carrillo, Andrés Contreras.
 *      
 */
public class Accidente {
	private int identificador;
	private static int idIdentificador;
	private long rutCliente;
	private String fecha;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;

	/**
	 * Constructores de la clase.
	 */
	public Accidente() {
		++idIdentificador;
		this.identificador = idIdentificador;
	}

//	public Accidente() {};
	/**
	 * 
	 * @param identificador: String
	 * @param cliente:       String
	 * @param fecha:         String
	 * @param hora:          String
	 * @param lugar:         String
	 * @param origen:        String
	 * @param consecuencias: String
	 */

	public Accidente(String identificador, Long rutCliente, String fecha, String hora, String lugar, String origen,
			String consecuencias) {

		++idIdentificador;
		this.identificador = idIdentificador;
		this.rutCliente = rutCliente;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;

	}

	/**
	 * 
	 * @return Metodos getter y setter de la clase Accidente que retornan el
	 *         identificador de tipo string.
	 */
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public long getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(long rutCliente) {
		do {
			if (rutCliente <= 99999999) {
				this.rutCliente = rutCliente;
			} else {
				Utilidades.ingresar("No puede exceder 99.999.999");
			}
		} while (rutCliente > 99999999);
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
		do {
			if (fecha.matches(regex)) {
				this.fecha = fecha;
				break;
			} else {
				Utilidades.escribir("[ERROR] La fecha no es válida\n");
				fecha = Utilidades.ingresar("Ingresar Fecha con formato [DD/MM/AAAA]: ");
			}
		} while (true);
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		String regex = "^(0?[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
		do {
			if (hora.matches(regex)) {
				this.hora = hora;
				break;
			} else {
				Utilidades.escribir("[ERROR] El formato de hora ingresada no es valida\n");
				hora = Utilidades.ingresar("Ingrese hora formato [HH:MM]: ");
			}
		} while (true);
	}

	public String getLugar() {
		return lugar;
	}

	/**
	 * 
	 * @param lugar
	 */
	public void setLugar(String lugar) {
		do {
			if (lugar.length() >= 10 && lugar.length() <= 50) {
				this.lugar = lugar;
				break;
			} else {
				Utilidades.escribir("[ERROR] Debe ingresar entre 10 y 50 caracteres\n");
				lugar = Utilidades.ingresar("Ingrese Lugar (Texto entre 10 y 50 caracteres): ");
			}
		} while (true);

	}

	/**
	 * 
	 * @return
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * 
	 * @param origen
	 */
	public void setOrigen(String origen) {
		do {
			if (origen.length() <= 100) {
				this.origen = origen;
				break;
			} else {
				Utilidades.escribir("[ERROR]No puede ingresar mas de 100 caracteres\n");
				origen = Utilidades.ingresar("Ingrese origen del accidente (máx 100 caracteres): ");
			}
		} while (true);
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		do {
			if (consecuencias.length() <= 100) {
				this.consecuencias = consecuencias;
				break;
			} else {
				Utilidades.escribir("[ERROR]No puede ingresar mas de 100 caracteres\n");
				consecuencias = Utilidades.ingresar("Ingrese consecuencias del accidente(máx 100 caracteres): ");
			}
		} while (true);

	}

	@Override
	public String toString() {
		return "Accidente ID: " + identificador + ", RUT: " + rutCliente + ", Fecha: " + fecha + ", Hora: " + hora + ", Lugar: " + lugar + ", Origen: " + origen + ", Consecuencias: " + consecuencias;
	}

}
