package tema3.relacion5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int opcionUsuario;
		int opcionOrdenador = 0;
		int puntosUsuario = 0;
		int puntosOrdenador = 0;
		
		System.out.println("¡Vamos a jugar a Piedra, Papel o Tijeras!");
		System.out.println("El ordenador ya ha elegido...");
		System.out.println("");
		System.out.println("¡TE TOCA ELEGIR!");
		System.out.println("==============");
		System.out.println("1. Piedra");
		System.out.println("2. Papel");
		System.out.println("3. Tijeras.");
		
		do {
			
		System.out.print("Elige tu opción (1-3). Si no quieres jugar, inserta 0: ");
		
		opcionUsuario = Integer.parseInt(teclado.nextLine());
		
		if (opcionUsuario > 3 || opcionUsuario < 1 && opcionUsuario != 0) {
			System.out.println("¿Has leido bien? Introduce un número del 1 al 3 para tu turno.");
			System.out.println("Inténtalo de nuevo...");
		} else {
	
			opcionOrdenador = (int)(1 + Math.random()*3);
			
			switch (opcionUsuario) {
			
			case 1:
				System.out.println("Has elegido PIEDRA");
				if (opcionOrdenador == 1) {
					System.out.println("El ordenador también eligió PIEDRA...Hay empate.");
				} else if (opcionOrdenador == 2) {
					System.out.println("El ordenador eligió PAPEl... Gana el ordenador :(");
					puntosOrdenador++;
				} else if (opcionOrdenador == 3) {
					System.out.println("El ordenador eligió TIJERAS... Has ganado :D");
					puntosUsuario++;
				}
				System.out.println("");
				System.out.println("¡Nueva partida!");
				break;
				
			case 2:
				System.out.println("Has elegido PAPEL");
				if (opcionOrdenador == 1) {
					System.out.println("El ordenador eligió PIEDRA... Has ganado :D");
					puntosUsuario++;
				} else if (opcionOrdenador == 2) {
					System.out.println("El ordenador también eligió PAPEL...Hay empate.");
				} else if (opcionOrdenador == 3) {
					System.out.println("El ordenador eligió TIJERAS... Gana el ordenador :(");
					puntosOrdenador++;
				}
				System.out.println("");
				System.out.println("¡Nueva partida!");
				break;
				
			case 3:
				System.out.println("Has elegido TIJERAS");
				if (opcionOrdenador == 1) {
					System.out.println("El ordenador eligió PIEDRA... Gana el ordenador :(");
					puntosOrdenador++;
				} else if (opcionOrdenador == 2) {
					System.out.println("El ordenador eligió PAPEL... Has ganado :D");
					puntosUsuario++;
				} else if (opcionOrdenador == 3) {
					System.out.println("El ordenador también eligió TIJERAS...Hay empate.");
				}
				System.out.println("");
				System.out.println("¡Nueva partida!");
				break;
				}
			} 
		
		} while (opcionUsuario != 0);
		
		
		System.out.println("No quieres jugar más. Fin de la partida.");
		System.out.println("");
		System.out.println("PUNTUACIONES");
		System.out.println("------------");
		System.out.printf("Has ganado %d puntos\n", puntosUsuario);
		System.out.printf("El ordenador ha ganado %d puntos\n\n", puntosOrdenador);
		
		if (puntosUsuario > puntosOrdenador) {
			System.out.println("El ganador es el USUARIO");
		} else if (puntosOrdenador > puntosUsuario) {
			System.out.println("El ganador es el ORDENADOR");
		} else if (puntosOrdenador == puntosUsuario) {
			System.out.println("No hay ganador puesto que hay un EMPATE");
		} else if (puntosOrdenador == 0 && puntosUsuario == 0) {
			System.out.println("No hay ganador puesto que no has jugado.");
		}
		

	}

}
