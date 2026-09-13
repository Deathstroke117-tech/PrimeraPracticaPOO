public class Juego{
    public static void main(String[] args){
        Personaje nuevoPersonaje = new Personaje();
        nuevoPersonaje.nombre = "Master";
        nuevoPersonaje.puntosDeVida = 100;
        nuevoPersonaje.recibirDano(20);
    }
}
