/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Cálculo de Áreas
*/
package Modulo1.Clase04;

import java.util.Scanner;

public class Ejercicio8 {

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * calculateSquareArea(radius);
    }

    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selecciona la figura para calcular el área:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.print("Ingresa el número de la opción (1-3): ");
        int choice = input.nextInt();

        double area = 0;
        double value1, value2;

        switch (choice) {
            case 1:
                System.out.print("Ingresa el radio del círculo: ");
                value1 = input.nextDouble();
                area = calculateCircleArea(value1);
                System.out.println("El área del círculo es: " + area);
                break;
            case 2:
                System.out.print("Ingresa la longitud del lado del cuadrado: ");
                value1 = input.nextDouble();
                area = calculateSquareArea(value1);
                System.out.println("El área del cuadrado es: " + area);
                break;
            case 3:
                System.out.print("Ingresa la base del triángulo: ");
                value1 = input.nextDouble();
                System.out.print("Ingresa la altura del triángulo: ");
                value2 = input.nextDouble();
                area = calculateTriangleArea(value1, value2);
                System.out.println("El área del triángulo es: " + area);
                break;
            default:
                System.out.println("Opción inválida.");
        }

        input.close();
    }
}
