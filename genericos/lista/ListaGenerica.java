package genericos.lista;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;

public class ListaGenerica<E> extends AbstractList<E>{
    private static final int insize = 10;
    private E[] elementos;
    private int size;

    public ListaGenerica() {
        E[] elementos = new E[insize];
        size = 0;
    }

    @Override
    //public E set(int index, E element) {
        //elementos[index] = element;
    //}
    
    @Override
    public void add(int index, E element){
        if (size == elementos.length) {
            int nuevaCapacidad = elementos.length * 2;
            elementos = Arrays.copyOf(elementos, nuevaCapacidad);
        }
        System.arraycopy(elementos, index, elementos, index + 1, size - index);
        elementos[index] = element;
        size++;
    }
    
    @Override
    public E remove(int index) {
        E elementoRemovido = (E) elementos[index];
        int elementosParaMover = size - index - 1;
        if (elementosParaMover > 0) {
            System.arraycopy(elementos, index + 1, elementos, index, elementosParaMover);
        }
        elementos[size - 1] = null; 
        size--;
        return elementoRemovido;
    }
    
    // se agregan como metodos porqeu sino se rompe todo
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return (E) elementos[index];
    }
    
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    

   
}
