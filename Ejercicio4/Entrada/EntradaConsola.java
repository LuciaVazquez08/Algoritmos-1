package Ejercicio4.Entrada;

import java.util.Scanner;

public class EntradaConsola {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Por favor, ingrese un número entero como argumento.");
        }

        int entrada = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese " + entrada + " entradas de texto");

        for (int i = 0; i < entrada; i++) {
            String laentrada = scanner.nextLine();
            System.out.println("Entrada " + (i + 1) + ": " + laentrada);
        }

        scanner.close();
    }
    
}
