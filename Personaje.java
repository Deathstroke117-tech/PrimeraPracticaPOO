public class Personaje {
    String nombre;
    int puntosDeVida;

    public void recibirDano(int dano) {
        puntosDeVida -= dano;
        System.out.println(nombre + " recibio daño! puntos de vida restante: " + puntosDeVida);
    }
}