package Igualdad.cloneable;

import java.util.Objects;

public class Persona implements Cloneable {
    private String nombre;
    private int edad;
    private Documento documento;

    private Persona() {}

    public Persona(String nombre, int edad, int nroDocumento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = new Documento(nroDocumento);
    }

    // Constructor de copia
    public Persona(Persona otraPersona) {
        this.nombre = otraPersona.nombre;
        this.edad = otraPersona.edad;
        // Se crea una nueva instancia de Documento usando el constructor de copia
        this.documento = new Documento(otraPersona.documento);
    }

    // Método de construcción de copia
    public Persona clonar() {
        // Se crea una nueva instancia de Persona usando el constructor de copia
        return new Persona(this);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        // if (!super.equals(other)) return false;

        Persona that = (Persona) other;

        return this.nombre.equals(that.nombre) && this.documento.equals(that.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, documento);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNroDocumento(int nroDocumento) {
        this.documento.setNumero(nroDocumento);
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.edad + ", " + this.documento.getNumero();
    }

    @Override
    public Persona clone() {
        try {
            Persona copia = (Persona) super.clone();    // Copia superficial de persona
            copia.documento = this.documento.clone();   // Copia profunda de Documento
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Persona copiaSuperficial() {
        Persona copia = new Persona();
        copia.nombre = this.nombre;
        copia.edad = this.edad;
        copia.documento = this.documento;   // Se asigna la misma referencia original
        return copia;
    }

    
}