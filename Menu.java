package tema3.relacion3_5;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int opcion;
		
		do {
			System.out.println("");
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("==============");
			System.out.println("1. Piedra, papel o tijera.");
			System.out.println("2. Abecedario.");
			System.out.println("0. Salir.");
			System.out.print("Escribe un número de opción (0-2): ");
			
			opcion = Integer.parseInt(teclado.nextLine());
			
			switch (opcion) {
			case 0:
				System.out.println("Saliendo del programa...");
				System.out.println("FIN DE PROGRAMA");
				break;
			case 1:
				System.out.println("Has elegido la opcion 1.\n");
				Ejercicio5.main(args);;
				break;
			case 2:
				System.out.println("Has elegido la opción 2.\n");
				Ejercicio4.main(args);;
				break;
			default:
				System.out.printf("No existe la opción %d. Inserte una opción visible en el menú.\n", opcion);
				break;
			}
			
		} while (opcion != 0);
		
		
	}

}
