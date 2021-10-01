
public class ProblemaC {
	/**
	 * Metodo que dado un numero me dice cuantos PI perfectos existen en un intervalo de [1-numero]
	 * @param numero
	 */
	public void juegoPIIntervalo(int numero) {
		int contadorPi = 0;
		
		for (int i = 1; i <= Math.pow(numero, 2); i++) {
			String cadena = String.valueOf(i);
			
			if (i > 0) {
				
				if (i % 7 == 0) {
					contadorPi++;
				} else {
					char[] cadenaArr = cadena.toCharArray();
					if (Character.getNumericValue(cadenaArr[cadenaArr.length - 1]) == 7) {
						contadorPi++;
					} else {
						int acumulado = 0;
						for (int j = 0; j < cadenaArr.length; j++) {

							acumulado = acumulado + Character.getNumericValue(cadenaArr[j]);
						}
						if (acumulado % 7 == 0) {
							contadorPi++;
						}

					}
				}
			}
		}
		System.out.println("Existen " + contadorPi + " PI perfectos");
		System.out.println();

	}
}
