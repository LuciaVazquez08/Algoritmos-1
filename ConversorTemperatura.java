import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la unidad de temperatura (C/F): ");
        String unidad = scanner.nextLine();

        System.out.print("Ingrese la temperatura: ");
        double tempinc = scanner.nextDouble();

        if (unidad.equals("C")) {
            double tempfin = (tempinc * 1.8) + 32;
            System.out.println(tempfin);
        } else if (unidad.equals("F")) {
            double tempfin = (tempinc - 32) / 1.8;
            System.out.println(tempfin);
        } else {
            System.out.println("Ingrese una unidad valida");
        }
        scanner.close();
    }
}
