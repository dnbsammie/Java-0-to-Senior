/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Tres en linea / Triqui / Tic Tac Toe
*/
package Modulo1.Clase07;

import java.util.Scanner;

public class TicTacToe {
    private final int SIZE = 3;
    private final char[][] board = new char[SIZE][SIZE];
    private char currentPlayer = 'X';

    public TicTacToe() {
        initializeBoard();
    }

    public void play() {
        var input = new Scanner(System.in);
        displayBoard();

        while (true) {
            System.out.println("Jugador " + currentPlayer + ", ingresa fila y columna (1-3): ");
            var row = input.nextInt() - 1;
            var col = input.nextInt() - 1;

            if (!isValidMove(row, col)) {
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

    private void initializeBoard() {
        for (var i = 0; i < SIZE; i++) {
            for (var j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private void displayBoard() {
        for (var i = 0; i < SIZE; i++) {
            for (var j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
                if (j < SIZE - 1)
                    System.out.print(" | ");
            }
            System.out.println();
            if (i < SIZE - 1)
                System.out.println("---------");
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == ' ';
    }

    private boolean checkWinner() {
        for (var i = 0; i < SIZE; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    private boolean isBoardFull() {
        for (var i = 0; i < SIZE; i++) {
            for (var j = 0; j < SIZE; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new TicTacToe().play();
    }
}
