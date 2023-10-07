package basebanco;

import basebanco.entidades.Cuenta;
import basebanco.operaciones.ConsultaSaldo;
import basebanco.operaciones.Deposito;
import basebanco.operaciones.Extraccion;
import basebanco.operaciones.Transaccion;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1);

        
        Transaccion trx1 = new Deposito(cuenta1, 100);
        trx1.procesar();
        Transaccion trx2 = new ConsultaSaldo(cuenta1);
        trx2.procesar();
        Transaccion trx3 = new Extraccion(cuenta1, 200);
        trx3.procesar();
        trx2.procesar();

        
    }
}
