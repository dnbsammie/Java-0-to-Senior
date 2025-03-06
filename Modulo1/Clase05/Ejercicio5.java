/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Gestion de una cola de impresion
*/
package Modulo1.Clase05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio5 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> printQueue = new LinkedList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Menú de Gestión de Cola de Impresión ---");
            System.out.println("1. Agregar documento a la cola");
            System.out.println("2. Imprimir documento (eliminar el primero en la cola)");
            System.out.println("3. Mostrar documentos en la cola");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Ingresa el nombre del documento: ");
                    String document = input.nextLine();
                    printQueue.add(document);
                    System.out.println("Documento agregado a la cola.");
                    break;

                case 2:
                    if (!printQueue.isEmpty()) {
                        String printedDocument = printQueue.poll();
                        System.out.println("Imprimiendo: " + printedDocument);
                    } else {
                        System.out.println("No hay documentos en la cola para imprimir.");
                    }
                    break;

                case 3:
                    if (!printQueue.isEmpty()) {
                        System.out.println("Documentos en la cola:");
                        for (String doc : printQueue) {
                            System.out.println(doc);
                        }
                    } else {
                        System.out.println("No hay documentos en la cola.");
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
                    break;
            }
        }
        input.close();
    }
}
