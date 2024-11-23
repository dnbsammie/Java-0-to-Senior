/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Almacenamiento de configuraciones de una aplicación
*/
package Clase05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> configuration = new HashMap<>();
        int option;

        do {
            System.out.println("\n--- Menú de Configuración ---");
            System.out.println("1. Agregar nueva configuración");
            System.out.println("2. Actualizar configuración existente");
            System.out.println("3. Mostrar todas las configuraciones");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Ingresa el nombre de la configuración: ");
                    String configName = input.nextLine();
                    System.out.print("Ingresa el valor de la configuración: ");
                    String configValue = input.nextLine();
                    configuration.put(configName, configValue);
                    System.out.println("Configuración " + configName + " agregada.");
                    break;
                case 2:
                    System.out.print("Ingresa el nombre de la configuración a actualizar: ");
                    configName = input.nextLine();
                    if (configuration.containsKey(configName)) {
                        System.out.print("Ingresa el nuevo valor de la configuración: ");
                        configValue = input.nextLine();
                        configuration.put(configName, configValue);
                        System.out.println("Configuración " + configName + " actualizada.");
                    } else {
                        System.out.println("La configuración " + configName + " no existe.");
                    }
                    break;
                case 3:
                    if (configuration.isEmpty()) {
                        System.out.println("No hay configuraciones almacenadas.");
                    } else {
                        System.out.println("Configuraciones almacenadas:");
                        for (Map.Entry<String, String> entry : configuration.entrySet()) {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
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
