package Ejercicio1;

public class Libro {
    //atributos
    String titulo;
    String autor;
    int añoPublicacion;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = LocalDate.now().getYear();

    }    
}
