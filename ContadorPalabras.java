import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingrese un separador: ");
        String separadorInput = scanner.nextLine();

        char separador = separadorInput.isEmpty() ? ' ' : separadorInput.charAt(0);

        String[] palabras = frase.split(String.valueOf(separador));

        int cantidadPalabras = palabras.length;

        System.out.println("Cantidad de palabras: " + cantidadPalabras);

        scanner.close();
    }    
}
