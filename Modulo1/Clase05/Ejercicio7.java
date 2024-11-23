/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Gestión de una lista de estudiantes en un curso
*/
package Clase05;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        int option;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Ingresa el nombre del estudiante: ");
                    String name = input.nextLine();
                    students.add(name);
                    System.out.println("Estudiante agregado.");
                    break;

                case 2:
                    System.out.print("Ingresa el nombre del estudiante a eliminar: ");
                    String studentToRemove = input.nextLine();
                    if (students.remove(studentToRemove)) {
                        System.out.println("Estudiante eliminado.");
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 3:
                    if (students.isEmpty()) {
                        System.out.println("No hay estudiantes inscritos.");
                    } else {
                        System.out.println("Estudiantes inscritos:");
                        for (String student : students) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, por favor ingresa una opción válida.");
            }
        } while (option != 4);

        input.close();
    }
}
