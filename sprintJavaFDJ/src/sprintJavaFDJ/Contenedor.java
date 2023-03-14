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
	public void eliminarUsuario(int run) {
		for(int i; i < listaAsesoria.size(); i++) {
			if(listaAsesoria.get(i).rut.equals(rut)) {
				listaAsesoria.remove(i);
				break;
			}
		};
	}
	
	/**
	 * Método que permite mostrar sólo los objetos de la clase Usuario
	 */
	public void listarUsuarios() {
		//TODO: LISTAR SOLO LOS DATOS DE LA CLASE USUARIO
		for(Asesoria itemAsesoria: listaAsesoria) {
			if(itemAsesoria instanceof Usuario) {
				//MÉTODO MOSTRAR DETALLE
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
