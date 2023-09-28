package polimorfismo.calculadora;

public class CalculadoraAvanzada {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a-b;
    }

    public double restar(double a, double b) {
        return a-b;
    }

    public int multiplicar(int a, int b) {
        return a*b;
    }

    public double multiplicar(double a, double b) {
        return a * b ;
    }

    public int dividir(int a, int b) {
        if (b != 0) {
            return a / b ;
        } else {
            System.out.println("No se puede dividir por cero");
            return a;
        }
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b ;
        } else {
            System.out.println("No se puede dividir por cero");
            return a;
        }
    }
}
