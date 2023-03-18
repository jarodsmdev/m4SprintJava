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
			if(capturador.length() != 0) {
				break;
			}
			else {
				Utilidades.escribir("No puede estar vacío ");
				capturador = sc.nextLine();
			}
		}while(true);
		return capturador;
	}
}
