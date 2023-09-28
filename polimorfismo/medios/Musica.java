package polimorfismo.medios;

public class Musica extends Medios{
    private String titulo;
    private String artista;


    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }


    @Override
    public void reproducir() {
        System.out.println("Reproduciendo música: " + titulo + " de " + artista);
    }

}
