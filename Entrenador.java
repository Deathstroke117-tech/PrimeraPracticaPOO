import java.util.ArrayList;
import java.util.List;

public class Entrenador{
    public static void main(String[] args) {
        List<Pokemon> pokemones = new ArrayList<>();
        pokemones.add(new Pokemon("Pikachu", "Principal"));
        pokemones.add(new Pokemon("Otro", "Otro Principal"));
        pokemones.add(new Pokemon("Otro Pokemon", "Principal Pokemon"));
        if(pokemones.isEmpty()){
            System.out.println("Lista vacía.");
        }
        else{
            for(Pokemon e: pokemones){
                System.out.println("Nombre: " + e.getNombre() + " Tipo: " + e.getTipo());
            }
        }
    }
}
