package sprintJavaFDJ;

import java.util.ArrayList;

public class Contenedor {
	public ArrayList<Asesoria> listaAsesoria = new ArrayList<>();

	public ArrayList<Capacitacion> listaCapacitacion = new ArrayList<>();

	/**
	 * 
	 * @param cliente
	 */
	public void almacenarCliente(Cliente cliente){
		listaAsesoria.add(cliente);
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
				Utilidades.escribir((i+1) + ". " + usuario.analizarUsuario());
			}else {
				Utilidades.escribir("[!] No existen objetos de tipo Usuario");
			}
		}
	}
	
	/**
	 * @param tipo Asesoria
	 * Recibe un objeto Asesoria y sólo muestra los objetos de este tipo
	 */
	public void listarUsuariosPorTipo(Asesoria tipoUsuario) {
		for(Asesoria itemAsesoria: listaAsesoria) {
			if(itemAsesoria instanceof Asesoria) {
				//MÉTODO MOSTRAR DETALLE
				
			}
			
		}
	}
	
	/**
	 * Lista todas la capacitaciones
	 */
	public void listarCapacitaciones() {
		for(Capacitacion itemCapacitacion: listaCapacitacion) {
			//MOSTRAR DATOS CAPACITACION + DATOS DE CLIENTE AL QUE ESTÁ ASOCIADA LA CAPACITACION
		
		}
	}
}
