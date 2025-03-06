/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Ahorcado / Hangman
*/
package Modulo1.Clase07;

import java.util.*;

public class Hangman {
    private static final int MAX_ATTEMPTS = 6;
    private static final List<String> WORD_LIST = Arrays.asList("MUSICA", "AGUACATE", "PROGRAMACION", "LAMPARA", "ELECTRICO");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String secretWord = WORD_LIST.get(random.nextInt(WORD_LIST.size()));
        Set<Character> guessedLetters = new HashSet<>();
        int incorrectAttempts = 0;
        StringBuilder progress = new StringBuilder("_".repeat(secretWord.length()));

        while (incorrectAttempts < MAX_ATTEMPTS && progress.toString().contains("_")) {
            System.out.println("Palabra a adivinar: " + progress);
            System.out.println("Letras intentadas: " + guessedLetters);
            drawHangman(incorrectAttempts);
            
            System.out.print("Ingresa una letra: ");
            char guessedLetter = input.next().toUpperCase().charAt(0);

            if (guessedLetters.contains(guessedLetter)) {
                System.out.println("Ya intentaste esa letra.");
                continue;
            }

            guessedLetters.add(guessedLetter);

            if (secretWord.contains(String.valueOf(guessedLetter))) {
                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == guessedLetter) {
                        progress.setCharAt(i, guessedLetter);
                    }
                }
            } else {
                incorrectAttempts++;
            }
        }

        if (progress.toString().equals(secretWord)) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + secretWord);
        } else {
            System.out.println("Perdiste. La palabra era: " + secretWord);
        }
        input.close();
    }

    private static void drawHangman(int incorrectAttempts) {
        String[] hangmanStages = {
            "   +------+\n   |      |\n          |\n          |\n          |\n          |\n  +-------+",
            "   +------+\n   |      |\n   O      |\n          |\n          |\n          |\n  +-------+",
            "   +------+\n   |      |\n   O      |\n   |      |\n          |\n          |\n  +-------+",
            "   +------+\n   |      |\n   O      |\n  /|      |\n          |\n          |\n  +-------+",
            "   +------+\n   |      |\n   O      |\n  /|\\     |\n          |\n          |\n  +-------+",
            "   +------+\n   |      |\n   O      |\n  /|\\     |\n   |      |\n          |\n  +-------+",
            "   +------+\n   |      |\n   O      |\n  /|\\     |\n   |      |\n  / \\     |\n  +-------+"
        };
        System.out.println(hangmanStages[incorrectAttempts]);
    }
}