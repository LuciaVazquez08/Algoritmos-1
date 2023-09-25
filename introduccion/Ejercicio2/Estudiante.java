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
    private static int estudiantesTotales = 0;

    public Estudiante(String nombre, int nacimiento) {
        this.nombre = nombre;
        this.edad = calcularEdad(nacimiento);
    }
    
    public Estudiante(String nombre, int nacimiento, String carrera, String[] materias) {
        this.nombre = nombre;
        this.edad = calcularEdad(nacimiento);
        this.carrera = carrera; 
        this.materias = materias;
    }
    
    public Estudiante(String nombre, int nacimiento, String carrera) {
        this.nombre = nombre;
        this.edad = calcularEdad(nacimiento);
        this.carrera = carrera; 
        this.materias = new String[0];
    }

    @Override
    public String toString() {
        String materiasStr = Arrays.toString(materias);
        return "Nombre: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera + ", Materias:" + materiasStr;
    }

    private static int calcularEdad(int nacimiento) {
            int ahora = LocalDate.now().getYear();
            return ahora - nacimiento;
        }
    
    public void presentarse(){
        System.out.println("Hola, soy" + nombre + ", tengo" + edad + " años");
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

    public static int getEstudiantesTotales() {
        return estudiantesTotales;
    }
    
    public static Estudiante agregarEstudiante(String nombre, int nacimiento) {
        estudiantesTotales += 1;
        return new Estudiante(nombre, nacimiento);
    }


    /* public static void main(String[] args) {
        Estudiante Lucia = new Estudiante("Lucia Vazquez", 2003, "LCD", new String[]{"algo1", "proba", "infra"});
        Estudiante Victoria = new Estudiante("Victoria Vazquez", 2005, "LBT", new String[]{"bio1", "quimica"});
        System.out.println(Victoria);
        System.out.println(Lucia);
        Lucia.dejarCarrera();
        Victoria.dejarMateria("bio1");
        System.out.println(Lucia);
        System.out.println(Victoria);
    } */

    public static void main(String[] args) {
        Estudiante Lucia = agregarEstudiante("Lucia Vazquez", 2003);
        Estudiante Victoria = agregarEstudiante("Victoria Vazquez", 2005);
        System.out.println(Victoria);
        System.out.println(Lucia);
        System.out.println(estudiantesTotales);
    }
}
