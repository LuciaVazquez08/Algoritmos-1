package basebanco.operaciones;

import basebanco.entidades.Cuenta;

public class ConsultaSaldo extends Transaccion {

    public ConsultaSaldo(Cuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void procesar() {
        System.out.println(this.getCuenta() + " - Saldo: " + this.getCuenta().getSaldo());
    }
    
}
