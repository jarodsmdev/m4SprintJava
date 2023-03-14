package sprintJavaFDJ;

import java.util.Scanner;

public class Utilidades {

	//public static String mensaje;
	
	public static String escribir(String mensaje) {
		System.out.println(mensaje);
		return mensaje;
	}
	
	public static String ingresar(String mensaje) {
		Scanner sc = new Scanner(System.in);
		Utilidades.escribir(mensaje);
		String capturador = sc.nextLine();
		sc.close();
		return capturador;

	}
}
