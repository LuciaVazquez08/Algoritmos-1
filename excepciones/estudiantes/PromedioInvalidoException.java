package excepciones.estudiantes;

public class PromedioInvalidoException extends Exception{
    public PromedioInvalidoException(){
        super("El promedio del estudiante es inválido.");
    }

}
