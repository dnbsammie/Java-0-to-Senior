/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Connect4 / Conecta 4
*/
package Modulo1.Clase07;

import java.util.Scanner;

public class Connect4 {
    private final int ROWS = 6;
    private final int COLS = 7;
    private final char[][] board = new char[ROWS][COLS];
    private char currentPlayer = 'X';

    public Connect4() {
        initializeBoard();
    }

    public void play() {
        var input = new Scanner(System.in);
        displayBoard();

        while (true) {
            System.out.println("Jugador " + currentPlayer + ", ingresa la columna (1-7): ");
            var col = input.nextInt() - 1;

            if (col < 0 || col >= COLS || isColumnFull(col)) {
                System.out.println("Columna inválida o llena. Intenta nuevamente.");
                continue;
            }

            var row = getAvailableRow(col);
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
        for (var i = 0; i < ROWS; i++) {
            for (var j = 0; j < COLS; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private void displayBoard() {
        for (var i = 0; i < ROWS; i++) {
            for (var j = 0; j < COLS; j++) {
                System.out.print(board[i][j]);
                if (j < COLS - 1)
                    System.out.print("|");
            }
            System.out.println();
            if (i < ROWS - 1)
                System.out.println("---------------");
        }
    }

    private int getAvailableRow(int col) {
        for (var i = ROWS - 1; i >= 0; i--) {
            if (board[i][col] == ' ') {
                return i;
            }
        }
        return -1;
    }

    private boolean isColumnFull(int col) {
        return board[0][col] != ' ';
    }

    private boolean checkWinner() {
        for (var i = 0; i < ROWS; i++) {
            for (var j = 0; j < COLS; j++) {
                if (board[i][j] == currentPlayer) {
                    if (checkDirection(i, j, 1, 0) ||
                            checkDirection(i, j, 0, 1) ||
                            checkDirection(i, j, 1, 1) ||
                            checkDirection(i, j, 1, -1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean checkDirection(int row, int col, int rowDir, int colDir) {
        var count = 0;
        for (var i = 0; i < 4; i++) {
            var r = row + i * rowDir;
            var c = col + i * colDir;
            if (r >= 0 && r < ROWS && c >= 0 && c < COLS && board[r][c] == currentPlayer) {
                count++;
            } else {
                break;
            }
        }
        return count == 4;
    }

    private boolean isBoardFull() {
        for (var i = 0; i < COLS; i++) {
            if (board[0][i] == ' ') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Connect4().play();
    }
}
