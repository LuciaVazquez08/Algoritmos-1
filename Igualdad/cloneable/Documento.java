package Igualdad.cloneable;

import java.util.Objects;

public class Documento implements Cloneable {
    private int numero;

    public Documento(int numero) {
        this.numero = numero;
    }

    // Constructor de copia
    public Documento(Documento otroDocumento) {
        this.numero = otroDocumento.numero;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        //if (!super.equals(other)) return false;

        Documento that = (Documento) other;

        return this.numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numero);
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public Documento clone() {
        try {
            return (Documento) super.clone();   // Copia superficial de Documento
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}