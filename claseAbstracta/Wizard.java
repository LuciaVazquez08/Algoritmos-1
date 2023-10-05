package claseAbstracta;

public class Wizard extends Personaje implements AtaqueDistancia{

    public Wizard(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public void atacar(Personaje other) {
        other.puntosVida -= 3;
        System.out.println(nombre + " ataca");
    }

    @Override
    public void defender() {
        this.puntosVida += 3;
        System.out.println(nombre + " se defiende.");
    }

    @Override
    public void atacarDistancia(Personaje other) {
       other.puntosVida -= 3;
       System.out.println(nombre + " ataca a distancia");;
    }
    
}
