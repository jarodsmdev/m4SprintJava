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
	
	public static String ingresarObligatorio(String mensaje) {
		Scanner sc = new Scanner(System.in);
		Utilidades.escribir("[+] " + mensaje + " ");
		String capturador = sc.nextLine(); 
		do {
			Utilidades.escribir("No puede estar vacío");
		}while(capturador.length() == 0);
		return capturador;
	}
}
