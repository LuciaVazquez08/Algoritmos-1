package Igualdad.comparacionestudiante;

public class Main {
    public static void main(String[] args) {
        EstudianteGrado eg1 = new EstudianteGrado("Lucia", 20, 44792890, "LCD");
        EstudianteGrado eg2 = new EstudianteGrado("Victoria", 18, 46759226, "LBT");

        EstudiantePostgrado ep1 = new EstudiantePostgrado("Laura", 50, 35789425, "ECO");
        EstudiantePostgrado ep2 = new EstudiantePostgrado("Marcelo", 56, 33542183, "MAT");

        if (eg1.equals(eg2)) {
            System.out.println("Los estudiantes son iguales.");
        } else {
            System.out.println("Los estudiantes son diferentes.");
        }

         if (eg1.equals(ep2)) {
            System.out.println("Los estudiantes son iguales.");
        } else {
            System.out.println("Los estudiantes son diferentes.");
        }

        Estudiante estudiante5 = new Estudiante("Lorena",29,111);
        Estudiante estudiante6 = new Estudiante("Carlos", 32, 111);

        if (estudiante5.equals(estudiante6)) {
            System.out.println("Los estudiantes son iguales.");
        } else {
            System.out.println("Los estudiantes son diferentes.");
        }

        // Realizar una comparación de identidad (usando ==) de al menos dos objetos
        if (eg1 == eg2) {
            System.out.println("Los estudiantes son idénticos.");
        } else {
            System.out.println("Los estudiantes son diferentes.");
        }
 
    }
}
