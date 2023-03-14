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
	 * 
	 */
	public void listarUsuarios() {
		//TODO: LISTAR SOLO LOS DATOS DE LA CLASE USUARIO
		//if(instanceof(Usuario)
		for(Asesoria itemAsesoria: listaAsesoria) {
			if(itemAsesoria instanceof Usuario) {
				//MÉTODO MOSTRAR DETALLE
			}
		}
	}
	
	/**
	 * @param
	 * Recibe un tipo de usuario
	 */
	public void listarUsuariosPorTipo(Asesoria tipoUsuario) {
		for(Asesoria itemAsesoria: listaAsesoria) {
			if(itemAsesoria instanceof tipoUsuario) {
				//MÉTODO MOSTRAR DETALLE
			}
			
		}
	}
	
	public void listarCapacitaciones() {
		for(Capacitacion itemCapacitacion: listaCapacitacion) {
			//MOSTRAR DATOS CAPACITACION + DATOS DE CLIENTE AL QUE ESTÁ ASOCIADA LA CAPACITACION
		}
	}
}
