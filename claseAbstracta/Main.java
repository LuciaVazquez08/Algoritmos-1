package claseAbstracta;

public class Main {
    public static void main(String[] args) {
        Paladin paladin1 = new Paladin("Paladin", 10, 50);
        Wizard wizard1 = new Wizard("Wizard", 10, 40);

        Wizard[] personajesAtaqueDistancia = new Wizard[3];
        for (int i=0 ; i<3 ; i++) {
            personajesAtaqueDistancia[i] = new Wizard("Wizard"+i, 10, 20*i);
        }
        Paladin paladin2 = new Paladin("Paladin", 10, 100);
        
        paladin1.mostrarEstado();
        wizard1.mostrarEstado();

        paladin1.atacar(wizard1);
        wizard1.defender();

        paladin1.mostrarEstado();
        wizard1.mostrarEstado();

        wizard1.atacar(paladin1);
        paladin1.defender();

        paladin1.mostrarEstado();
        wizard1.mostrarEstado();

        paladin2.mostrarEstado();

        paladin2.atacar(personajesAtaqueDistancia[0]);
        personajesAtaqueDistancia[0].defender();

        paladin2.mostrarEstado();

        // Realizar ataques a distancia
        for (AtaqueDistancia personaje : personajesAtaqueDistancia) {
            personaje.atacarDistancia(paladin2);
        }

        paladin2.mostrarEstado();
    }
    }
