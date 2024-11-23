/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Gestión de una lista de tareas pendientes
*/
package Clase05;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
      private static ArrayList<String> tasks = new ArrayList<>();

    public static void addTask(String task) {
        tasks.add(task);
    }

    public static void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public static void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            System.out.println("Tareas pendientes:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void showTaskByIndex(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Tarea en la posición " + (index + 1) + ": " + tasks.get(index));
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nGestión de Tareas:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Mostrar todas las tareas");
            System.out.println("4. Ver tarea por posición");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Ingresa la descripción de la nueva tarea: ");
                    String task = input.nextLine();
                    addTask(task);
                    break;
                case 2:
                    showTasks();
                    System.out.print("Ingresa el número de la tarea a eliminar: ");
                    int taskToRemove = input.nextInt();
                    removeTask(taskToRemove - 1);
                    break;
                case 3:
                    showTasks();
                    break;
                case 4:
                    System.out.print("Ingresa el número de la tarea que quieres ver: ");
                    int taskToView = input.nextInt();
                    showTaskByIndex(taskToView - 1);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (option != 5);

        input.close();
    }
}