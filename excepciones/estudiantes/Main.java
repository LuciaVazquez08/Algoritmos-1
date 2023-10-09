package excepciones.estudiantes;

public class Main {
    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes();
        for (int i = 1; i <= 6; i++) {
            registro.addEstudiante();
        }
    }
}