package basebanco.operaciones;

import basebanco.entidades.Cuenta;

public class Deposito extends Transaccion {

    private float monto = 0;

    public Deposito(Cuenta cuenta, float monto) {
        super(cuenta);
        if (monto < 0) {
            throw new RuntimeException();   // MontoInvalidoException
        }
        this.monto = monto;
    }

    @Override
    public void procesar() {
        this.getCuenta().depositar(this.monto);
    }
    
}
