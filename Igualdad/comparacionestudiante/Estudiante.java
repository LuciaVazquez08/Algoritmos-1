package Igualdad.comparacionestudiante;

import java.util.Objects;

public class Estudiante {
    protected String nombre;
    protected int edad;
    protected int matricula;

    public Estudiante(String nombre, int edad, int matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Estudiante estudiante = (Estudiante) other;

        return matricula == estudiante.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
    
}
