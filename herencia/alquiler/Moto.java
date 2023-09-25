package alquiler;

public class Moto extends Vehiculo{

    public Moto(String marca, String modelo, double precioBase)  {
        super(marca, modelo, precioBase);
    } 

    @Override
    public double calcularCostoAlquiler(int cantdias) {
        return (precioBase * cantdias) * 0.85;
    }

}
