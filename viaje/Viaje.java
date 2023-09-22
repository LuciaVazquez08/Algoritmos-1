package viaje;

abstract public class Viaje {
    protected Trayecto trayecto;
    protected int cantVagones;
    protected int cantMaxPasajeros;

    public Viaje(Trayecto trayecto, int cantVagones, int cantMaxPasajeros){
        this.trayecto = trayecto;
        this.cantVagones = cantVagones;
        this.cantMaxPasajeros = cantMaxPasajeros;  
    }

    abstract public double tiempoDemora();
}