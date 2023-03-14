/**
 * @author Priscila Carrillo
 */
package sprintJavaFDJ;

import java.time.LocalDate;

public class Usuario implements Asesoria{

	private String nombreUsuario;
	private String fechaNacimiento;
	private long run;


	/**
	 * Método constructor predederminado
	 */
	public Usuario() {}

	/**
	 * Método constructor parametrizado
	 * @param nombre tipo String
	 * @param fechaNacimiento tipo String
	 * @param run tipo long
	 */
	public Usuario(String nombre, String fechaNacimiento, long run) {
		this.nombreUsuario = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	/**
	 * 
	 * @param nombreUsuario
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * 
	 * @return
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * METODO PARA OBTENER FECHA DE NACIMIENTO
	 * @return String con el formato de fecha dd/mm/aaaa
	 */
	public String obtenerFechaNac() {
		//Scanner sc = new Scanner(System.in);
		int dia=0;
		int mes=0;
		int anio=0;
		while (dia<1 || dia>31) {
		//Utilidades.escribir("Ingrese dia");
		dia = Integer.parseInt(Utilidades.ingresar("Ingrese día"));
		//dia= sc.nextInt();
		}
		//Utilidades.escribir("Ingrese mes");
		mes = Integer.parseInt(Utilidades.ingresar("Ingrese mes"));
		anio = Integer.parseInt(Utilidades.ingresar("Ingrese año"));
		//Utilidades.escribir("Ingrese anio");
		//anio= sc.nextInt();
		return dia+"/" + mes +"/" + anio;
	}
	
	/**
	 * 
	 * @param run
	 */
	public void setRut(long run) {
		if (run <= 99999999) {
			this.run = run; 
		}
		else {
			//opcion invalida
			Utilidades.escribir("Ingrese un RUT valido");
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public long getRun() {
		return run;
	}
	
	/**
	 * 
	 */
	@Override
	public String analizarUsuario() {
		return "Nombre de Usuario: " + nombreUsuario + ", RUN:" + run;
	}

	//METODO MOSTRAR EDAD
	public void mostrarEdad() {

		LocalDate fechaActual = LocalDate.now();  //OBTENER LA FECHA ACTUAL
		String anios = obtenerFechaNac();
		String anio = anios.substring(anios.length()-4);
	    int fecha = Integer.parseInt(anio);
	    int edad = fechaActual.getYear() - fecha; 
		Utilidades.escribir("El usuario tiene " + edad + " años");
	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run
				+ "]";
	}


}
