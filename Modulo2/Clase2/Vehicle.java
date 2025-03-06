/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Sistema de gestión vehiculos
*/
package Modulo2.Clase2;

public class Vehicle {
    private String brand;
    private String model;
    private int maxSpeed;

    public Vehicle(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void showDetails(){
        System.out.println("\nINFORMACIÓN DEL VEHÍCULO\n");   
        System.out.printf("- Marca: %s%n", brand);
        System.out.printf("- Modelo: %s%n", model);
        System.out.printf("- Velocidad Máxima: %d%n", maxSpeed);
        // atributo segun tipo de vehiculo
    }

    public class Car extends Vehicle {
        private int numDoors;

        public Car(String brand, String model, int maxSpeed, int numDoors) {
            super(brand, model, maxSpeed);
            this.numDoors = numDoors;
        }

        public int getNumDoors() {
            return numDoors;
        }

        public void setNumDoors(int numDoors) {
            this.numDoors = numDoors;
        }

        @Override
        public void showDetails() {
            super.showDetails();
            System.out.println("- Tipo de vehiculo: Automovil");
            System.out.printf("- Número de Puertas: %d%n", numDoors);
        }
    }

    public class Bike extends Vehicle {
        private boolean hasSidecar;

        public Bike(String brand, String model, int maxSpeed, boolean hasSidecar) {
            super(brand, model, maxSpeed);
            this.hasSidecar = hasSidecar;
        }

        public boolean getHasSidecar() {
            return hasSidecar;
        }

        public void setHasSidecar(boolean hasSidecar) {
            this.hasSidecar = hasSidecar;
        }

        @Override
        public void showDetails() {
            super.showDetails();
            System.out.println("- Tipo de vehiculo: Motocicleta");
            System.out.printf("- Tiene Sidecar: %s%n", hasSidecar ? "Sí" : "No");
        }
    }
}