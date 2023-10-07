package genericos.lista;

import java.util.AbstractList;
import java.util.Arrays;


public class ListaGenerica<E> extends AbstractList<E>{
    private static final int CAPACIDAD_INICIAL = 10;
    private Object[] elementos;
    private int size;

    public ListaGenerica() {
        elementos = new Object[CAPACIDAD_INICIAL];
        size = 0;
    }

    @Override
    public E set(int index, E element) {
        elementos[index] = element;
        return element;
    }
    
    @Override
    public boolean add(E element){
        if (size == elementos.length) {
            int nuevaCapacidad = elementos.length * 2;
            elementos = Arrays.copyOf(elementos, nuevaCapacidad);
        }
        set(size, element);
        size++;
        return true;
    }

    @Override
    public void add(int index, E element){
        set(index, element);
        size++;
    }
    
    @Override
    public E remove(int index) {
        E elementoRemovido = get(index);
        int i = 0;
        boolean encontrado = false;
        while (i < size - 1) {
            if (encontrado || index == i) {
                encontrado = true;
                elementos[i] = elementos[i + 1];
            }
            i++;
        }
        if (encontrado || index == size - 1) {
            elementos[i] = null;
            size--;
        }
        return elementoRemovido;
    }
    
    // se agregan como metodos porque sino se rompe todo
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        return (E) elementos[index];
    }
    
    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ListaGenerica<Integer> lista = new ListaGenerica<>();
        lista.add(1);
        lista.add(2);
        lista.add(2, 3);
        lista.set(0, 10);
        lista.remove(0);
        for(int i : lista) {
            System.out.println(i);
        }
    }

   

    

   
}
