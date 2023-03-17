package sprintJavaFDJ;

import java.util.Scanner;

public class Utilidades {

	public static String escribir(String mensaje) {
		System.out.print(mensaje);
		return mensaje;
	}
	
	public static String ingresar(String mensaje) {
		Scanner sc = new Scanner(System.in);
		Utilidades.escribir("[+] " + mensaje + " ");
		String capturador = sc.nextLine();
		return capturador;
	}
	
	public static String preguntarDato(String pregunta) {
		String capturador = Utilidades.ingresar(pregunta);
		return capturador;
	}
}
