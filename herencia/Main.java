import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehiculo[] vehiculos = new Vehiculo[2];
        vehiculos[0] = new Moto();      // Upcasting implícito
        vehiculos[1] = new Auto();      // Upcasting implícito
        
        for (Vehiculo vehiculo : vehiculos) {
            System.out.print("Ingrese la velocidad a la cual llegar: ");
            int velocidad = scanner.nextInt();
            vehiculo.acelerar(velocidad);
            if (vehiculo instanceof Auto) {
                Auto auto = (Auto) vehiculo;
                auto.subirVentanas();
            }
        }
    }
}