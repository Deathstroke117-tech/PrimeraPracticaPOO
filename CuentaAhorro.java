public class CuentaAhorro extends Cuenta{
    public CuentaAhorro(String idCuenta, String titular, double saldo){
        super(idCuenta, titular, saldo);
    }
    @Override
    public void retirar(double monto){
        if(monto > saldo){
            throw new IllegalStateException("No tienes saldo suficiente.");
        }
        saldo -= monto;
        registrarMovimiento("Retiro de: " + monto);
    }
}