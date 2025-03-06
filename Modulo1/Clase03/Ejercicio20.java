/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Realice un programa que genere el tablero de ajedrez en consola usando instrucciones de repetición.    
*/
package Modulo1.Clase03;

public class Ejercicio20 {
    public static void main(String[] args) {
        int files = 8;
        int columns = 8;

        for(int i =0; i < files; i++){
            for(int j = 0; j<columns; j++){
                System.out.print((i + j) % 2 == 0 ? "B" : "N");
                if (j < 8) {
                    System.out.print(" | ");
                }
            }
    
            System.out.println();
            if (i < 8) System.out.println("- - - - - - - - - - - - - - - -");
        }
 
    }
}
