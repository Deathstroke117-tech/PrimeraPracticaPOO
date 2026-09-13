public class UsuarioBanco{
    public static void main(String[] args){
        CuentaBancaria usuario1 = new CuentaBancaria("Jefe", 100);
        usuario1.depositar(300);
        usuario1.depositar(0);
        System.out.println("Saldo: " + usuario1.getSaldo());
    }
}
