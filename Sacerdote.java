public class Sacerdote extends Aventurero implements Curador{
    public Sacerdote(String nombre, int nivel, int puntosDeVida){
        super(nombre, nivel, puntosDeVida);
    }
    @Override
    public void atacar(){
        System.out.println(getNombre() + " lanza un rayo.");
    }
    @Override
    public void sanar(Aventurero objetivo){
        System.out.println(nombre + " esta curando a " + objetivo.getNombre());
        recibirCuracion(objetivo, 60);
    }
}
