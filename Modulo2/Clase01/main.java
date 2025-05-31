/*
 * Samuel Rivera | Dev Senior Descripción de la actividad: Sistema de gestión estudiantes
 */
package Modulo2.Clase01;

public class Main {
    public static void main(String[] args) {
        String[] studentList = {
            // @formatter:off
            "Selene,22,3.9,4.1,3.7",
            "Yasmin,21,2.6,2.9,2.8",
            "Maya,23,4.2,4.3,4.1",
            "Abel,24,3.0,3.2,2.9",
            "Marcos,20,2.8,2.6,2.7",
            "Bruno,22,3.7,3.8,3.9"
            // @formatter:on
        };
        for (String studentData : studentList) {
            String[] parts = studentData.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            float[] grades = new float[3];
            grades[0] = Float.parseFloat(parts[2]);
            grades[1] = Float.parseFloat(parts[3]);
            grades[2] = Float.parseFloat(parts[4]);
            Student student = new Student(name, age, grades);
            student.showDetails();
        }
    }
}