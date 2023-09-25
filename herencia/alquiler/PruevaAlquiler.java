package alquiler;

public class PruevaAlquiler {
    public static void main(String[] args) {
        Auto fitito = new Auto("WV", "FITITO", 250);
        Moto butaquera = new Moto("kawasaki", "", 160);

        System.out.println(fitito.calcularCostoAlquiler(10));
        System.out.println(butaquera.calcularCostoAlquiler(10));
    }    
}
