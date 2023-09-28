package Ejercicio4.Entrada;
import java.util.Scanner;
import Ejercicio4.salida.SalidaConsola;


public class EntradaConsola {
  public static void main(String[] args) {
    int count = Integer.parseInt(args[0]);
    Scanner myScanner = new Scanner(System.in);
    // SalidaConsola salida = new SalidaConsola();
    for (int i = 0; i < count; i++) {
      SalidaConsola.mostrar("Ingrese algo. Iteración número " + i + "\n");
      SalidaConsola.mostrar("Escribiste: " + myScanner.nextLine() + "\n");
      ////
    }
    myScanner.close();
  }  
    
}
