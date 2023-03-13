package sprintJavaFDJ;

public class Administrativo extends Usuario {
//	Área: obligatorio, mínimo 5 caracteres, máximo 20
//	- Experiencia previa: máximo 100 caracteres
	private String area;
	private String expPrevia;

	public Administrativo() {}
	//el bob con usuario
	public Administrativo(String nombreUsuario, String area, String expPrevia) {
		super(nombreUsuario);
		this.area = area;
		this.expPrevia = expPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		if(area!=null && area.length()<5 && area.length()>20) {
			System.out.println("El area debe ingresar mínimo 5 caracteres, máximo 20");
		}
		this.area = area;
	}

	public String getExpPrevia() {
		return expPrevia;
		
	}

	public void setExpPrevia(String expPrevia) {
	    if (expPrevia != null && expPrevia.length() > 100) {
	        System.out.println("La experiencia previa no puede exceder los 100 caracteres.");
	    }
	    this.expPrevia = expPrevia;
	}

	
	//aqui iria el toostring con los super de usuario bob
	


}
