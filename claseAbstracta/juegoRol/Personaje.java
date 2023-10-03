package claseAbstracta.juegoRol;

public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosVida;   
    
    public Personaje(String nombre, int nivel, int puntosVida){
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public abstract void atacar(Personaje other);

    public abstract void defender();

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de Vida: " + puntosVida);
    }
}
