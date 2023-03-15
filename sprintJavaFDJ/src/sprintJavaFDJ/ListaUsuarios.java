package sprintJavaFDJ;

import java.util.ArrayList;

public class ListaUsuarios {
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	/**  metodos para agregar usuarios a la lista de usuarios, y para mostrar los datos del usuario*/
	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	public void mostrarUsuarios() {
		for(Usuario usuario: usuarios) {
			usuario.toString();
		}
	}
}
