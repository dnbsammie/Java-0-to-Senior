/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Tres en linea / Triqui / Tic Tac Toe
*/
package Modulo1.Clase07;

import java.util.*;

public class TicTacToe {
    private static final int SIZE = 3;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        initializeBoard();
        displayBoard();

        while (true) {
            System.out.println("Jugador " + currentPlayer + ", ingresa fila y columna (1-3): ");
            int row = input.nextInt() - 1;
            int col = input.nextInt() - 1;

            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE || board[row][col] != ' ') {
                System.out.println("Movimiento inválido. Intenta nuevamente.");
                continue;
            }

            board[row][col] = currentPlayer;
            displayBoard();

            if (checkWinner()) {
                System.out.println("¡Jugador " + currentPlayer + " gana!");
                break;
            }

            if (isBoardFull()) {
                System.out.println("¡Empate!");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        input.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void displayBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
                if (j < SIZE - 1) System.out.print(" | ");
            }
            System.out.println();
            if (i < SIZE - 1) System.out.println("---------");
        }
    }

    private static boolean checkWinner() {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }

        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }

        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
