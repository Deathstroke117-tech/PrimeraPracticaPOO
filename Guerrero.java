public class Guerrero extends Aventurero{
    public Guerrero(String nombre, int nivel, int puntosDeVida){
        super(nombre, nivel, puntosDeVida);
    }
    @Override
    public void atacar(){
        System.out.println(nombre + " ataca con su espada!");
    }
}
