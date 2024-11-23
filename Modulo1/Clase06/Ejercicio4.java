/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Generador de ID para los empleados
*/
package Clase06;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4 {

    private static Set<String> generatedUIDs = new HashSet<>();
    private static Set<String> validUIDs = new HashSet<>();
    private static Set<String> invalidUIDs = new HashSet<>();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        boolean running = true;
        
        while (running) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Generar códigos");
            System.out.println("2. Mostrar lista de códigos");
            System.out.println("3. Validar códigos");
            System.out.println("4. Eliminar códigos inválidos");
            System.out.println("5. Salir");
            
            int option = input.nextInt();
            input.nextLine();
            
            switch (option) {
                case 1:
                    generateUIDs(random);
                    break;
                case 2:
                    showUIDs();
                    break;
                case 3:
                    validateUIDs();
                    break;
                case 4:
                    removeInvalidUIDs();
                    break;
                case 5:
                    running = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        }
        
        input.close();
    }

    public static void generateUIDs(Random random) {
        generatedUIDs.clear();
        
        while (generatedUIDs.size() < 100) {
            String uid = generateUID(random);
            if (!generatedUIDs.contains(uid)) {
                generatedUIDs.add(uid);
            }
        }
        
        System.out.println("\n100 códigos generados.\n");
    }

    public static String generateUID(Random random) {
        StringBuilder uid = new StringBuilder();
        
        while (uid.length() < 10) {
            char c = (random.nextBoolean()) ? (char) ('A' + random.nextInt(26)) : (char) ('0' + random.nextInt(10));
            uid.append(c);
        }
        
        return uid.toString();
    }

    public static void validateUIDs() {
        validUIDs.clear();
        invalidUIDs.clear();
        
        for (String uid : generatedUIDs) {
            if (isValid(uid)) {
                validUIDs.add(uid);
            } else {
                invalidUIDs.add(uid);
            }
        }

        if (invalidUIDs.isEmpty()) {
            System.out.println("\nNo hay códigos inválidos.\n");
        } else {
            System.out.println("\nCódigos inválidos:\n");
            for (String invalidUID : invalidUIDs) {
                System.out.println(invalidUID + " - Inválido");
            }
        }
    }

    public static boolean isValid(String uid) {
        if (uid.length() != 10) {
            return false;
        }

        if (!uid.matches("[a-zA-Z0-9]{10}")) {
            return false;
        }

        int uppercaseCount = 0;
        int digitCount = 0;

        for (char c : uid.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        if (uppercaseCount < 2 || digitCount < 3) {
            return false;
        }

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : uid.toCharArray()) {
            uniqueChars.add(c);
        }

        if (uniqueChars.size() != 10) {
            return false;
        }

        return true;
    }

    public static void removeInvalidUIDs() {
        generatedUIDs.removeAll(invalidUIDs);
        System.out.println("\nCódigos inválidos eliminados.\n");
    }

    public static void showUIDs() {
        if (generatedUIDs.isEmpty()) {
            System.out.println("\nNo se han generado códigos.\n");
        } else {
            System.out.println("Lista de códigos generados:");
            for (String uid : generatedUIDs) {
                String validity = isValid(uid) ? "Válido" : "Inválido";
                System.out.println(uid + " - " + validity);
            }
        }
    }
}
