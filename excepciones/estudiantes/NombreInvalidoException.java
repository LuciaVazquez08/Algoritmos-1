package excepciones.estudiantes;

public class NombreInvalidoException extends Exception{
    public NombreInvalidoException(){
        super("El nombre del estudiante es inválido.");
    }    
}
