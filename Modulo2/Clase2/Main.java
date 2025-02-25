/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Sistema de gestión vehiculos
*/
package Modulo2.Clase2;

public class Main {
    public static void main(String[] args) {
        Vehicle.Car car1 = new Vehicle("Peugeot", "206", 220).new Car("Peugeot", "206", 220, 3);
        Vehicle.Car car2 = new Vehicle("Mitsubishi", "Evolution 3", 240).new Car("Mitsubishi", "Evolution 3", 240, 4);
        Vehicle.Bike bike1 = new Vehicle("Harley-Davidson", "Sportster", 180).new Bike("Harley-Davidson", "Sportster", 180, true);
        Vehicle.Bike bike2 = new Vehicle("Husqvarna", "Svartpilen", 208).new Bike("Husqvarna", "Svartpilen", 208, false);

        car1.showDetails();
        car2.showDetails();
        bike1.showDetails();
        bike2.showDetails();
    }
}