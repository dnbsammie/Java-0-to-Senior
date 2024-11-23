/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Analisis de calificaciones de estudiantes
*/
package Clase06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ejercicio2 {
      public static void main(String[] args) {
        List<String> grades = Arrays.asList(
            "Juan,Matematicas,85",
            "Ana,Historia,90",
            "Pedro,Matematicas,70",
            "Juan,Historia,75",
            "Ana,Matematicas,95",
            "Pedro,Historia,80"
        );

        Map<String, Double> studentAverage = calculateStudentAverage(grades);
        System.out.println("Promedio de calificaciones por estudiante:");
        for (Map.Entry<String, Double> entry : studentAverage.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<String, Integer> studentsPerSubject = countStudentsBySubject(grades);
        System.out.println("\nEstudiantes por materia:");
        for (Map.Entry<String, Integer> entry : studentsPerSubject.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        double threshold = 80.0;
        System.out.println("\nCalificaciones mayores a " + threshold + ":");
        filterGradesAboveThreshold(grades, threshold);

        String subjectWithHighestAverage = getSubjectWithHighestAverage(grades);
        System.out.println("\nMateria con el promedio más alto: " + subjectWithHighestAverage);
    }

    public static Map<String, Double> calculateStudentAverage(List<String> grades) {
        Map<String, List<Integer>> studentGrades = new HashMap<>();
        for (String grade : grades) {
            String[] parts = grade.split(",");
            String student = parts[0];
            int gradeValue = Integer.parseInt(parts[2]);

            studentGrades.putIfAbsent(student, new ArrayList<>());
            studentGrades.get(student).add(gradeValue);
        }

        Map<String, Double> studentAverage = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : studentGrades.entrySet()) {
            String student = entry.getKey();
            List<Integer> gradesList = entry.getValue();
            double average = gradesList.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            studentAverage.put(student, average);
        }

        return studentAverage;
    }

    public static Map<String, Integer> countStudentsBySubject(List<String> grades) {
        Map<String, Set<String>> subjectStudents = new HashMap<>();
        for (String grade : grades) {
            String[] parts = grade.split(",");
            String student = parts[0];
            String subject = parts[1];

            subjectStudents.putIfAbsent(subject, new HashSet<>());
            subjectStudents.get(subject).add(student);
        }

        Map<String, Integer> studentsPerSubject = new HashMap<>();
        for (Map.Entry<String, Set<String>> entry : subjectStudents.entrySet()) {
            studentsPerSubject.put(entry.getKey(), entry.getValue().size());
        }

        return studentsPerSubject;
    }

    public static void filterGradesAboveThreshold(List<String> grades, double threshold) {
        for (String grade : grades) {
            String[] parts = grade.split(",");
            int gradeValue = Integer.parseInt(parts[2]);
            if (gradeValue > threshold) {
                System.out.println(grade);
            }
        }
    }

    public static String getSubjectWithHighestAverage(List<String> grades) {
        Map<String, List<Integer>> subjectGrades = new HashMap<>();
        for (String grade : grades) {
            String[] parts = grade.split(",");
            String subject = parts[1];
            int gradeValue = Integer.parseInt(parts[2]);

            subjectGrades.putIfAbsent(subject, new ArrayList<>());
            subjectGrades.get(subject).add(gradeValue);
        }

        String bestSubject = null;
        double highestAverage = 0.0;

        for (Map.Entry<String, List<Integer>> entry : subjectGrades.entrySet()) {
            String subject = entry.getKey();
            List<Integer> gradesList = entry.getValue();
            double average = gradesList.stream().mapToInt(Integer::intValue).average().orElse(0.0);

            if (average > highestAverage) {
                highestAverage = average;
                bestSubject = subject;
            }
        }

        return bestSubject;
    }
}
