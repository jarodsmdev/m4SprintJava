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
	public void setNombreUsuario() {
		String nombreUsuario = Utilidades.ingresarObligatorio("Ingrese el nombre de Usuario");
		do {
			if(nombreUsuario.length() > 9 && nombreUsuario.length() < 51){
			this.nombreUsuario = nombreUsuario;
			break;
		}
			else {
				nombreUsuario = Utilidades.ingresarObligatorio("Error de ingreso. Rango de caracteres entre 10 y 50");
			}
		}while(true);
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
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = obtenerFechaNac();
	}
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
		dia = Integer.parseInt(Utilidades.ingresarObligatorio("Ingrese día"));
		//dia= sc.nextInt();
		}
		//Utilidades.escribir("Ingrese mes");
		mes = Integer.parseInt(Utilidades.ingresarObligatorio("Ingrese mes"));
		anio = Integer.parseInt(Utilidades.ingresarObligatorio("Ingrese año"));
		//Utilidades.escribir("Ingrese anio");
		//anio= sc.nextInt();
		return dia+"/" + mes +"/" + anio;
	}
	
	/**
	 * 
	 * @param run
	 */
	public void setRut() {
		String run = Utilidades.ingresarObligatorio("Ingrese el RUT");
		do {
			if (Long.parseLong(run) <= 99999999) {
				this.run = Long.parseLong(run); 
				break;
			}
			else {
				//opcion inválida
				run = Utilidades.ingresarObligatorio("Ingrese un RUT válido"); //HAY QUE REVISAR ESTO CUANDO SE HAYA MERGEADO
			}
		} while(true);
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
		return "Usuario [nombreUsuario=" + nombreUsuario + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + "]";
	}


}
