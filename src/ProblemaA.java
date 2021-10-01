/**
 * El problema trata que dado un numero entero positivo decir si es PI, caso
 * contrario decir el numero
 * 
 * @author Maribel
 *
 */
public class ProblemaA {

	/**
	 * Método que realiza el proceso para saber si es un número PI
	 * 
	 * @param cadena El parametro cadena es el valor que ingresa el usuario para
	 *               verificar si es un numero PI
	 */
	public void juegoPI(String cadena) {
		try {
			int numero = Integer.parseInt(cadena);

			if (numero > 0 && numero < Math.pow(10, 9)) {// verificacion de numero natural
				
				if (numero % 7 == 0) {// es multiplo de 7
					System.out.println("");
					System.out.println("pi");
				} else {
					char[] cadenaArr = cadena.toCharArray();

					if (Character.getNumericValue(cadenaArr[cadenaArr.length - 1]) == 7) {
						System.out.println("");
						System.out.println("pi");
					} else {
						int acumulado = 0;

						for (int i = 0; i < cadenaArr.length; i++) {

							acumulado = acumulado + Character.getNumericValue(cadenaArr[i]);
						}
						if (acumulado % 7 == 0) {
							System.out.println("");
							System.out.println("pi");
						} else {
							System.out.println("");
							System.out.println(numero);
						}
					}
				}
			} else {
				System.out.println("");
				System.out.println(numero);
			}
		} catch (Exception e) {
			System.out.println("Los valores deben de ser menores a 10^9");
		}

	}
}
