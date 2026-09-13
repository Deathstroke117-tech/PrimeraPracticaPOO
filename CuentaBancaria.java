public class CuentaBancaria{
    private String titular;
    private double saldo;
    public CuentaBancaria(String _titular, double _saldoInicial){
        this.titular = _titular;
        this.saldo = _saldoInicial;
    }
    public String getNombre(){
        return titular;
    }
    public void depositar(double cantidad){
        if(cantidad > 0){
            saldo += cantidad;
            System.out.println("Deposito Exitoso");
            return;
        }
        System.out.println("No puedes depositar montos menores a 0");
    }
    public double getSaldo(){
        return saldo;
    }
}