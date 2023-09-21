package Ejercicio2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private String[] materias;
    private int nacimiento;

    public Estudiante(String nombre, int nacimiento, String carrera, String[] materias) {
        this.nombre = nombre;
        this.edad = calcularEdad(nacimiento);
        this.carrera = carrera; 
        this.materias = materias;
    }
    @Override
    public String toString() {
        String materiasStr = Arrays.toString(materias);
        return "Nombre: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera + ", Materias:" + materiasStr;
    }

    public Estudiante(String nombre, int nacimiento, String carrera) {
        this.nombre = nombre;
        this.edad = calcularEdad(nacimiento);
        this.carrera = carrera; 
        this.materias = new String[0];
    }
    
    private int calcularEdad(int nacimiento) {
            int ahora = LocalDate.now().getYear();
            return ahora - nacimiento;
        }
    
    public void dejarCarrera() {
        this.carrera = "";
        for (String materia: materias) {
            dejarMateria(materia);
        }
        }
    
    
    public void dejarMateria(String materia) {
        if (materias != null && materias.length >0 ) {
            List<String> nuevo = new ArrayList<>(Arrays.asList(materias));
            nuevo.remove(materia);
            this.materias = nuevo.toArray(new String[0]);
        }
    }

    public static void main(String[] args) {
        Estudiante Lucia = new Estudiante("Lucia Vazquez", 2003, "LCD", new String[]{"algo1", "proba", "infra"});
        Estudiante Victoria = new Estudiante("Victoria Vazquez", 2005, "LBT", new String[]{"bio1", "quimica"});
        System.out.println(Victoria);
        System.out.println(Lucia);
        Lucia.dejarCarrera();
        Victoria.dejarMateria("bio1");
        System.out.println(Lucia);
        System.out.println(Victoria);

    }
}
