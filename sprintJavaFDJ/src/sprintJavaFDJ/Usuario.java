package sprintJavaFDJ;

public class Usuario implements Asesoria{

	private String nombre;
	private String fechaNacimiento;
	private int run;

	//CONSTRUCTOR POR DEFECTO
	public Usuario() {}
	
	//CONSTRUCTOR PARAMETRIZADO
	public Usuario(String nombre, String fechaNacimiento, int run) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}
	
	//MÉTODOS ACCESORES
	public String getNombre() {
		return nombre;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int getRun() {
		return run;
	}
	
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre de Usuario: " + nombre + ", Fecha de nacimiento: " + fechaNacimiento + ", RUN:" + run );
		
	}

}
