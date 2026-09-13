public class CuentaVip extends Cuenta{
    public CuentaVip(String idCuenta, String titular, double saldo){
        super(idCuenta, titular, saldo);
    }
    @Override
    public void retirar(double monto){
        if((saldo - monto) < -500){
            throw new IllegalStateException("Llegaste al limite de la tarjeta.");
        }
        saldo -= monto;
        registrarMovimiento("Retiro de: " + monto);
    }
}
