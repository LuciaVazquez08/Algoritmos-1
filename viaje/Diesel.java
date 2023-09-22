package viaje;

public class Diesel extends Viaje{
    @Override
    public double tiempoDemora() {
        return (((trayecto.getDistancia() * trayecto.getEstaciones()) /2 ) + ((trayecto.getEstaciones() + this.cantMaxPasajeros)/10));
    }   
}
