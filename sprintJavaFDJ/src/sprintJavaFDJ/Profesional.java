package sprintJavaFDJ;

public class Profesional extends Usuario{
//	//Título: obligatorio, mínimo 10 caracteres, máximo 50
//	- Fecha de ingreso: independiente si lo declara como una fecha o un String,
//	debeser desplegado con el formato DD/MM/AAAA
	private String titulo;
	private String fechaIngreso;
	
	public Profesional() {}
	//aqui va el BOB con super de usuario
	public Profesional(String titulo, String fechaIngreso,String nombre,String fechaN,int run) {
		super(nombre,fechaN,run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	

	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		if(titulo.length()<10 && titulo.length()>50) {
			System.out.println("El titulo debe ser mínimo 10 caracteres, máximo 50");
		}
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		if(fechaIngreso.matches("\\d{2}/\\d{2}/\\d{4}")) {
		this.fechaIngreso = fechaIngreso;}
		System.out.println("Debe ingresar con formato: DD/MM/AAAA");
	}
	@Override
	public String toString() {
		return "Profesional"+super.toString()+ "titulo=" + titulo + ", fechaIngreso=" + fechaIngreso;
	}
	
	@Override
	public void analizarUsuario() {
		Utilidades.escribir("Profesional" + super.toString()+ "Profesional"+super.toString()+ "titulo=" + titulo + ", fechaIngreso=" + fechaIngreso) ;
		
	}
	
	

	
	

}
