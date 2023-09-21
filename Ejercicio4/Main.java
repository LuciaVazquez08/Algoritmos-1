package Ejercicio4;
import entrada.EntradaConsola;
import salida.SalidaConsola;

public class Main {
    public static void main(String[] args) {
        // Solicitar al usuario la cantidad de entradas que desea ingresar
        SalidaConsola.mostrar("Ingrese el número de entradas que desea: ");
        EntradaConsola.main(new String[]{SalidaConsola.leerEntrada()});
    }
}