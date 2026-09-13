public class Auto extends Vehiculo{
    private int numeroPuertas;
    public Auto(String marca, int velociadMaxima, int numeroPuertas){
        super(marca, velociadMaxima);
        this.numeroPuertas = numeroPuertas;
    }
    @Override
    public void acelerar(){
            System.out.println(marca + " con cantidad de puertas: " + numeroPuertas + " esta acelerando a " + velociadMaxima);
    }
}
