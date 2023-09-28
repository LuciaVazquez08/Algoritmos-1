package polimorfismo.calculadora;

public class PruebaCalculadoraAvanzada {
    public static void main(String[] args) {
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();

        int a = 10;
        int b = 5;
        double x = 7.5;
        double y = 2.0;

        int sumaInt = calculadora.sumar(a, b);
        double sumaDouble = calculadora.sumar(x, y);
        int restaInt = calculadora.restar(a, b);
        double restaDouble = calculadora.restar(x, y);
        int multiplicacionInt = calculadora.multiplicar(a, b);
        double multiplicacionDouble = calculadora.multiplicar(x, y);
        int divisionInt = calculadora.dividir(a, b);
        double divisionDouble = calculadora.dividir(x, y);

        System.out.println("Operaciones matemáticas:");
        System.out.println(a + " + " + b + " = " + sumaInt);
        System.out.println(x + " + " + y + " = " + sumaDouble);
        System.out.println(a + " - " + b + " = " + restaInt);
        System.out.println(x + " - " + y + " = " + restaDouble);
        System.out.println(a + " * " + b + " = " + multiplicacionInt);
        System.out.println(x + " * " + y + " = " + multiplicacionDouble);

        System.out.println("Operaciones de división:");
        System.out.println(a + " / " + b + " = " + divisionInt);
        System.out.println(x + " / " + y + " = " + divisionDouble);
    }
}