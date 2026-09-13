public abstract class Cuenta implements Auditable{
    protected String idCuenta;
    protected String titular;
    protected double saldo;
    public Cuenta(String idCuenta, String titular, double saldo){
        this.idCuenta = idCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public String getIdCuenta(){
        return idCuenta;
    }
    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public void depositar(double cantidad){
        if(cantidad <= 0){
            throw new IllegalArgumentException("No puedes depositar 0.");
        }
        saldo += cantidad;
    }
    public abstract void retirar(double monto);
    @Override
    public void registrarMovimiento(String accion){
        System.out.println(accion);
    }
}