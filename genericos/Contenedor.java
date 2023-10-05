package genericos;

public class Contenedor<T> {
    protected T elemento;

    public Contenedor() {
        this.elemento = null;
    }

    public void agregarElemento(T elemento) {
        this.elemento = elemento;
    }

    public void quitarElemento() {
        this.elemento = null;
    }
    
    public boolean estaVacio() {
        return this.elemento == null;
    }

    public T obtenerElemento() {
        return this.elemento;
    }
    
    public boolean esIgualA(T otroElemento) {
        if (this.elemento == null) {
            return otroElemento == null;
        } else {
            return this.elemento.equals(otroElemento);
        }
    }
}
