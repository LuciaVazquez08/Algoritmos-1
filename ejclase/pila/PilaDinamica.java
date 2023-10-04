import java.util.ArrayList;
import java.util.List;

public class PilaDinamica<T> implements Pila<T> {
    private List<T> elementos;

    public PilaDinamica() {
        elementos = new ArrayList<>();
    }

    @Override
    public boolean esVacia() {
        return elementos.isEmpty();
    }

    @Override
    public void apilar(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public T tope() {
        if (esVacia()) {
            throw new RuntimeException("Pila vacia");
        }
        return elementos.get(elementos.size()-1);
    }

    @Override
    public T desapilar() {
        return elementos.remove(elementos.size()-1);
    }

    public static void main(String[] args) {
        Pila<Integer> p = new PilaDinamica<>();
        
        // Upper bounded wildcard: solo podemos "leer" de p2
        // p es subtipo de p2
        Pila<? extends Number> p2 = new PilaDinamica<Integer>();
        p2 = p;

        // Lower bounded wildcard: solo podemos "escribir" en p3 (o leer Object)
        // p4 es subtipo de p3
        Pila<? super Integer> p3;
        Pila<Number> p4 = new PilaDinamica<>();
        p3 = p4;
        // Unbounded wildcard: solo podemos "leer" de p5 si tratamos como Object
        // p5 es supertipo de p*
        Pila<?> p5;
        p5 = p3;
        
        p.apilar(1);
        p.apilar(2);
        p.apilar(3);
        p.apilar(4);
        p.apilar(5);
        p.apilar(1);
        p.apilar(2);
        p.apilar(3);
        p.apilar(4);
        p.apilar(1);
        p.apilar(2);
        p.apilar(3);
        p.apilar(4);
        System.out.println(p.desapilar());
        System.out.println(p.toString());
        System.out.println(p.tope());
    }
}
