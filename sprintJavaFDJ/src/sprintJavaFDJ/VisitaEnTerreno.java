package sprintJavaFDJ;

import java.util.ArrayList;

/**
 * 
 * @author Leonel Briones, Kevin Moreno, Valentia Saldias, Priscila Carrillo,
 *         Andres Contreras.
 *
 */

public class VisitaEnTerreno {

	private int identificador;
	private static int idIdentificador;
	private long rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;
	private ArrayList<Revision> revisiones = new ArrayList<Revision>();

	/**
	 * Constructores de la clase.
	 */

	public VisitaEnTerreno() {
		Revision revision = new Revision();
		revisiones.add(revision);
		++idIdentificador;
		this.identificador = idIdentificador;
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
	public VisitaEnTerreno(String identificador, long rutCliente, String dia, String hora, String lugar,
			String comentarios) {

		++idIdentificador;
		this.identificador = idIdentificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
		Revision revision = new Revision();
		revisiones.add(revision);
	}

	/**
	 * 
	 * @return Metodos getter y setter de la clase VisitaEnTerreno que retornan el
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

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
		do {
			if (dia.matches(regex)) {
				this.dia = dia;
				break;
			} else
				Utilidades.escribir("[ERROR] La fecha no es valida.\n");
				dia = Utilidades.ingresar("Ingresar Fecha con formato [DD/MM/AAAA]: ");

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
				Utilidades.escribir("[ERROR] La hora no es válida.\n");
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
			if (lugar.length() > 9 && lugar.length() < 51) {
				this.lugar = lugar;
				break;
			} else {
				Utilidades.escribir("[ERROR] Debe ingresar entre 10 y 50 caracteres\n");
				lugar = Utilidades.ingresar("Ingrese Lugar: (Texto entre 10 y 50 caracteres)");
			}
		} while (true);
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		do {
			if (comentarios.length() < 101) {
				this.comentarios = comentarios;
				break;
			} else {
				Utilidades.escribir("[ERROR] Puede ingresar maximo 100 caracteres\n");
				comentarios = Utilidades.ingresar("Ingrese comentarios de la visita [Máx 100 caracteres]: ");
			}
		} while (true);
	}

	public void agregarRevision(Revision nuevaRevision) {
		revisiones.add(nuevaRevision);
	}

	/**
	 * Metodo toString de la clase VisitaEnTerreno.
	 */
	@Override
	public String toString() {
		return " Visita En Terreno ID: " + identificador + ", RUT Cliente: " + rutCliente + ", Dia: " + dia + ", Hora: " + hora + ", Lugar: " + lugar + ", Comentarios: " + comentarios;
	}

}
