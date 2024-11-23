/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Simulación de una cola de clientes en un banco
*/
package Clase05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio9 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> clients = new LinkedList<>();
        int option;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar cliente a la cola");
            System.out.println("2. Atender cliente");
            System.out.println("3. Ver estado de la cola");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Ingresa el nombre del cliente: ");
                    String client = input.nextLine();
                    clients.add(client);
                    System.out.println("Cliente " + client + " agregado a la cola.");
                    break;
                case 2:
                    if (!clients.isEmpty()) {
                        String attended = clients.poll(); 
                        System.out.println("Cliente " + attended + " ha sido atendido.");
                    } else {
                        System.out.println("No hay clientes en la cola.");
                    }
                    break;
                case 3:
                    if (clients.isEmpty()) {
                        System.out.println("No hay clientes en la cola.");
                    } else {
                        System.out.println("Clientes en la cola:");
                        for (String c : clients) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
                    break;
            }
        } while (option != 4);

        input.close();
    }
}
