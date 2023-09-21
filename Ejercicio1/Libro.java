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
}