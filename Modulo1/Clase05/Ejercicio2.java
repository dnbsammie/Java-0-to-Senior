/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Matriz de rotacion
*/
package Clase05;

import java.util.Scanner;

public class Ejercicio2 {
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el tamaño de la matriz (n x n): ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Ingresa los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriz original:");
        printMatrix(matrix);

        rotateMatrix(matrix);

        System.out.println("Matriz rotada 90 grados en sentido horario:");
        printMatrix(matrix);

        input.close();
    }
}
