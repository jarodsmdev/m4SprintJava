package sprintJavaFDJ;
/** @author Leonel Briones, Priscila Carrillo, Andres Contreras, Kevin Moreno, Valentina Saldias*/
/**@version 13/03 */
public class Cliente extends Usuario {

	/** definicion de parametros de la clase Cliente */
	private long rut; 
	private String nombre;
	private String apellido;
	private int telefono;
	private String afp; 
	private char sistemaSalud; 
	private String direccion; 
	private String comuna;
	private int edad; 
	
	/** Constructor vacio */
	public Cliente() {
	}
	
	/** Constructor con los atributos como parametros*/
	public Cliente(long rut, String nombre, String apellido, int telefono, String afp, char sistemaSalud, String direccion, String comuna, int edad) {
		this.rut = rut; 
		this.nombre = nombre;
		this.apellido = apellido; 
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion; 
		this.comuna = comuna;
		this.edad = edad;
	}
	
	/** @param RUT 
	 * int menor a 99.999.999 
	 * SETTER Y GETTER*/
	public void setRut(long rut) {
		if (rut <= 99999999) {
			this.rut = rut; 
		}
		else {
			//opcion invalida
		}
	}
	public long getRut() {
		return rut;
	}
	
	/** @param NOMBRE 
	 * Obligatorio; minimo 5 caracteres - maximo 30
	 * SETTER Y GETTER*/
	
	public void setNombre(String nombre) {
		if(nombre.length() >=5 && nombre.length() <= 30) {
			this.nombre = nombre; 
		}
		else{
			//opcion invalida
		}
	}
	public String getNombre() {
		return nombre; 
	}
	
	/** @param APELLIDO
	 * Obligatorio; minimo 5 caracteres - maximo 30
	 * SETTER Y GETTER */
	public void setApellido(String apellido) {
		if (apellido.length() >= 5 && apellido.length() <= 30) {
			this.apellido = apellido; 
		}
		else {
			//opcion invalida
		}
	}
	public String getApellido() {
		return apellido;
	}
	
	/** @param TELEFONO
	 * Obligatorio
	 * SETTER Y GETTER */
	public void setTelefono(int telefono) {
		this.telefono = telefono; 
	}
	public int getTelefono() {
		return telefono;
	}
	
	/** @param AFP
	 * Minimo 4 caracteres - maximo 30
	 *  SETTER Y GETTER */
	public void setAfp(String afp) {
		if(afp.length()>= 4 && afp.length()<=30) {
			this.afp = afp;
		}
		else {
			//opcion invalida
		}
	}
	public String getAfp() {
		return afp;
	}
	
	/** @param SISTEMA DE SALUD 
	 * 1 FONASA / 2 ISAPRE
	 * SETTER, GETTER */
	public void setSistemaSalud(char sistemaSalud) {
		if(sistemaSalud == 1 || sistemaSalud ==2) {
				this.sistemaSalud = sistemaSalud;
		}
		else {
			//opcion invalida
		}
	}
	public char getSistemaSalud() {
		return sistemaSalud;
	}
	
	/** @param DIRECCION
	 * Maximo 70 caracteres
	 * SETTER Y GETTER */
	public void setDireccion(String direccion) {
		if(direccion.length() <= 70) {
			this.direccion = direccion; 
		}
		else {
			//opcion invalida
		}
	}
	public String getDireccion() {
		return direccion;
	}
	
	/** @param COMUNA 
	 * Maximo 50 caracteres
	 * SETTER Y GETTER */
	public void setComuna(String comuna) {
		if(comuna.length() <= 50) {
			this.comuna = comuna; 
		}
		else {
			//opcion invalida
		}
	}
	public String getComuna() {
		return comuna;
	}
	
	/** @param EDAD 
	 * Obligatorio: mayor o igual a 0 - menor que 150
	 * SETTER Y GETTER*/
	public void setEdad(int edad) {
		if(edad >= 0 && edad < 150) {
			this.edad = edad; 
		}
		else {
			//opcion invalida
		}
	}
	public int getEdad() {
		return edad;
	}
	
	/** METODO OBTENER NOMBRE = NOMBRE Y APELLIDOS CONCATENADOS*/
	public void obtenerNombre() {
		System.out.println(nombre + " " + apellido);
	}
	
	/** METODO QUE RETORNA EL SISTEMA DE SALUD DEL CLIENTE */
	public void obtenerSistemaSalud() {
		if(sistemaSalud ==1) {
			System.out.println("FONASA");
		}
		else {
			System.out.println("ISAPRE");
		}
	}
	
	/** DEBE MOSTRAR LOS DATOS DE LA CLASE USUARIO + DIRECCION Y COMUNA DEL CLIENTE*/
	public void analizarUsuario() {
		
	}
}
