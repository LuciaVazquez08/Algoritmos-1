import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args) {
        int sumatot = 0;
        int i = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero:");
        int numerofin = scanner.nextInt();

        if (numerofin > 0) {
            while (i <= numerofin) {
            if ( i % 2 == 0) {
                sumatot += i;
            }
            i++;
        }
        System.out.println(sumatot);
        scanner.close();
        } else {
            System.out.println("Ingrese un numero positivo");
        }
    } 
}
