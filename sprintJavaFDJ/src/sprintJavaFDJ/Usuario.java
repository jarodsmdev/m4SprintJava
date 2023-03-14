package sprintJavaFDJ;

import java.time.LocalDate;
import java.util.Scanner;

public class Usuario implements Asesoria{

	private String nombre;
	private String fechaNacimiento;
	private int run;


	//CONSTRUCTOR POR DEFECTO
	public Usuario() {}

	//CONSTRUCTOR PARAMETRIZADO
	public Usuario(String nombre, String fechaNacimiento, int run) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	//MÉTODOS ACCESORES
	public String getNombre() {
		return nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public int getRun() {
		return run;
	}

	//METODO PARA OBTENER FECHA DE NACIMIENTO
	public String obtenerFechaNac() {
		Scanner sc = new Scanner(System.in);
		int dia=0;
		int mes=0;
		int anio=0;
		while (dia<1 || dia>31) {
		Utilidades.escribir("Ingrese dia");
		dia= sc.nextInt();
		}
		Utilidades.escribir("Ingrese mes");
		mes= sc.nextInt();
		Utilidades.escribir("Ingrese anio");
		anio= sc.nextInt();
		sc.close();
		return dia+"/" + mes +"/" + anio;

	}

	//IMPLEMENTACION DE LA INTERFAZ ASESORIA
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre de Usuario: " + nombre + ", rut:" + run );

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
