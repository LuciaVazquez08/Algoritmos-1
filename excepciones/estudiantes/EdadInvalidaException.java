package excepciones.estudiantes;

public class EdadInvalidaException extends Exception{
    public EdadInvalidaException(){
        super("La edad del estudiante es inválida.");
    }
}
