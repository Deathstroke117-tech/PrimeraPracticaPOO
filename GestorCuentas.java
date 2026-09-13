import java.util.HashMap;
import java.util.Map;

public class GestorCuentas{
    private Map<String, Cuenta> baseDeDatos = new HashMap<>();
    public void agregarCuenta(Cuenta nuevaCuenta){
        baseDeDatos.putIfAbsent(nuevaCuenta.getIdCuenta(), nuevaCuenta);
    }
    public Cuenta obtenerCuenta(String id){
        Cuenta otraCuenta = baseDeDatos.get(id);
        if(otraCuenta != null){
            return otraCuenta;
        }
        throw new IllegalArgumentException("No existe la cuenta");
    }
    public Map<String, Cuenta> obtenerTodasLasCuentas(){
        return baseDeDatos;
    }
}
