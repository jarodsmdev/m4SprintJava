package sprintjava;

public class Usuario implements Asesoria{

	private String nombre;
	private String fechaNacimiento;
	private int rut;

	//CONSTRUCTOR POR DEFECTO
	public Usuario() {}
	
	//CONSTRUCTOR PARAMETRIZADO
	public Usuario(String nombre, String fechaNacimiento, int rut) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
	}
	
	//MÉTODOS ACCESORES
	public String getNombre() {
		return nombre;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int getRut() {
		return rut;
	}
	
	public void analizarUsuario() {
		System.out.println("Nombre de Usuario: " + nombre + ", Fecha de nacimiento: " + fechaNacimiento + ", rut:" + rut );
		
	}

}
