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
			if(capturador.trim().length() != 0) {
				break;
			}else {
				Utilidades.escribir("No puede estar vacío ");
				capturador = sc.nextLine();
			}
		}while(true);
		return capturador;
	}


	public static boolean esNumerica(String texto) {
		try {
			Integer.parseInt(texto);
			return true;
		}catch (NumberFormatException nfe) {
			return false;
		}
	}

	public static void validarLong(String mensaje, Contenedor contenedor, Usuario usuario){

		long numeroLong;
		String texto = Utilidades.ingresar(mensaje);
		do{
			if(Utilidades.esNumerica(texto) == false || texto.trim().length() == 0){
				Utilidades.escribir("[ERROR] Valor ingresado es erróneo:\n");
				texto = Utilidades.ingresar(mensaje);
			}else{
				numeroLong = Long.parseLong(texto);
				usuario.setRut(numeroLong);
				break;
			}

		}while(true);
		}
}
