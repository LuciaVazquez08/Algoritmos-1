package genericos.lista;

public class ListaVaciaException extends Exception{
    public ListaVaciaException(){
        super("La lista ya esta vacia");
    }

}
