package sprintJavaFDJ;

import java.util.ArrayList;

public class ListaClientes {

	ArrayList<Cliente>clientes = new ArrayList<Cliente>();

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void mostrarClientes() {
		for(Cliente cliente: clientes) {
			cliente.toString();
		}
	}
}
