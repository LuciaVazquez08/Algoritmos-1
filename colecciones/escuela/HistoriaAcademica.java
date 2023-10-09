package colecciones.escuela;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HistoriaAcademica {
    private Map<String, Set<Double>> historia_academica;
    
    public HistoriaAcademica(){
        historia_academica = new HashMap<>();
    }


    public double promedio(){
        double suma = 0;
        for (Set<Double> calificaciones : historia_academica.values()) {
            for (Double calificacion : calificaciones) {
                suma += calificacion;
            }
        }
        if (historia_academica.size() > 0) {
            return suma/historia_academica.size();
        } else {
            return 0.0;
        }
    }

    public int aplazos() {
        int cant = 0;
        for (Set<Double> calificaciones : historia_academica.values()) {
            for (Double calificacion : calificaciones) {
                if (calificacion < 2.0) {
                    cant++;
                }
            }
        }
        return cant;
    }

    public int cantidadMaterias(){
        return historia_academica.size();
    }
}

