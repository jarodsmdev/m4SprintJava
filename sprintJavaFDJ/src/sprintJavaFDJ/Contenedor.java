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
	public void almacenarCliente(Cliente cliente){
		listaAsesoria.add(cliente);
	}
	/**
	 * 
	 * @param administrativo
	 */
	public void almacenarAdministrativo(Administrativo administrativo){
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
	 * 
	 * @param run
	 * Recibe como parámetro rut para eliminar objeto
	 */
	public void eliminarUsuario(long run) {
		boolean encontrado = false;
		for(int i = 0; i < listaAsesoria.size(); i++) {
			Usuario usuario = (Usuario)listaAsesoria.get(i); //CASTING PARA OBTENER EL RUT DEL USUARIO
			if(usuario.getRun() == run) {
				listaAsesoria.remove(i);
				Utilidades.escribir("[!] Se ha eliminado el usuario: " + usuario.analizarUsuario());
				encontrado = true;
				break;
			}
			if(encontrado == false) {
				Utilidades.escribir("[!] No se ha encontrado el RUT");
			}
		}
	}
	
	/**
	 * Método que permite mostrar sólo los objetos de la clase Usuario
	 */
	public void listarUsuarios() {
		//LISTAR SOLO LOS DATOS DE LA CLASE USUARIO
		for(int i = 0; i < listaAsesoria.size(); i++) {
			if(listaAsesoria.get(i) instanceof Usuario) {
				Usuario usuario = (Usuario) listaAsesoria.get(i); //CASTING/REFUNDICIÓN
				Utilidades.escribir((i+1) + ". " + usuario.toString());
			}else {
				Utilidades.escribir("[!] No existen objetos de tipo Usuario");
			}
		}
	}
	
	/**
	 * @param tipo Asesoria
	 * Recibe un objeto Usuario y sólo muestra los objetos de este tipo
	 */
	public void listarUsuariosPorTipo(Class<? extends Usuario> tipoUsuario) {
		for (Asesoria asesoria : listaAsesoria) {
	        if (tipoUsuario.isAssignableFrom(asesoria.getClass())) {
	            Usuario usuario = (Usuario) asesoria;
	            if (usuario instanceof Cliente) {
	                Cliente cliente = (Cliente) usuario; // Casting a Cliente
	                Utilidades.escribir(cliente.analizarUsuario());
	            } else if (usuario instanceof Administrativo) {
	                Administrativo admin = (Administrativo) usuario; // Casting a Administrativo
	                Utilidades.escribir(admin.analizarUsuario());
	            }
	        }
	    }
	}
	
	/**
	 * Método que Lista todas la capacitaciones e invoca un método para mostrar los datos del cliente asociado pasando como parámetro rut de tipo long
	 */
	public void listarCapacitaciones() {
		for(Capacitacion itemCapacitacion: listaCapacitacion) {
			//MOSTRAR DATOS CAPACITACION + DATOS DE CLIENTE AL QUE ESTÁ ASOCIADA LA CAPACITACION
			itemCapacitacion.toString();
			mostrarDatosCliente(itemCapacitacion.getRut());
		}
	}
	
	/**
	 * Método que muestra los datos de Cliente, recibe como parámetro rut de tipo long
	 * @param rutCliente tipo long
	 */
	public void mostrarDatosCliente(long rutCliente) {
		for(Asesoria itemCliente: listaAsesoria) {
			Cliente cliente = (Cliente)itemCliente; //CASTING
			if(cliente.getRun() == rutCliente) {
				Utilidades.escribir(cliente.analizarUsuario());
			}
		}
	}
	
	/**
	 * Método que retorna true si existe el rut ingresado, false en caso de no encontrarlo
	 * @param rutUsuario tipo long
	 * @return boolean
	 */
	public boolean existeUsuario(long rutUsuario) {
		for(Asesoria itemUsuario: listaAsesoria) {
			Usuario usuario = (Usuario)itemUsuario; //CASTING
			if(usuario.getRun() == rutUsuario) {
				return true;
			}
		}
		return false;
	}
}
