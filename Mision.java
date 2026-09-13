public class Mision{
    private String nombreMision;
    private int nivelRequerido;
    private int danoDeMision;
    public Mision(String nombreMision, int nivelRequerido, int danoDeMision){
        this.nombreMision = nombreMision;
        this.nivelRequerido = nivelRequerido;
        this.danoDeMision = danoDeMision;
    }
    public String getNombreMision(){
        return nombreMision;
    }
    public int getNivelRequerido(){
        return nivelRequerido;
    }
    public int getDanoDeMision(){
        return danoDeMision;
    }
}