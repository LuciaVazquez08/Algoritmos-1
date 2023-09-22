package viaje;

public class Diesel extends Viaje{
    public Diesel(Trayecto trayecto, int cantVagones, int cantMaxPasajeros) {
        super(trayecto, cantVagones, cantMaxPasajeros);
    }
    @Override
    public double tiempoDemora() {
        return (((trayecto.getDistancia() * trayecto.getEstaciones()) /2 ) + ((trayecto.getEstaciones() + this.cantMaxPasajeros)/10));
    }   
}
