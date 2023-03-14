package sprintjava;

import java.time.LocalDate;
import java.util.Scanner;

public class Usuario implements Asesoria{

	private String nombre;
	private String fechaNacimiento;
	private int rut;
	
	Scanner sc = new Scanner(System.in);

	//CONSTRUCTOR POR DEFECTO
	public Usuario() {}
	
	//CONSTRUCTOR PARAMETRIZADO
	public Usuario(String nombre, String fechaNacimiento, int rut) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
	}
	
	//MÉTODOS ACCESORES
	public String getNombre() {
		return nombre;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int getRut() {
		return rut;
	}
	
	//METODO PARA OBTENER FECHA DE NACIMIENTO
	public String obtenerFechaNac() {
		int dia=0;
		int mes=0;
		int anio=0;
		while (dia<1 || dia>31) {
		System.out.println("Ingrese dia");
		dia= sc.nextInt();
		}
		System.out.println("Ingrese mes");
		mes= sc.nextInt();
		System.out.println("Ingrese anio");
		anio= sc.nextInt();
		return dia+"/" + mes +"/" + anio;
		
	}
	
	//IMPLEMENTACION DE LA INTERFAZ ASESORIA
	
	public void analizarUsuario() {
		System.out.println("Nombre de Usuario: " + nombre + ", rut:" + rut );
		
	}
	
	//METODO MOSTRAR EDAD
	
	public void mostrarEdad() {
		
		LocalDate fechaActual = LocalDate.now();  //OBTENER LA FECHA ACTUAL
		String anios = obtenerFechaNac();
		String anio = anios.substring(anios.length()-4);
	    int fecha = Integer.parseInt(anio);
	    int edad = fechaActual.getYear() - fecha; 
		System.out.println("El usuario tiene" + edad + " anios");
	}
	

}
