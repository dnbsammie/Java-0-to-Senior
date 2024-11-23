/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Connect4 / Conecta 4
*/

package Clase07;

import java.util.*;

public class Connect4 {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private static char[][] board = new char[ROWS][COLS];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        initializeBoard();
        displayBoard();

        while (true) {
            System.out.println("Jugador " + currentPlayer + ", ingresa la columna (1-7): ");
            int col = input.nextInt() - 1;

            if (col < 0 || col >= COLS || isColumnFull(col)) {
                System.out.println("Columna inválida o llena. Intenta nuevamente.");
                continue;
            }

            int row = getAvailableRow(col);
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
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void displayBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j]);
                if (j < COLS - 1)
                    System.out.print("|");
            }
            System.out.println();
            if (i < ROWS - 1)
                System.out.println("---------------");
        }
    }

    private static int getAvailableRow(int col) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][col] == ' ') {
                return i;
            }
        }
        return -1;
    }

    private static boolean isColumnFull(int col) {
        return board[0][col] != ' ';
    }

    private static boolean checkWinner() {

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
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

    private static boolean checkDirection(int row, int col, int rowDir, int colDir) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int r = row + i * rowDir;
            int c = col + i * colDir;
            if (r >= 0 && r < ROWS && c >= 0 && c < COLS && board[r][c] == currentPlayer) {
                count++;
            } else {
                break;
            }
        }
        return count == 4;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < COLS; i++) {
            if (board[0][i] == ' ') {
                return false;
            }
        }
        return true;
    }
}
