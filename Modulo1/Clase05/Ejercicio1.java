/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Funciones con uso de arrays
*/
package Clase05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
        public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void sortArrayDescending(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static double calculateAverage(int[] arr) {
        int sum = sumArray(arr);
        return (double) sum / arr.length;
    }

    public static int findMode(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = arr[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mode = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Ingresa los elementos del array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("La suma de todos los elementos es: " + sumArray(arr));
        System.out.println("El valor máximo es: " + findMax(arr));
        System.out.println("El valor mínimo es: " + findMin(arr));

        reverseArray(arr);
        System.out.println("El array invertido es: " + Arrays.toString(arr));

        sortArrayDescending(arr);
        System.out.println("El array ordenado de mayor a menor es: " + Arrays.toString(arr));

        System.out.println("El promedio de los elementos es: " + calculateAverage(arr));
        System.out.println("La moda es: " + findMode(arr));

        input.close();
    }
}
