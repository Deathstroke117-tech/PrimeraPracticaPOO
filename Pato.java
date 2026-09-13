public class Pato extends Animal implements Volador, Nadador{
    public Pato(String nombre){
        super(nombre);
    }
    @Override
    public void hacerSonido(){
        System.out.println("Cuac Cuac");
    }
    @Override
    public void volar(){
        System.out.println("Pato esta volando.");
    }
    @Override
    public void nadar(){
        System.out.println("Pato esta nadando en una piscina.");
    }
}
