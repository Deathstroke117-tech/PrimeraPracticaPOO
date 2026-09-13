public class CalculadoraFinanciera{
    public static double dividirMonto(double cantidad, int personas){
        if(personas == 0){
            throw new IllegalArgumentException("No se puede dividir entre 0.");
        }
        return cantidad / personas;
    }
    public static void main(String[] args){
        try{
            dividirMonto(10000, 3);
            System.out.println("Resultado exitoso.");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            dividirMonto(10000, 0);
            System.out.println("Resultado exitoso.");
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Operacion realizada.");
        }
    }
}
