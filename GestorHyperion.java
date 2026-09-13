import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class GestorHyperion {
    public static void main(String[] args) {
        Map<String, Integer> nivelesDeAcceso = new HashMap<>();
        nivelesDeAcceso.put("Reactor", 5);
        nivelesDeAcceso.put("Puente de mando", 10);
        nivelesDeAcceso.put("Bahia", 2);
        System.out.println(nivelesDeAcceso.get("Reactor"));
        nivelesDeAcceso.forEach((id, nivel) -> {
            System.out.println("Sector: " + id + " requiere nivel: " + nivel);
        });
    }
}