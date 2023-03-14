package sprintJavaFDJ;

/**
 * 
 * @author Leonel Briones, Kevin Moreno, Valentia Saldías, Priscila Flores, Andrés Contreras.
 *      
 */
public class Accidente {
	private String identificador;
	private Cliente cliente;
	private String fecha;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;

	/**
	 * Constructores de la clase.
	 */

	public Accidente() {};

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

	public Accidente(String identificador, Cliente cliente, String fecha, String hora, String lugar, String origen, String consecuencias) {

		this.identificador = identificador;
		this.cliente = cliente;
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
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		if (cliente.getRun() <= 99999999) {
			this.cliente = cliente;
		} else {
			Utilidades.escribir("No puede exceder 99.999.999");
		}
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
		if (fecha.matches(regex)) {
			this.fecha = fecha;
		} else {
			Utilidades.escribir("La fecha no es valida");
		}
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		String regex = "^(0?[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
		if (hora.matches(regex)) {
			this.hora = hora;
		} else {
			Utilidades.escribir("La hora no es valida");
		}
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		if (lugar.length() >= 10 && lugar.length() <= 50) {
			this.lugar = lugar;
		} else {
			Utilidades.escribir("Debe ingresar entre 10 y 50 caracteres");
		}

	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		if (origen.length() <= 100) {
			this.origen = origen;
		} else {
			Utilidades.escribir("No puede ingresar mas de 100 caracteres");
		}
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		if (consecuencias.length() <= 100) {
			this.consecuencias = consecuencias;
		} else {
			Utilidades.escribir("No puede ingresar mas de 100 caracteres");
		}

	}

	@Override
	public String toString() {
		return "Accidente Identificador=" + identificador + ", Cliente=" + cliente + ", Fecha=" + fecha + ", Hora="
				+ hora + ", Lugar=" + lugar + ", Origen=" + origen + ", Consecuencias=" + consecuencias;
	}

}
