public class AdministradorMisiones{
    public static void enviarMision(Aventurero aventurero, Mision mision){
        if(aventurero.puntosDeVida == 0){
            throw new IllegalStateException(aventurero.nombre + " no tiene la suficiente vida para ir a la misión.");
        }
        else if(aventurero.nivel < mision.getNivelRequerido()){
            throw new IllegalArgumentException(aventurero.nombre + " No tiene el suficiente nivel para la misión.");
        }
        aventurero.atacar();
        aventurero.recibirDano(mision.getDanoDeMision());
    }
}
