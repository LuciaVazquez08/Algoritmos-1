package busqueda;

import java.util.List;

public class BusquedaBinariaGenerica {
    public static <T extends Comparable<T>> int busquedaBinaria(List<T> lista, T elemento) {
        int inicio = 0;
        int fin = lista.size() - 1;
    
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            T elemMedio = lista.get(medio);
    
            if (elemMedio.equals(elemento)) {
                return medio;   
            }
    
            if ((elemMedio.compareTo(elemento)) > 0) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return -1;              
    }
}
