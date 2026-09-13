import java.util.HashMap;
import java.util.Map;
public class ImpresoraFinanciera{
    public static void imprimirReporte(Map<String, Cuenta> cuentas){
        if(cuentas.isEmpty()){
            throw new IllegalArgumentException("La lista esta vacía.");
        }
        cuentas.forEach((id, cuenta) -> {
            System.out.println("Id del titular: " + id + " Titular: " + cuenta.getTitular() + " Saldo: " + cuenta.getSaldo());
        });
    }
}
