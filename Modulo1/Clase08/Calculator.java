/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Calculadora de Inventario
*/
package Modulo1.Clase08;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Calculator {
    private List<Product> products = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private final int MAX_PRODUCTS = 100;

    public void start() {
        while (true) {
            showMenu();
            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProducts();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    updateProduct();
                    break;
                case 5:
                    calculateTotalInventoryValue();
                    break;
                case 6:
                    showMostExpensiveAndCheapestProduct();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\n--- Menú de Inventario ---\n");
        System.out.println("1. Ingresar producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Buscar producto");
        System.out.println("4. Actualizar producto");
        System.out.println("5. Calcular valor total del inventario");
        System.out.println("6. Mostrar producto más caro y más barato");
        System.out.println("7. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private void addProduct() {
        if (products.size() >= MAX_PRODUCTS) {
            System.out.println("No se pueden agregar más productos. El inventario está lleno.");
            return;
        }

        System.out.print("Ingresa el nombre del producto: ");
        String name = input.nextLine();

        System.out.print("Ingresa la cantidad del producto: ");
        int quantity = input.nextInt();

        System.out.print("Ingresa el precio del producto: ");
        double price = input.nextDouble();

        products.add(new Product(name, quantity, price));
        System.out.println("Producto agregado con éxito.");
    }

    private void showProducts() {
        if (products.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        System.out.println("\n--- Productos en Inventario ---");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private void searchProduct() {
        System.out.print("Ingresa el nombre del producto a buscar: ");
        String name = input.nextLine();

        Predicate<Product> byName = product -> product.name.equalsIgnoreCase(name);
        Optional<Product> foundProduct = products.stream().filter(byName).findFirst();

        if (foundProduct.isPresent()) {
            System.out.println("Producto encontrado: " + foundProduct.get());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private void updateProduct() {
        System.out.print("Ingresa el nombre del producto a actualizar: ");
        String name = input.nextLine();

        Predicate<Product> byName = product -> product.name.equalsIgnoreCase(name);
        Optional<Product> foundProduct = products.stream().filter(byName).findFirst();

        if (foundProduct.isPresent()) {
            Product product = foundProduct.get();
            System.out.print("Ingresa la nueva cantidad del producto: ");
            int quantity = input.nextInt();

            System.out.print("Ingresa el nuevo precio del producto: ");
            double price = input.nextDouble();

            product.quantity = quantity;
            product.price = price;
            System.out.println("Producto actualizado con éxito.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private void calculateTotalInventoryValue() {
        double totalValue = products.stream().mapToDouble(p -> p.quantity * p.price).sum();
        System.out.println("Valor total del inventario: $" + totalValue);
    }

    private void showMostExpensiveAndCheapestProduct() {
        if (products.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        Product mostExpensive = products.stream().max((p1, p2) -> Double.compare(p1.price, p2.price)).get();
        Product cheapest = products.stream().min((p1, p2) -> Double.compare(p1.price, p2.price)).get();

        System.out.println("Producto más caro: " + mostExpensive);
        System.out.println("Producto más barato: " + cheapest);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}
