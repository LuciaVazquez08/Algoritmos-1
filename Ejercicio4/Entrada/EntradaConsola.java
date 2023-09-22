package Ejercicio4.entrada;
import java.util.Scanner;
import Ejercicio4.salida.SalidaConsola;


public class EntradaConsola {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Por favor, ingrese un número entero como argumento.");
        }
        int entrada = Integer.parseInt(args[0]);
        SalidaConsola.mostrar("Por favor ingrese " + entrada + " entradas de texto");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < entrada; i++) {
            String laentrada = scanner.nextLine();
            SalidaConsola.mostrar("Entrada " + (i + 1) + ": " + laentrada);
        }

        scanner.close();
    }
    
}
