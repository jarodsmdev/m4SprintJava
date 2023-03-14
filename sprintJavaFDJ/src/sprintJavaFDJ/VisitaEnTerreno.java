package sprintJavaFDJ;

/**
 * 
 * @author diurno
 *
 */

public class VisitaEnTerreno {
	
	private String identificador;
	private Cliente cliente;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;
	
	public VisitaEnTerreno() {};
	
	public VisitaEnTerreno(String identificador, Cliente cliente, String dia, String hora, String lugar, String comentarios) {
		this.identificador = identificador;
		this.cliente = cliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}

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
		if (cliente.getRut() <= 99999999) {
			this.cliente = cliente;
		}
		else {
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
			}
		else {
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
			}
		else {
			Utilidades.escribir("La hora no es valida");
			}
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		if(lugar.length() >= 10 && lugar.length() <= 50) {
			this.lugar = lugar;}
		else {
			Utilidades.escribir("Debe ingresar entre 10 y 50 caracteres");
		}
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		if(comentarios.length() <= 100) {
			this.comentarios = comentarios;
		}
		else {
			Utilidades.escribir("Puede ingresar maximo 100 caracteres");
		}
	
	}

	@Override
	public String toString() {
		return "VisitaEnTerreno Identificador=" + identificador + ", Cliente=" + cliente.getRut() + ", Dia=" + dia + ", Hora="
				+ hora + ", Lugar=" + lugar + ", Comentarios=" + comentarios;
	}

}
