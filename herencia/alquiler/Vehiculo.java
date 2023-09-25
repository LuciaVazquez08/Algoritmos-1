package alquiler;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double precioBase;

    public Vehiculo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public double calcularCostoAlquiler(int cantdias) {
        return precioBase * cantdias;
    }
    
}
