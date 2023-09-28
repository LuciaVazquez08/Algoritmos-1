package Igualdad.comparacionestudiante;

import java.util.Objects;

public class EstudianteGrado extends Estudiante{
    protected String carreraGrado;

    public EstudianteGrado(String nombre, int edad, int matricula, String carreraGrado) {
        super(nombre,edad,matricula);
        this.carreraGrado = carreraGrado;
    }
    
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        if (!super.equals(other)) return false;

        EstudianteGrado that = (EstudianteGrado) other;

        return carreraGrado.equals(that.carreraGrado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carreraGrado);
    }
}
