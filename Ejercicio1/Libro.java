package Ejercicio1;
import java.time.LocalDate;

public class Libro {
    // Atributos
    String titulo;
    String autor;
    int publicacion; 

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = LocalDate.now().getYear();
    }

    public Libro(String titulo, String autor, int publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
    }

    public static void main(String[] args) {
        Libro FW = new Libro("Fourth Wing", "Rebecca Yarros");
        Libro BL = new Libro("Book Lover", "Emily Henry", 2022);

        System.out.println("Titulo:" + FW.titulo);
        System.out.println("Autor:" + FW.autor);
        System.out.println("Año de Publicacion:" + FW.publicacion);

        System.out.println("Titulo:" + BL.titulo);
        System.out.println("Autor:" + BL.autor);
        System.out.println("Año de Publicacion:" + BL.publicacion);
    }
}