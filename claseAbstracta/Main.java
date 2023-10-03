package claseAbstracta;

public class Main {
    public static void main(String[] args) {
        Paladin paladin = new Paladin("Paladin1", 10, 50);
        Wizard wizard = new Wizard("Wizard1", 10, 40);

        paladin.mostrarEstado();
        wizard.mostrarEstado();

        paladin.atacar(wizard);
        wizard.defender();

        paladin.mostrarEstado();
        wizard.mostrarEstado();

        wizard.atacar(paladin);
        paladin.defender();

        paladin.mostrarEstado();
        wizard.mostrarEstado();
    }
}