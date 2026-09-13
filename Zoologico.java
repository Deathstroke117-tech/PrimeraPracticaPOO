import java.util.ArrayList;
import java.util.List;

public class Zoologico{
    public static void main(String[] args){
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Jefe"));
        animales.add(new Gato("Master"));
        Pato pato1 = new Pato("Pato");
        pato1.hacerSonido();
        pato1.volar();
        pato1.nadar();
        animales.add(pato1);
        if(animales.isEmpty()){
            System.out.println("Lista vacía.");
        }
        else{
            for(Animal e: animales){
                e.hacerSonido();
            }
        }
    }
}
