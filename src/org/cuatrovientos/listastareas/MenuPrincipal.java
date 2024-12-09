package org.cuatrovientos.listastareas;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {	
	
	/**
	 * Lanza el menu principal para nuestra lista de tareas.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> listaDeTareas = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in); // Necesario para recoger una entrada por teclado en la consola
		int opcionElegidaUsuario = 0;
		do {
			mostrarMenuPrincipal();
			opcionElegidaUsuario = scanner.nextInt();
			scanner.nextLine(); // Recoger la información del Buffer

			switch (opcionElegidaUsuario) {
			case 1:
				anadirTareas(listaDeTareas, scanner);
				break;
			case 2:
				listarTareas(listaDeTareas, scanner);
				break;
			case 3:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
			}
		} while (opcionElegidaUsuario != 3);
	
		scanner.close();
	}
	/**
	 * @param listaDeTareas
	 * @param scanner
	 */
	private static void listarTareas(ArrayList<String> listaDeTareas, Scanner scanner) {
		if (listaDeTareas.size() == 0) {
			System.out.println("Lista de tareas vacia");
		}
		for (int i = 0; i < listaDeTareas.size(); i++) {
			System.out.println("Tarea " + i + ": " + listaDeTareas.get(i));
		}
		System.out.print("Pulse cualquier botón para continuar");
		scanner.nextLine();
	}
	/**
	 * Añadimos una nueva lista de tareas
	 * @param scanner
	 */
	private static void anadirTareas(ArrayList<String> listaDeTareas, Scanner scanner) {
		System.out.print("Introduce la descripción de la tarea: ");
		String descripcion = scanner.nextLine();
		listaDeTareas.add(descripcion);
	}
	/**
	 * 
	 */
	private static void mostrarMenuPrincipal() {
		System.out.println("\n--- Menú de Lista de Tareas ---");
		System.out.println("1. Agregar una tarea");
		System.out.println("2. Mostrar todas las tareas");
		System.out.println("3. Salir");
		System.out.print("Selecciona una opción: ");
	}

}