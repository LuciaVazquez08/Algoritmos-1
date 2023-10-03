package claseAbstracta.juegoRol;

public class Paladin extends Personaje{

    public Paladin(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public void atacar(Personaje other){
            other.puntosVida -= 5; 
            System.out.println(nombre + " ataca");   
    }

    @Override
    public void defender() {
       this.puntosVida +=2;   
       System.out.println(nombre + " se defiende.");      
    }

    
}
