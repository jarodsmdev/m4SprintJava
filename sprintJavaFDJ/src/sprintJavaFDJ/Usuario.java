package sprintJavaFDJ;

public class Usuario implements Asesoria{

	private String nombreUsuario;
	private String fechaNacimiento;
	private long run;

	//CONSTRUCTOR POR DEFECTO
	public Usuario() {}
	
	//CONSTRUCTOR PARAMETRIZADO
	public Usuario(String nombre, String fechaNacimiento, long run) {
		this.nombreUsuario = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}
	
	//MÉTODOS ACCESORES
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setRut(long run) {
		if (run <= 99999999) {
			this.run = run; 
		}
		else {
			//opcion invalida
			Utilidades.escribir("Ingrese un RUT valido");
		}
	}
	public long getRun() {
		return run;
	}
	
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre de Usuario: " + nombreUsuario + ", Fecha de nacimiento: " + fechaNacimiento + ", RUN:" + run );
		
	}

}
