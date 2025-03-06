/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Control de Calidad en una fabrica de electronica
*/
package Modulo1.Clase06;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
     public static void main(String[] args) {
        List<String> products = Arrays.asList(
                "TabletX,LoteA,8", "SmartphoneY,LoteB,7", "SmartwatchZ,LoteC,6",
                "LaptopW,LoteD,9", "TabletX,LoteE,8"
        );
        
        List<String> inspections = Arrays.asList(
                "LoteA, funcionalidad, 85", "LoteB, seguridad, 92", "LoteC, funcionalidad, 75",
                "LoteD, seguridad, 60", "LoteA, seguridad, 88", "LoteC, seguridad, 82", "LoteB, funcionalidad, 80"
        );
        
        List<String> failures = Arrays.asList(
                "LoteA, sobrecalentamiento, 3", "LoteB, pantalla, 5", "LoteC, batería, 2",
                "LoteD, sobrecalentamiento, 7", "LoteA, pantalla, 2"
        );

        Map<String, Integer> productComplexity = parseProductComplexity(products);
        Map<String, List<Inspection>> lotInspections = parseInspections(inspections);
        Map<String, List<Failure>> lotFailures = parseFailures(failures);
        
        calculateApprovalIndex(lotInspections);
        identifyHighComplexityLowApproval(lotInspections, productComplexity);
        analyzeFrequentFailures(lotFailures);
        findLotWithMostFailures(lotFailures);
        evaluateAverageApprovalByInspectionType(lotInspections);
        identifyCriticalFailures(lotInspections, lotFailures);
        simulateProcessImprovement(lotInspections, productComplexity);
    }

    private static Map<String, Integer> parseProductComplexity(List<String> products) {
        return products.stream()
                .collect(Collectors.toMap(p -> p.split(",")[1], p -> Integer.parseInt(p.split(",")[2])));
    }

    private static Map<String, List<Inspection>> parseInspections(List<String> inspections) {
        return inspections.stream()
                .map(i -> i.split(","))
                .collect(Collectors.groupingBy(
                        i -> i[0],
                        Collectors.mapping(i -> new Inspection(i[1].trim(), Integer.parseInt(i[2].trim())), Collectors.toList())
                ));
    }

    private static Map<String, List<Failure>> parseFailures(List<String> failures) {
        return failures.stream()
                .map(f -> f.split(","))
                .collect(Collectors.groupingBy(
                        f -> f[0],
                        Collectors.mapping(f -> new Failure(f[1].trim(), Integer.parseInt(f[2].trim())), Collectors.toList())
                ));
    }

    private static void calculateApprovalIndex(Map<String, List<Inspection>> lotInspections) {
        System.out.println("Índice de Aprobación por Lote:");
        lotInspections.forEach((lot, inspections) -> {
            double avgApproval = inspections.stream().mapToInt(Inspection::getApprovalPercentage).average().orElse(0);
            if (avgApproval < 80) {
                System.out.println(lot + " - Aprobación Baja: " + avgApproval + "%");
            }
        });
    }

    private static void identifyHighComplexityLowApproval(Map<String, List<Inspection>> lotInspections, Map<String, Integer> productComplexity) {
        System.out.println("\nLotes con Alta Complejidad y Baja Aprobación:");
        lotInspections.forEach((lot, inspections) -> {
            double avgApproval = inspections.stream().mapToInt(Inspection::getApprovalPercentage).average().orElse(0);
            int complexity = productComplexity.get(lot);
            if (complexity > 7 && avgApproval < 85) {
                System.out.println(lot + " - Complejidad: " + complexity + " | Aprobación: " + avgApproval + "%");
            }
        });
    }

    private static void analyzeFrequentFailures(Map<String, List<Failure>> lotFailures) {
        System.out.println("\nFallos Frecuentes:");
        lotFailures.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Failure::getType, Collectors.summingInt(Failure::getQuantity)))
                .entrySet().stream()
                .filter(entry -> entry.getValue() >= 3)
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue() + " fallos"));
    }

    private static void findLotWithMostFailures(Map<String, List<Failure>> lotFailures) {
        Map.Entry<String, Integer> maxFailureLot = lotFailures.entrySet().stream()
                .max(Comparator.comparingInt(entry -> entry.getValue().stream().mapToInt(Failure::getQuantity).sum()))
                .map(entry -> new AbstractMap.SimpleEntry<>(entry.getKey(), entry.getValue().stream().mapToInt(Failure::getQuantity).sum()))
                .orElse(null);

        if (maxFailureLot != null) {
            System.out.println("\nLote con Mayor Incidencia de Fallos:");
            String lot = maxFailureLot.getKey();
            String failureType = lotFailures.get(lot).stream().max(Comparator.comparingInt(Failure::getQuantity)).get().getType();
            System.out.println("Lote: " + lot + " | Tipo de Fallo: " + failureType);
        }
    }

    private static void evaluateAverageApprovalByInspectionType(Map<String, List<Inspection>> lotInspections) {
        System.out.println("\nAprobación Promedio por Tipo de Inspección:");
        lotInspections.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Inspection::getType, Collectors.averagingInt(Inspection::getApprovalPercentage)))
                .forEach((type, avg) -> System.out.println(type + " - Promedio: " + avg + "%"));
    }

    private static void identifyCriticalFailures(Map<String, List<Inspection>> lotInspections, Map<String, List<Failure>> lotFailures) {
        System.out.println("\nLotes con Fallos Críticos en Inspecciones Clave (Seguridad):");
        lotInspections.forEach((lot, inspections) -> {
            inspections.stream()
                    .filter(i -> i.getType().equals("seguridad") && i.getApprovalPercentage() < 75)
                    .forEach(i -> {
                        lotFailures.getOrDefault(lot, Collections.emptyList())
                                .forEach(f -> System.out.println(lot + " - Tipo de Fallo: " + f.getType() + " | Aprobación de Seguridad: " + i.getApprovalPercentage() + "%"));
                    });
        });
    }

    private static void simulateProcessImprovement(Map<String, List<Inspection>> lotInspections, Map<String, Integer> productComplexity) {
        System.out.println("\nSimulación de Mejora de Procesos (Aumento de 5% en Aprobación de Lotes con Complejidad Mayor a 7):");
        lotInspections.forEach((lot, inspections) -> {
            if (productComplexity.get(lot) > 7) {
                inspections.forEach(i -> System.out.println(lot + " - Tipo de Inspección: " + i.getType() + " | Aprobación Original: " + i.getApprovalPercentage() + "% | Aprobación Mejorada: " + (int) (i.getApprovalPercentage() * 1.05) + "%"));
            }
        });
    }
}

class Inspection {
    private String type;
    private int approvalPercentage;

    public Inspection(String type, int approvalPercentage) {
        this.type = type;
        this.approvalPercentage = approvalPercentage;
    }

    public String getType() {
        return type;
    }

    public int getApprovalPercentage() {
        return approvalPercentage;
    }
}

class Failure {
    private String type;
    private int quantity;

    public Failure(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
}
