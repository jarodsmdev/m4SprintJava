package sprintJavaFDJ;

public class Accidente {
	String identificador;
	String fecha;
	String hora;
	String lugar;
	String origen;
	String consecuencias;
	
	public Accidente() {};
	
	public Accidente(String identificador, String fecha, String hora, String lugar, String origen, String consecuencias) {
		
		this.identificador = identificador;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
		
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
		if (fecha.matches(regex)) {
		this.fecha = fecha;
			}
		else {
			System.out.println("La fecha no es valida");
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
			System.out.println("La hora no es valida");
			}
	}
	
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		return "Accidente identificador=" + identificador + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar
				+ ", origen=" + origen + ", consecuencias=" + consecuencias;
	}

	
}
