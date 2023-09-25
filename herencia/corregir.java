class Vehiculo {
    void acelerar(int velocidad) {
        System.out.println("Vehiculo acelerando.");
    }
}

class Auto extends Vehiculo {
    void acelerar() {
        System.out.println("Auto acelerando.");
    }
    void subirVentanas() {
        System.out.println("Subiendo ventanas");
    }
    @Override
    void acelerar(int velocidad) {
        System.out.println("Auto acelerando a " + velocidad);
    }
}

class Moto extends Vehiculo {
    void acelerar() {
        System.out.println("Moto acelerando.");
    }
    @Override
    void acelerar(int velocidad) {
        System.out.println("Moto acelerando a " + velocidad);
    }
}


