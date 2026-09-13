public class Vehiculo{
    protected String marca;
    protected int velociadMaxima;
    public Vehiculo(String marca, int velociadMaxima){
        this.marca = marca;
        this.velociadMaxima = velociadMaxima;
    }
    public void acelerar(){
        System.out.println(marca + " esta acelerando a " + velociadMaxima);
    }
}
