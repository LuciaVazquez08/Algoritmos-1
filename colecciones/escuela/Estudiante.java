package colecciones.escuela;

import java.util.Objects;

public class Estudiante {
    private String nombre;
    private int matricula;
    private int edad;
    private HistoriaAcademica historia;

    @Override
    public boolean equals(Object other){
        if (this == other) {
            return true;
        }
    
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        return this.matricula == ((Estudiante) other).matricula;    
    } 

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
