/*  Samuel Rivera | Dev Senior
    Descripción de la actividad: 
    Sistema de gestión estudiantes
*/

package Modulo2.Clase01;

public class Student {
    private String name;
    private int age;
    private float[] grades;
    private float grade;

    public Student(String name, int age, float[] grades) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (age < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        if (grades == null || grades.length != 3) {
            throw new IllegalArgumentException("Debe proporcionar exactamente tres notas");
        }
        for (float g : grades) {
            if (g < 0.0 || g > 5.0) {
                throw new IllegalArgumentException("Cada nota debe estar entre 0.0 y 5.0");
            }
        }
        this.name = name;
        this.age = age;
        this.grades = grades;
        this.grade = calculateAverage(grades);
    }

    private float calculateAverage(float[] grades) {
        float sum = 0;
        for (float g : grades) {
            sum += g;
        }
        return sum / grades.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGrade() {
        return grade;
    }

    public float[] getGrades() {
        return grades;
    }

    public void setGrades(float[] grades) {
        this.grades = grades;
        this.grade = calculateAverage(grades);
    }

    public void showDetails(){
        System.out.println("\nINFORMACIÓN DEL ESTUDIANTE\n");   
        System.out.printf("- Nombre: %s%n", name);
        System.out.printf("- Edad: %d%n", age);
        System.out.printf("- Notas: %.2f, %.2f, %.2f%n", grades[0], grades[1], grades[2]);
        System.out.printf("- Promedio: %.2f%n", grade);
        System.out.println("- Estado: " + (isApproved() ? "Aprobado" : "Reprobado"));
    }

    public boolean isApproved() {
        return grade >= 3.0;
    }
}
