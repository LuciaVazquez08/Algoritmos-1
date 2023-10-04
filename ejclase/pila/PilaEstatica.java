import java.util.Arrays;

public class PilaEstatica implements Pila<Integer> {
    private static final int AUMENTO_CAPACIDAD = 5;
    private Integer[] elementos;
    private int tamaño;       // tamaño de la pila

    public PilaEstatica() {
        this(10);
    }

    public PilaEstatica(int capacidad) {
        elementos = new Integer[capacidad];
        tamaño = 0;
    }

    @Override
    public boolean esVacia() {
        // return elementos[0] == null;
        return tamaño == 0;
    }

    @Override
    public void apilar(Integer elemento) {
        // int indice = 0;
        // while(indice < elementos.length && elementos[indice] != null) {
        //     indice++;
        // }
        // if (indice < elementos.length) 
        //     elementos[indice] = elemento;
        if (estaLlena()) {
            // throw new RuntimeException("Pila llena");
            elementos = Arrays.copyOf(elementos, tamaño + AUMENTO_CAPACIDAD);
        }
        elementos[tamaño++] = elemento;
    }

    // private int ultimoIndice() {
    //     int indice = elementos.length - 1;
    //     while(indice >= 0 && elementos[indice] == null) {
    //         indice--;
    //     }
    //     if (indice < 0) {
    //         throw new RuntimeException("Pila vacia");
    //     }
    //     return indice;
    // }

    @Override
    public Integer tope() {
        // return elementos[ultimoIndice()];
        if (esVacia()) {
            throw new RuntimeException("Pila vacia");
        }
        return elementos[tamaño-1];
    }

    @Override
    public Integer desapilar() {
        Integer tope = tope();
        // elementos[ultimoIndice()] = null;
        tamaño--;
        if (tamaño < elementos.length / 2) {
            elementos = Arrays.copyOf(elementos, tamaño + AUMENTO_CAPACIDAD);
        }
        return tope;
    }

    public Integer[] getElementos() {
        return elementos;
    }

    public boolean estaLlena() {
        return tamaño >= elementos.length;
    }

    public static void main(String[] args) {
        PilaEstatica p = new PilaEstatica(4);
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
        for (Integer elemento : p.getElementos()) {
            System.out.println(elemento);
            p.desapilar();
        }
        System.out.println(p.toString());
        System.out.println(p.tope());
    }
}
