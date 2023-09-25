package figurasGeometricas;

public class Rectangulo extends Figura {
    protected double base;
    protected double altura;
    
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre); 
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
