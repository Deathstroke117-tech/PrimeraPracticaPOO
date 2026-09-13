public abstract class Aventurero{
    protected String nombre;
    protected int nivel;
    protected int puntosDeVida;
    public Aventurero(String nombre, int nivel, int puntosDeVida){
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
    }
    public String getNombre(){
        return nombre;
    }
    public int getNivel(){
        return nivel;
    }
    public int getPuntosDeVida(){
        return puntosDeVida;
    }
    public void recibirDano(int dano){
        if((puntosDeVida - dano) <= 0){
            puntosDeVida = 0;
            return;
        }
        puntosDeVida -= dano;
    }
    public abstract void atacar();
    public void recibirCuracion(Aventurero aventurero, int cantidad){
        if(cantidad <= 0){
            System.out.println("No puedes curar 0.");
            return;
        }
        aventurero.puntosDeVida += cantidad;
        System.out.println(nombre + " ha curado a " + aventurero.getNombre());
    }
}
