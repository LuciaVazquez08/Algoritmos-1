public interface Pila<T> {
    void apilar(T e);
    T desapilar();
    T tope();
    boolean esVacia();
}
