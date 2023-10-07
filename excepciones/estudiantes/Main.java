package excepciones.estudiantes;

public class Main {
    public static void main(String[] args) {
        RegistoEstudiantes registro = new RegistoEstudiantes();
        for (int i = 1; i<7; i++) {
            registro.addEstudainte();
        }
}
}
