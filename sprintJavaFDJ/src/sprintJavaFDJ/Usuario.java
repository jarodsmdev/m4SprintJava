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
		do {
			Utilidades.ingresar("Ingrese nombre de usuario");
			if(nombreUsuario.length() >9 && nombreUsuario.length() <51) { 
				this.nombreUsuario = nombreUsuario;
			}
			
			else {
				Utilidades.ingresar("Ha superado el limite de caracteres");
			}
			
		} while(nombreUsuario.length() <10 || nombreUsuario.length() >50);
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
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Metodo para obtener fecha de nacimiento
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
		do {
			Utilidades.ingresar("Ingrese RUT");
			if (run <= 99999999) {
				this.run = run; 
			}
			else {
				//opcion inválida
				Utilidades.ingresar("Ingrese un RUT válido");
			}
			
		} while(run >99999999);
		
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

	//Metodo mostrar edad
	public void mostrarEdad() {

		LocalDate fechaActual = LocalDate.now();  //Obtener fecha actual
		String anios = obtenerFechaNac();
		String anio = anios.substring(anios.length()-4);
	    int fecha = Integer.parseInt(anio);
	    int edad = fechaActual.getYear() - fecha; 
		Utilidades.ingresar("El usuario tiene " + edad + " años");
	}

	@Override //metodo to string
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + "]";
	}


}
