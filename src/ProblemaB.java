import java.util.Scanner;

public class ProblemaB {
	public static boolean isLetra(String _zoom) {
		try {
			Integer.parseInt(_zoom);
			return false;
		} catch (Exception e) {
			System.out.println("Debes ingresar un numero");
			return true;
		}
	}

	public void topoElCiego() {
		Scanner entradaEscaner = new Scanner(System.in);
		Scanner entradaEscaner2 = new Scanner(System.in);
		String n = "";
		String cadena = "";

		do {
			System.out.println("Ingresa el tamaño del zoom");
			n = entradaEscaner.nextLine();
		} while (isLetra(String.valueOf(n)) || Integer.parseInt(n) < 1 || Integer.parseInt(n) > 101);

		do {
			System.out.println("Ingresa la cadena");
			cadena = entradaEscaner2.nextLine();
		} while (cadena.equals(cadena.toUpperCase()));

		int tamanioZoom = Integer.parseInt(n);
		char[] cadenaArr = cadena.toCharArray();
		String[] auxArr = new String[tamanioZoom]; // Guardara cada una de la cadenas
		StringBuilder aux = new StringBuilder();// Concatenar cada uno de los caracteres

		for (int i = 0; i < tamanioZoom; i++) {
			// 0 = aaa -> agregarlo a auxArr
			// 1 = bbb -> agregarlo a auxArr
			// 2 = ccc -> agregarlo a auxArr
			for (int j = 0; j < auxArr.length; j++) {
				aux.append(cadenaArr[i]);
			}
			auxArr[i] = "" + aux;
		}

		for (int i = 0; i < Math.pow(tamanioZoom, 2); i++) {
			System.out.println(aux);
		}
	}
}
