package sprintJavaFDJ;

/**
 * 
 * @author Leonel Briones, Kevin Moreno, Valentia Saldias, Priscila Flores,
 *         Andres Contreras.
 *
 */

public class VisitaEnTerreno {

	private String identificador;
	private Cliente cliente;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;

	/**
	 * Constructores de la clase.
	 */
	
	public VisitaEnTerreno() {
	};

	/**
	 * 
	 * @param identificador: String
	 * @param cliente:       String
	 * @param dia:           String
	 * @param hora:          String
	 * @param lugar:         String
	 * @param comentarios:   String
	 */
	public VisitaEnTerreno(String identificador, Cliente cliente, String dia, String hora, String lugar,
			String comentarios) {
		this.identificador = identificador;
		this.cliente = cliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}

	/**
	 * 
	 * @return Metodos getter y setter de la clase VisitaEnTerreno que retornan el
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

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
		if (dia.matches(regex)) {
			this.dia = dia;
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

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		if (comentarios.length() <= 100) {
			this.comentarios = comentarios;
		} else {
			Utilidades.escribir("Puede ingresar maximo 100 caracteres");
		}

	}

	/**
	 * Metodo toString de la clase VisitaEnTerreno.
	 */
	@Override
	public String toString() {
		return "VisitaEnTerreno Identificador=" + identificador + ", Cliente=" + cliente.getRun() + ", Dia=" + dia + ", Hora="
				+ hora + ", Lugar=" + lugar + ", Comentarios=" + comentarios;
	}

}
