package sprintJavaFDJ;

import sprintJavaFDJ.Utilidades;

public class Administrativo extends Usuario {

	/**

	Esta clase representa a un usuario administrativo, que hereda de la clase Usuario.

	Contiene los atributos 'area' y 'expPrevia', así como los métodos getters y setters correspondientes.

	Además, sobrescribe los métodos toString() y analizarUsuario() de la clase padre.
	*/
	

	private String area;
	private String expPrevia;

	/**

	Constructor por defecto.
	*/
	public Administrativo() {
	}
	/**

	Constructor que recibe los parámetros 'nombreUsuario', 'area', 'expPrevia', 'nombreuser', 'fechaN' y 'run'.
	@param nombreUsuario El nombre de usuario.
	@param area El área del usuario administrativo.
	@param expPrevia La experiencia previa del usuario administrativo.
	@param nombreuser El nombre del usuario.
	@param fechaN La fecha de nacimiento del usuario.
	@param run El número de identificación del usuario.
	*/
	public Administrativo(String nombreUsuario, String area, String expPrevia, String nombreuser, String fechaN, int run) {
	super(nombreuser, fechaN, run);
	this.area = area;
	this.expPrevia = expPrevia;
	}
	/**

	Método getter para el atributo 'area'.
	@return El área del usuario administrativo.
	*/
	public String getArea() {
	return area;
	}
	/**

	Método setter para el atributo 'area'. Verifica que el parámetro no sea nulo y tenga una longitud entre 5 y 20 caracteres.
	Si la validación falla, imprime un mensaje de error usando la clase Utilidades.
	@param area El área del usuario administrativo.
	*/
	public void setArea(String area) {
	if (area != null && area.length() < 5 && area.length() > 20) {
	Utilidades.escribir("El area debe ingresar mínimo 5 caracteres, máximo 20");
	}
	this.area = area;
	}
	/**

	Método getter para el atributo 'expPrevia'.
	@return La experiencia previa del usuario administrativo.
	*/
	public String getExpPrevia() {
	return expPrevia;
	}
	/**

	Método setter para el atributo 'expPrevia'. Verifica que el parámetro no sea nulo y tenga una longitud menor o igual a 100 caracteres.
	Si la validación falla, imprime un mensaje de error en la consola.
	@param expPrevia La experiencia previa del usuario administrativo.
	*/
	public void setExpPrevia(String expPrevia) {
	if (expPrevia != null && expPrevia.length() > 100) {
	System.out.println("La experiencia previa no puede exceder los 100 caracteres.");
	}
	this.expPrevia = expPrevia;
	}
	/**

	Sobrescribe el método toString() de la clase padre.
	@return Una cadena que representa al usuario administrativo, incluyendo su nombre de usuario, área y experiencia previa.
	*/
	@Override
	public String toString() {
	return "Administrativo" + super.toString()+ "area " +area + ", expPrevia=" + expPrevia ;
	}
	/**

	Sobrescribe el método analizarUsuario() de la clase padre. Imprime una cadena que representa al usuario administrativo, incluyendo su nombre de usuario, área y experiencia previa, usando la clase Utilidades.
	*/
	}




}
