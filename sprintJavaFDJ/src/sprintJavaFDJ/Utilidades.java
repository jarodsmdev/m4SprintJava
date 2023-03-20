package sprintJavaFDJ;

/**
 * 
 * @version 1.0
 * @author Leonel Briones, Kevin Moreno, Valentia Saldias, Priscila Carrillo,
 *         Andres Contreras.
 *
 */

import java.util.Scanner;

public class Utilidades {

	/**
	 * Método que muestra un mensaje por pantalla sin saltar de línea y devuelve dicho mensaje.
	 * @param mensaje El mensaje a mostrar por pantalla.
	 * @return El mensaje que se ha mostrado por pantalla.
	 */
	public static String escribir(String mensaje) {
		System.out.print(mensaje);
		return mensaje;
	}

	/**
	 * Método que muestra un mensaje por pantalla pidiéndole al usuario que ingrese un valor y lo devuelve.
	 * @param mensaje El mensaje que se muestra para pedirle al usuario que ingrese un valor.
	 * @return El valor ingresado por el usuario.
	 */
	public static String ingresar(String mensaje) {
		Scanner sc = new Scanner(System.in);
		Utilidades.escribir("[+] " + mensaje + " ");
		String capturador = sc.nextLine();
		return capturador;
	}

	/**
	 * Método que muestra un mensaje por pantalla pidiéndole al usuario que ingrese un valor obligatorio y lo devuelve.
	 * @param mensaje El mensaje que se muestra para pedirle al usuario que ingrese un valor obligatorio.
	 * @return El valor obligatorio ingresado por el usuario.
	 */
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

	/**
	 * Método que comprueba si un texto es numérico.
	 * @param texto El texto que se va a comprobar si es numérico.
	 * @return Devuelve verdadero si el texto es numérico, de lo contrario, devuelve falso.
	 */
	public static boolean esNumerica(String texto) {
		try {
			Integer.parseInt(texto);
			return true;
		}catch (NumberFormatException nfe) {
			return false;
		}
	}

	/**
	 * Método que valida si un valor ingresado por el usuario es numérico y lo almacena en el objeto Usuario.
	 * @param mensaje El mensaje que se muestra para pedirle al usuario que ingrese un valor.
	 * @param contenedor El objeto Contenedor que se va a modificar.
	 * @param usuario El objeto Usuario en el que se va a almacenar el valor ingresado.
	 */
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
