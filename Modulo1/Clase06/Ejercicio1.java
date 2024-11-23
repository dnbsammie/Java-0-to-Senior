/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Analisis de ventas de una tienda
*/
package Clase06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio1 {
      public static void main(String[] args) {
        List<String> sales = Arrays.asList(
            "camisa,2,20.00",
            "pantalon,1,35.50",
            "zapatos,3,50.00",
            "camisa,1,20.00",
            "pantalon,2,35.50"
        );

        double totalIncome = calculateTotalIncome(sales);
        System.out.println("Ingreso total generado: " + totalIncome);

        Map<String, Integer> salesCount = countSalesByProduct(sales);
        System.out.println("Ventas por producto:");
        for (Map.Entry<String, Integer> entry : salesCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        double threshold = 50.0;
        System.out.println("\nVentas mayores a " + threshold + ":");
        filterSalesAboveAmount(sales, threshold);

        String mostSoldProduct = getMostSoldProduct(sales);
        System.out.println("\nProducto más vendido: " + mostSoldProduct);
    }

    public static double calculateTotalIncome(List<String> sales) {
        double totalIncome = 0.0;
        for (String sale : sales) {
            String[] parts = sale.split(",");
            int quantity = Integer.parseInt(parts[1]);
            double unitPrice = Double.parseDouble(parts[2]);
            totalIncome += quantity * unitPrice;
        }
        return totalIncome;
    }

    public static Map<String, Integer> countSalesByProduct(List<String> sales) {
        Map<String, Integer> salesCount = new HashMap<>();
        for (String sale : sales) {
            String[] parts = sale.split(",");
            String product = parts[0];
            int quantity = Integer.parseInt(parts[1]);
            salesCount.put(product, salesCount.getOrDefault(product, 0) + quantity);
        }
        return salesCount;
    }

    public static void filterSalesAboveAmount(List<String> sales, double amount) {
        for (String sale : sales) {
            String[] parts = sale.split(",");
            int quantity = Integer.parseInt(parts[1]);
            double unitPrice = Double.parseDouble(parts[2]);
            double totalSale = quantity * unitPrice;
            if (totalSale > amount) {
                System.out.println(sale + " (Ingreso total: " + totalSale + ")");
            }
        }
    }

    public static String getMostSoldProduct(List<String> sales) {
        Map<String, Integer> salesCount = countSalesByProduct(sales);
        String mostSoldProduct = null;
        int maxSales = 0;

        for (Map.Entry<String, Integer> entry : salesCount.entrySet()) {
            if (entry.getValue() > maxSales) {
                maxSales = entry.getValue();
                mostSoldProduct = entry.getKey();
            }
        }
        return mostSoldProduct;
    }
}
