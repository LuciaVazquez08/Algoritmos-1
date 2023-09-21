package Ejercicio3;

import java.util.Arrays;

public class Rectangulo {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Largo:" + this.largo + ", Ancho:" + this.ancho + ", Area" + area() + ",Perimetro:" + perimetro();
        }


    public double area(){
        return largo * ancho;
    }
    
    public double perimetro(){
        return 2 * (ancho + largo);
    }
    
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo(2.0 , 5.0);
        Rectangulo rect2 = new Rectangulo(3.5, 4.0);
        System.out.println("Rectángulo 1: " + rect1);
        System.out.println("Rectángulo 2: " + rect2);
    }

}

