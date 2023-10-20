package busqueda;

public class BusquedaLinealGenerica<T> {
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        return true;
    }

    public int busquedaLineal(T[] arreglo, T elemento){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}
