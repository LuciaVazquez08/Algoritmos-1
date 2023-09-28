package Igualdad.comparacionestudiante;

import java.util.Objects;

public class EstudiantePostgrado extends Estudiante{
    protected String carreraPostgrado;

    public EstudiantePostgrado(String nombre, int edad, int matricula, String carreraPostgrado) {
        super(nombre,edad,matricula);
        this.carreraPostgrado = carreraPostgrado;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        if (!super.equals(other)) return false;

        EstudiantePostgrado that = (EstudiantePostgrado) other;

        return carreraPostgrado.equals(that.carreraPostgrado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carreraPostgrado);
    }
}
