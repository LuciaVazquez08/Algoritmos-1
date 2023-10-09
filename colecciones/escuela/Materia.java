package colecciones.escuela;

import java.util.Objects;

public class Materia {
    protected String nombre; 
    protected int codigo;
    protected boolean estado;

    public Materia(String nombre, int codigo, boolean estado){
        this.nombre = nombre;
        this.codigo = codigo;
        this.estado = estado;
    }  
    
    @Override
    public boolean equals(Object other){
        if (this == other) {
            return true;
        }
    
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        return this.codigo == ((Materia) other).codigo;    
    } 

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
