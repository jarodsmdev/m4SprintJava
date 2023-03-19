package sprintJavaFDJ;

import java.util.ArrayList;

public class Contenedor {
	public ArrayList<Asesoria> listaAsesoria = new ArrayList<>();

	public ArrayList<Capacitacion> listaCapacitacion = new ArrayList<>();

	/**
	 * 
	 * @param usuario
	 */
	public void almacenarUsuario(Usuario usuario) {
		listaAsesoria.add(usuario);
	}

	/**
	 * 
	 * @param cliente
	 */
	public void almacenarCliente(Cliente cliente) {
		listaAsesoria.add(cliente);
	}

	/**
	 * 
	 * @param administrativo
	 */
	public void almacenarAdministrativo(Administrativo administrativo) {
		listaAsesoria.add(administrativo);
	}

	/**
	 * 
	 * @param profesional
	 */
	public void almacenarProfesional(Profesional profesional) {
		listaAsesoria.add(profesional);
	}

	/**
	 * 
	 * @param capacitacion
	 */
	public void almacenarCapacitacion(Capacitacion capacitacion) {
		listaCapacitacion.add(capacitacion);
	}

	/**
	 * Método que permite eliminar un objeto de tipo Usuario recibiendo un long como parámetro, retorna String
	 * @param run
	 * @return tipo String
	 */
	public String eliminarUsuario(long run) {
		boolean encontrado = false;
		String mensaje = "";
		for (int i = 0; i < listaAsesoria.size(); i++) {
			Usuario usuario = (Usuario) listaAsesoria.get(i); // CASTING PARA OBTENER EL RUT DEL USUARIO
			if (usuario.getRun() == run) {
				listaAsesoria.remove(i);
				encontrado = true;
				mensaje = "[!] Se ha eliminado el usuario: " + usuario.analizarUsuario();
				break;
			}
			if (encontrado == false) {
				mensaje = "[!] No se ha encontrado el RUT";
			}
		}

		return mensaje;
	}

	/**
	 * Método que permite mostrar sólo los objetos de la clase Usuario
	 */
	public void listarUsuarios() {
		// LISTAR LOS DATOS DE LA CLASE USUARIO
		Utilidades.escribir("\n-- INICIO DEL REPORTE --\n\n");
		for (int i = 0; i < listaAsesoria.size(); i++) {
			if (listaAsesoria.get(i) instanceof Usuario) {
				Usuario usuario = (Usuario) listaAsesoria.get(i); // CASTING/REFUNDICIÓN
				Utilidades.escribir((i + 1) + ". " + usuario.analizarUsuario() + "\n");
			} else {
				Utilidades.escribir("[!] No existen objetos de tipo Usuario");
			}
		}
		Utilidades.escribir("\n-- FIN DEL REPORTE --\n");
	}

	/**
	 * @param tipo Asesoria
	 *             Recibe un objeto Usuario y sólo muestra los objetos de este tipo
	 */
	public void listarUsuariosPorTipo(Class<? extends Usuario> tipoUsuario) {
		
		int i = 1;

		for (Asesoria asesoria : listaAsesoria) {
			if (tipoUsuario.isAssignableFrom(asesoria.getClass())) {
				Usuario usuario = (Usuario) asesoria;
				if (usuario instanceof Cliente) {
					Cliente cliente = (Cliente) usuario; // Casting a Cliente
					Utilidades.escribir((i++) + ". " + cliente.analizarUsuario() + "\n");

				} else if (usuario instanceof Administrativo) {
					Administrativo admin = (Administrativo) usuario; // Casting a Administrativo
					Utilidades.escribir((i++) + ". " + admin.analizarUsuario() + "\n");
		
				} else if (usuario instanceof Profesional){
					Profesional profesional = (Profesional) usuario; //Casting a Profesional
					Utilidades.escribir((i++) + ". "  + profesional.analizarUsuario() + "\n");
		
				}/*else if (usuario instanceof Usuario){
					Usuario user = (Usuario) usuario; //Casting a Usuario
					Utilidades.escribir((i++) + ". "  + user.analizarUsuario() + "\n");
				}*/
			}

		}

		Utilidades.escribir("\n");
	}

	/**
	 * Método que cuenta y retorna el número de objetos del tipo que recibe por parámetro
	 * @param tipoUsuario
	 * @return tipo int
	 */
	public int contarUsuariosClientes(Class<? extends Usuario> tipoUsuario){

		int qClientes = 0;

		for(Asesoria asesoria: listaAsesoria){
			Usuario usuario = (Usuario) asesoria;
			if(tipoUsuario.isAssignableFrom(asesoria.getClass())){
				if(usuario instanceof Cliente){
					qClientes++;
				}
			}

		}
		
		if(qClientes == 0){ Utilidades.escribir("[!] No existen Clientes registrados.\n\n");}
		
		return qClientes;
	}

	/**
	 * Método que Lista todas la capacitaciones e invoca un método para mostrar los
	 * datos del cliente asociado pasando como parámetro rut de tipo long
	 */
	public void listarCapacitaciones() {
		for(int i = 0; i < listaCapacitacion.size(); i++){
			// MOSTRAR DATOS CAPACITACION + DATOS DE CLIENTE AL QUE ESTÁ ASOCIADA LA CAPACITACION
			Utilidades.escribir("\n" + (i+1)+ ". "  + listaCapacitacion.get(i).toString());
			mostrarDatosCliente(listaCapacitacion.get(i).getRut());
		}
	}

	/**
	 * Método que muestra los datos de Cliente, recibe como parámetro rut de tipo
	 * long
	 * 
	 * @param rutCliente tipo long
	 */
	public void mostrarDatosCliente(long rutCliente) {
		for (Asesoria itemCliente : listaAsesoria) {
			if (itemCliente instanceof Cliente) {
				Cliente cliente = (Cliente) itemCliente; // CASTING
				if (cliente.getRun() == rutCliente) {
					Utilidades.escribir(cliente.analizarUsuario() + "\n");
				}
			}
		}
	}

	public Cliente obtenerCliente(long rutCliente) {
		Cliente cliente = new Cliente();
		for (int i = 0; i < listaAsesoria.size(); i++) {
			if(listaAsesoria.get(i) instanceof Cliente){
				cliente = (Cliente) listaAsesoria.get(i); // CASTING
				if (cliente.getRun() == rutCliente) {
					return cliente;
				}/* else {
					Utilidades.escribir("[!] No se ha encontrado al Cliente RUT: " + rutCliente);
				}*/
			}
		}
		return cliente;
	}

	/**
	 * Método que retorna true si existe el rut ingresado, false en caso de no
	 * encontrarlo
	 * 
	 * @param rutUsuario tipo long
	 * @return boolean
	 */
	public boolean existeUsuario(long rutUsuario) {
		for (Asesoria itemUsuario : listaAsesoria) {
			Usuario usuario = (Usuario) itemUsuario; // CASTING
			if (usuario.getRun() == rutUsuario) {
				return true;
			}
		}
		return false;
	}
}