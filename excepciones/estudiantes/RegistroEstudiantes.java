package excepciones.estudiantes;

import java.util.Arrays;
import java.util.Scanner;

public class RegistroEstudiantes {
    private Object[] elementos;
    private int size;

    public RegistroEstudiantes(){
        size = 0;
        elementos = new Object[size];
    }

    public void setEstudiante(Estudiante estudiante){
        size++;
        Object[] newelementos = Arrays.copyOf(elementos,size);
        elementos[size-1] = estudiante;
        elementos = newelementos;

    }

    public void addEstudiante(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese el nombre del estudiante:");
            String nombre = scanner.nextLine();
            if (nombre == null || nombre.isEmpty() || !(nombre  instanceof String)) {
                throw new NombreInvalidoException();
            }
            System.out.println("Ingrese la edad del estudiante:");
            int edad = scanner.nextInt();
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException();
            }
            System.out.println("Ingrese el promedio del estudiante:");
            double promedio = scanner.nextDouble();
            if (promedio < 0.0 || promedio > 10.0) {
                throw new PromedioInvalidoException();
            }
            Estudiante estudiante = new Estudiante(nombre, edad, promedio);
            setEstudiante(estudiante);

        } catch (NombreInvalidoException | EdadInvalidaException | PromedioInvalidoException e) {
            System.err.println("Error: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }
}
