package alquiler;

public class Auto extends Vehiculo{
    
    public Auto(String marca, String modelo, double precioBase)  {
        super(marca, modelo, precioBase);
    } 

    @Override
    public double calcularCostoAlquiler(int cantdias) {
        return (precioBase * cantdias) * 1.2;
    }
}
