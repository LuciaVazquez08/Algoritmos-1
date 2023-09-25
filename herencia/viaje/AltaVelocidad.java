package viaje;

public class AltaVelocidad extends Viaje{
    public AltaVelocidad(Trayecto trayecto, int cantVagones, int cantMaxPasajeros) {
        super(trayecto, cantVagones, cantMaxPasajeros);
    }
    @Override
    public double tiempoDemora() {
        return ((trayecto.getDistancia() /10));
    }   
}
