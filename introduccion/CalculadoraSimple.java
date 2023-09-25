import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        int result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int n1 = scanner.nextInt();

        System.out.print("Ingrese el operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Ingrese el segundo número: ");
        int n2 = scanner.nextInt();

        switch (operador) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("Error: No se puede dividir por cero."); 
                }
                break;
            default:
                System.out.println("Operador no válido.");
        }

        System.out.println(result);

        scanner.close();

    }    
}
