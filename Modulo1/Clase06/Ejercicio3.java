/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Analisis de facturas de una empresa
*/
package Clase06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio3 {
     public static void main(String[] args) {
        List<String> invoices = Arrays.asList(
            "F001,ClienteA,1000.00,19",
            "F002,ClienteB,1500.00,19",
            "F003,ClienteA,2000.00,19",
            "F004,ClienteC,2500.00,19",
            "F005,ClienteB,3000.00,19"
        );

        System.out.println("Monto total con IVA por factura:");
        for (String invoice : invoices) {
            System.out.println(calculateTotalWithVAT(invoice));
        }

        Map<String, Double> totalIncomeByClient = calculateTotalIncomeByClient(invoices);
        System.out.println("\nIngreso total por cliente:");
        for (Map.Entry<String, Double> entry : totalIncomeByClient.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        double threshold = 2000.00;
        System.out.println("\nFacturas mayores a " + threshold + ":");
        filterInvoicesAboveThreshold(invoices, threshold);

        String clientWithHighestIncome = getClientWithHighestIncome(totalIncomeByClient);
        System.out.println("\nCliente con el mayor ingreso total: " + clientWithHighestIncome);
    }

    public static String calculateTotalWithVAT(String invoice) {
        String[] parts = invoice.split(",");
        String invoiceNumber = parts[0];
        String clientName = parts[1];
        double totalAmount = Double.parseDouble(parts[2]);
        double vatPercentage = Double.parseDouble(parts[3]);

        double vatAmount = totalAmount * vatPercentage / 100;
        double totalWithVAT = totalAmount + vatAmount;

        return invoiceNumber + " - " + clientName + " - Total con IVA: " + totalWithVAT;
    }

    public static Map<String, Double> calculateTotalIncomeByClient(List<String> invoices) {
        Map<String, Double> incomeByClient = new HashMap<>();

        for (String invoice : invoices) {
            String[] parts = invoice.split(",");
            String clientName = parts[1];
            double totalAmount = Double.parseDouble(parts[2]);

            incomeByClient.put(clientName, incomeByClient.getOrDefault(clientName, 0.0) + totalAmount);
        }

        return incomeByClient;
    }

    public static void filterInvoicesAboveThreshold(List<String> invoices, double threshold) {
        for (String invoice : invoices) {
            String[] parts = invoice.split(",");
            double totalAmount = Double.parseDouble(parts[2]);

            if (totalAmount > threshold) {
                System.out.println(invoice);
            }
        }
    }

    public static String getClientWithHighestIncome(Map<String, Double> incomeByClient) {
        String clientWithHighestIncome = null;
        double highestIncome = 0.0;

        for (Map.Entry<String, Double> entry : incomeByClient.entrySet()) {
            if (entry.getValue() > highestIncome) {
                highestIncome = entry.getValue();
                clientWithHighestIncome = entry.getKey();
            }
        }

        return clientWithHighestIncome;
    }
}
