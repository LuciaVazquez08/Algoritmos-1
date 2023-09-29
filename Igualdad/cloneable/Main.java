package Igualdad.cloneable;

public class Main {
    public static void main(String[] args) {

        // Clonar utilizando el constructor de copia
        Persona personaOriginal1 = new Persona("Lucia", 20, 44792845);
        Persona personaClonada1 = new Persona(personaOriginal1);

        System.out.println(personaOriginal1 == personaClonada1); 
        System.out.println(personaOriginal1.equals(personaClonada1)); 

        //Metodo de copia
        Persona personaOriginal = new Persona("Victoria", 18, 4667594);
        Persona personaClonada = personaOriginal.clonar();
        
        System.out.println(personaOriginal == personaClonada); 
        System.out.println(personaOriginal.equals(personaClonada)); 

        }
}
