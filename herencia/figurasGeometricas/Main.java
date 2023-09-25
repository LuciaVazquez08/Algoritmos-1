package figurasGeometricas;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo("ladrillo", 4.6, 5);
        Circulo circulo = new Circulo("pizza", 3);

        System.out.println("Área del " + rectangulo.nombre + ": " + rectangulo.calcularArea());
        System.out.println("Área del " + circulo.nombre + ": " + circulo.calcularArea());
    }
}
