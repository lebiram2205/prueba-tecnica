import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ProblemaA problemaA = new ProblemaA();
		ProblemaB problemaB = new ProblemaB();
		ProblemaC problemaC = new ProblemaC();
		ProblemaD problemaD = new ProblemaD();
		ProblemaE problemaE = new ProblemaE();
		
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Juego PI");
            System.out.println("2. Topo el ciego");
            System.out.println("3. Cantidad de numeros PI");
            System.out.println("4. Ayudando a Jimmy inspector de Agricultura");
            System.out.println("5. Problema E");
            System.out.println("6. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones anteriores(1-6): ");
                opcion = sn.nextInt();
                Scanner entradaEscaner = new Scanner (System.in); 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        System.out.println("Ingrese un valor y ¡veremos si es pi!: ");
                        String cadenaNumPI = entradaEscaner.nextLine(); 
                        problemaA.juegoPI(cadenaNumPI);
                        break;
                    case 2:
                    	System.out.println("Has seleccionado la opcion 2");
                    	problemaB.topoElCiego();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        
                        System.out.println("Ingrese el intervalo para conocer cuantos PI perfectos hay: ");
                        int cadena2 = entradaEscaner.nextInt(); 
                        problemaC.juegoPIIntervalo(cadena2);
                        break;
                    case 4:
                    	System.out.println("Has seleccionado la opcion 4");
                    	
                        System.out.println("Ingrese la Poblacion: ");
                        String poblacion = entradaEscaner.nextLine(); 
                        System.out.println("Ingrese los cultivos: ");
                        String determinaCultivos = entradaEscaner.nextLine();        
                        problemaD.determinaCultivos(determinaCultivos, poblacion);
                    	
                    case 5:
                        System.out.println("Has seleccionado la opcion 5");
                        problemaE.imprimeMensaje();
                        break;
                    case 6:
                    	 salir = true;
                         break;
            
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
	

}
