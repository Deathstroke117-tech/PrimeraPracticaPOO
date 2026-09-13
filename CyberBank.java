import java.util.HashMap;
import java.util.Map;

public class CyberBank{
    public static void main(String[] args){
        GestorCuentas nuevoGestor = new GestorCuentas();
        CuentaAhorro nuevaCuentaAhorro = new CuentaAhorro("1", "Master", 100);
        CuentaVip nuevaCuentaVip = new CuentaVip("3", "Jefe", 1000);
        nuevoGestor.agregarCuenta(nuevaCuentaAhorro);
        nuevoGestor.agregarCuenta(nuevaCuentaVip);
        try{
            nuevaCuentaAhorro.depositar(1000);
            nuevaCuentaVip.depositar(3000);
        }catch(IllegalStateException e){
            System.out.println("Error: " + e.getMessage());
        }
        try {
            nuevaCuentaAhorro.retirar(10000);
            nuevaCuentaVip.retirar(10000);
        }catch(IllegalStateException e){
            System.out.println("Error: " + e.getMessage());
        }
        try{
            nuevaCuentaVip.retirar(4400);
        }catch(IllegalStateException e){
            System.out.println("Error: " + e.getMessage());
        }
        ImpresoraFinanciera.imprimirReporte(nuevoGestor.obtenerTodasLasCuentas());
    }
}
