package polimorfismo.medios;

public class Main {
    public static void main(String[] args) {
        Medios[] medios = new Medios[3];
        medios[0] = new Libro("El Gran Gatsby", "F. Scott Fitzgerald");
        medios[1] = new Pelicula("Pulp Fiction", "Quentin Tarantino");
        medios[2] = new Musica("Bohemian Rhapsody", "Queen");


        for (Medios medio : medios) {
            medio.reproducir();
        }
    }

}
