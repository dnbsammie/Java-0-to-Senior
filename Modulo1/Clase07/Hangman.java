/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Ahorcado / Hangman
*/
package Modulo1.Clase07;

import java.util.*;

public class Hangman {
    private final int MAX_ATTEMPTS = 6;
    private final List<String> WORD_LIST = Arrays.asList("MUSICA", "AGUACATE", "PROGRAMACION", "LAMPARA", "ELECTRICO");

    private String secretWord;
    private Set<Character> guessedLetters;
    private int incorrectAttempts;
    private StringBuilder progress;

    public Hangman() {
        var random = new Random();
        this.secretWord = WORD_LIST.get(random.nextInt(WORD_LIST.size()));
        this.guessedLetters = new HashSet<>();
        this.incorrectAttempts = 0;
        this.progress = new StringBuilder("_".repeat(secretWord.length()));
    }

    public void play() {
        var input = new Scanner(System.in);

        while (incorrectAttempts < MAX_ATTEMPTS && progress.toString().contains("_")) {
            displayState();
            System.out.print("Ingresa una letra: ");
            var guessedLetter = input.next().toUpperCase().charAt(0);

            if (guessedLetters.contains(guessedLetter)) {
                System.out.println("Ya intentaste esa letra.");
                continue;
            }

            guessedLetters.add(guessedLetter);
            processGuess(guessedLetter);
        }

        displayResult();
        input.close();
    }

    private void displayState() {
        System.out.println("Palabra a adivinar: " + progress);
        System.out.println("Letras intentadas: " + guessedLetters);
        drawHangman();
    }

    private void processGuess(char guessedLetter) {
        if (secretWord.contains(String.valueOf(guessedLetter))) {
            for (var i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guessedLetter) {
                    progress.setCharAt(i, guessedLetter);
                }
            }
        } else {
            incorrectAttempts++;
        }
    }

    private void displayResult() {
        if (progress.toString().equals(secretWord)) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + secretWord);
        } else {
            System.out.println("Perdiste. La palabra era: " + secretWord);
        }
    }

    private void drawHangman() {
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

    public static void main(String[] args) {
        new Hangman().play();
    }
}
