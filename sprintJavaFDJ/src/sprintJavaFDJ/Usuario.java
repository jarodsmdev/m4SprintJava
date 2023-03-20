/**
 * @author Priscila Carrillo
 * version 1.0	
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
		
		//nombreUsuario = Utilidades.ingresar("Ingrese nombre de Usuario (Entre 10 y 50 caracteres): ");
		do {
			
			if(nombreUsuario.length() > 9 && nombreUsuario.length() < 51){
				//System.out.println("RECIBÍ NOMBRE USUARIO :" + nombreUsuario);
				this.nombreUsuario = nombreUsuario;
				break;
			}else{
				Utilidades.escribir("[ERROR] Nombre debe de estar entre 10 y 50 caracteres.\n");
				nombreUsuario = Utilidades.ingresar("Ingrese Nombre");
			}
			
		} while(true);
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
		String regEx = "\\d{2}/\\d{2}/\\d{4}";
		do{
			if(!fechaNacimiento.trim().matches(regEx)){
				fechaNacimiento = Utilidades.ingresar("Error de Ingreso. Debe tener formato dd/mm/aaaa. Vuelva a intentar.");
			}else if(fechaNacimiento.trim().length() == 0){
				fechaNacimiento = Utilidades.ingresar("Error de Ingreso. Debe tener formato dd/mm/aaaa. Vuelva a intentar.");
			}else {
				this.fechaNacimiento = fechaNacimiento;
			}
		}while(!fechaNacimiento.trim().matches(regEx));
	}

	/**
	 * 
	 * @return
	 */
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
			dia = Integer.parseInt(Utilidades.ingresar("Ingrese día"));
		}
	
		mes = Integer.parseInt(Utilidades.ingresar("Ingrese mes"));
		anio = Integer.parseInt(Utilidades.ingresar("Ingrese año"));

		return dia+"/" + mes +"/" + anio;
	}
	
	/**
	 * Método SetRut recibe como parámetro un dato de tipo string
	 * @param run tipo String
	 */
	public void setRut(long run) {
		this.run = run;
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
		return "Usuario: " + nombreUsuario + ", RUN:" + run;
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
		return "Usuario\n Nombre Usuario: " + nombreUsuario + ", Fecha Nacimiento: " + fechaNacimiento + ", RUT: " + run + "\n";
	}

	/**
	* Sobre escribe el método soloUsuario de la superClase, Imprime una cadena
	* @return Una cadena de texto con la información: nombre, rut, y fecha de nacimiento del Usuario
	*/
	@Override
	public String soloUsuario() {
		return "Usuario: " + getNombreUsuario() + ", RUT: " + getRun() + ", Fecha de Nacimiento: " + getFechaNacimiento() ;	
	}

}
