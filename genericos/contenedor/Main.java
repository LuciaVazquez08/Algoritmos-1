package genericos.contenedor;

public class Main {
    public static void main(String[] args) {
        Contenedor<String> contenedor = new Contenedor<>();
        contenedor.agregarElemento("Hola");
        System.out.println("Contenido del contenedor: " + contenedor.obtenerElemento());
        System.out.println("¿Es igual ..." + contenedor.esIgualA("Hola, mundo!"));
        contenedor.quitarElemento();
        System.out.println("El contenedor está vacío? " + contenedor.estaVacio());
    }
}
