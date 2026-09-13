import java.util.ArrayList;
import java.util.List;

public class SimuladorGremio{
    public static void main(String[] args){
        List <Aventurero> adventureros =  new ArrayList<>();
        Guerrero guerrero1 = new Guerrero("Master", 5, 100);
        Sacerdote sacerdote1 = new Sacerdote("Aliado", 2, 80);
        adventureros.add(guerrero1);
        adventureros.add(sacerdote1);
        Mision mision1 = new Mision("Caza de dragón", 4, 90);
        try{
            AdministradorMisiones.enviarMision(guerrero1, mision1);
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        try{
            AdministradorMisiones.enviarMision(sacerdote1, mision1);
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        sacerdote1.recibirCuracion(guerrero1, 60);
        if(adventureros.isEmpty()){
            System.out.println("Lista vacía.");
        }
        else {
            for (Aventurero personajes : adventureros) {
                System.out.println(personajes.getPuntosDeVida());
            }
        }
    }
}
