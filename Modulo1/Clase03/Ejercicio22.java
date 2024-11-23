/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Realizar un programa que permita controlar el juego de piedra, papel, tijera introduciendo P para piedra, L para papel y T para tijera por cada jugador.
    El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final de cada ronda preguntar si desea volver a jugar.
*/
package Clase03;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        int[] scores = new int[3]; 

        while (cont) {
            System.out.println("\nJUEGA PIEDRA PAPEL O TIJERA\n");
            System.out.println("Selecciona el modo de juego:");
            System.out.println("1. Jugar contra otro jugador");
            System.out.println("2. Jugar contra la máquina");
            System.out.println("3. Salir");
            int gameMode = input.nextInt();

            String player1, player2;

            switch (gameMode) {
                case 1:
                    input.nextLine();
                    System.out.println("Jugador 1, ingresa tu movimiento (P para Piedra 🥌, L para Papel 📄, T para Tijera ✂): ");
                    player1 = input.nextLine().toUpperCase();
                    System.out.println("Jugador 2, ingresa tu movimiento (P para Piedra 🥌, L para Papel 📄, T para Tijera ✂): ");
                    player2 = input.nextLine().toUpperCase();
                    String result = playRound(player1, player2);
                    updateCounters(result, scores);
                    break;

                case 2:
                    input.nextLine();
                    System.out.println("\nIngresa su movimiento (P para Piedra 🥌, L para Papel 📄, T para Tijera ✂): ");
                    player1 = input.nextLine().toUpperCase();
                    player2 = playAgainstMachine();
                    System.out.println("La máquina elige: " + player2);
                    result = playRound(player1, player2);
                    updateCounters(result, scores);
                    break;

                case 3:
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    System.out.println("Puntaje Final:");
                    System.out.println("Victorias: " + scores[0]);
                    System.out.println("Perdidas: " + scores[1]);
                    System.out.println("Empates: " + scores[2]);
                    cont = false;
                    break;

                default:
                    System.out.println("\nEntrada inválida. Por favor ingresa una opcion valida.\n");
            }

            if (cont) {
                System.out.println("\n¿Quieres seguir jugando? (S para sí, N para no): ");
                String continuePlaying = input.nextLine().toUpperCase();
                if (continuePlaying.equals("N")) {
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    System.out.println("Puntaje Final:");
                    System.out.println("Victorias: " + scores[0]);
                    System.out.println("Perdidas: " + scores[1]);
                    System.out.println("Empates: " + scores[2]);
                    cont = false;
                }
            }
        }
        input.close();
    }

    public static String playRound(String player1, String player2) {
        if (player1.equals(player2)) {
            System.out.println("¡Es un empate!");
            return "tie";
        } else if ((player1.equals("P") && player2.equals("T")) ||
                   (player1.equals("L") && player2.equals("P")) ||
                   (player1.equals("T") && player2.equals("L"))) {
            System.out.println("¡Jugador 1 gana!");
            return "victory";
        } else {
            System.out.println("¡Jugador 2 gana!");
            return "loss";
        }
    }

    public static String playAgainstMachine() {
        Random rand = new Random();
        int choice = rand.nextInt(3);
        if (choice == 0) {
            return "P para Piedra 🥌";
        } else if (choice == 1) {
            return "L para Papel 📄";
        } else {
            return "T para Tijera ✂";
        }
    }

    public static void updateCounters(String result, int[] scores) {
        if (result.equals("victory")) {
            scores[0]++;
        } else if (result.equals("loss")) {
            scores[1]++;
        } else if (result.equals("tie")) {
            scores[2]++;
        }
    }
}