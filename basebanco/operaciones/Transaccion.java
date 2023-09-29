package basebanco.operaciones;

import basebanco.entidades.Cuenta;

public abstract class Transaccion {
    private Cuenta cuenta;
    
    public Transaccion(Cuenta cuenta) {
        this.vincularCuenta(cuenta);
    }

    private void vincularCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
        cuenta.agregarTransaccion(this);
    }

    public abstract void procesar();

    public Cuenta getCuenta() {
        return cuenta;
    }
}
