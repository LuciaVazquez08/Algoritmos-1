package tpfinal;

import java.util.ArrayList;
import java.util.List;

public class Tabla<T> {
    protected List<List<T>> tabla;

    public Tabla(int cantfilas, int cantcolumnas) {
        tabla = new ArrayList<>(cantfilas);

        for (int i = 0; i < cantfilas; i++) {
            List<T> fila = new ArrayList<>(cantcolumnas);
            tabla.add(fila);

            for (int j = 0; j < cantcolumnas; j++) {
                fila.add(null); 
            }
        }
    }
}
