package sprintJavaFDJ;

public class Profesional extends Usuario {
//	//Título: obligatorio, mínimo 10 caracteres, máximo 50
//	- Fecha de ingreso: independiente si lo declara como una fecha o un String,
//	debeser desplegado con el formato DD/MM/AAAA
	/**
	 * 
	 * La clase Profesional representa un tipo de Usuario que es un profesional y
	 * que hereda atributos y métodos de la clase Usuario.
	 * 
	 * Tiene un título y una fecha de ingreso como atributos específicos.
	 * 
	 * La clase incluye métodos para obtener y establecer el título y la fecha de
	 * ingreso con validaciones de longitud y formato respectivamente.
	 * 
	 * También tiene un método toString para representar el objeto como una cadena
	 * de caracteres y un método analizarUsuario para imprimir información del
	 * usuario en consola.
	 */
		private String titulo;
		private String fechaIngreso;

		/**
		 * 
		 * Constructor por defecto de la clase Profesional
		 */
		public Profesional() {}

		/**
		 * 
		 * Constructor de la clase Profesional que recibe el título, fecha de ingreso,
		 * nombre, fecha de nacimiento y RUT del usuario.
		 * 
		 * @param titulo       el título del profesional
		 * @param fechaIngreso la fecha de ingreso del profesional en formato
		 *                     "DD/MM/AAAA"
		 * @param nombre       el nombre del usuario
		 * @param fechaN       la fecha de nacimiento del usuario en formato
		 *                     "DD/MM/AAAA"
		 * @param run          el RUT del usuario
		 */
		public Profesional(String titulo, String fechaIngreso, String nombre, String fechaN, int run) {
			super(nombre, fechaN, run);
			this.titulo = titulo;
			this.fechaIngreso = fechaIngreso;
		}

		/**
		 * 
		 * Método para obtener el título del profesional
		 * 
		 * @return el título del profesional
		 */
		public String getTitulo() {
			return titulo;
		}

		/**
		 * 
		 * Método para establecer el título del profesional con validación de longitud
		 * 
		 * @param titulo el título del profesional
		 */
		public void setTitulo(String titulo) {
			if (titulo.length() < 10 || titulo.length() > 50&& titulo.isEmpty() && titulo==null) {
				System.out.println("El titulo debe ser mínimo 10 caracteres, máximo 50 y no debe estar vacio");
			}
			this.titulo = titulo;
		}

		/**
		 * 
		 * Método para obtener la fecha de ingreso del profesional
		 * 
		 * @return la fecha de ingreso del profesional en formato "DD/MM/AAAA"
		 */
		public String getFechaIngreso() {
			return fechaIngreso;
		}

		/**
		 * 
		 * Método para establecer la fecha de ingreso del profesional con validación de formato
		 * @param fechaIngreso la fecha de ingreso del profesional en formato "DD/MM/AAAA"
		 */
		public void setFechaIngreso(String fechaIngreso) {
			String regex = "\\d{2}/\\d{2}/\\d{4}";
			if (fechaIngreso.matches(regex)) {
				this.fechaIngreso = fechaIngreso;
			}
			Utilidades.escribir("Debe ingresar con formato: DD/MM/AAAA");
		}

		/**
		 * 
		 * Método toString que representa el objeto Profesional como una cadena de
		 * caracteres.
		 * 
		 * @return una cadena de caracteres que representa el objeto Profesional
		 */
		@Override
		public String toString() {
			return "Profesional" + super.toString() + "titulo=" + titulo + ", fechaIngreso=" + fechaIngreso;
		}

		/**
		 * 
		 * Método analizarUsuario que imprime información del usuario en consola.
		 */
		@Override
		public String analizarUsuario() {
			return "Profesional Nombre= " + super.getNombreUsuario() + ", RUN= " + super.getRun()+ "titulo=" + titulo+ ", fechaIngreso=" + fechaIngreso;
		}
	}
