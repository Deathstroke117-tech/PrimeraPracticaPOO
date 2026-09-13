public class PrimerosAprendizajes {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String miNombre = "Luis";
        int edad = 19;
        double miSueldo = 1500.00;
        boolean esActivo = true;
        if(miSueldo > 1000.00){
            System.out.println("Tu sueldo es mayor a 1000.00");
        }
        else{
            System.out.println("Tu sueldo no es mayor a 1000.00");
        }
        if(!esActivo){
            System.out.println("No estas activo");
        }
        else{
            System.out.println("Si esta activo");
        }
        int[] miArray = {1,2,3,4,5,6,7,8,9,10};
        for(int e: miArray){
            System.out.println(e);
        }
        String[] otroArray = {"Hola", "Master", "Jefe"};
        for(String e: otroArray){
            System.out.println(e);
        }
        int[] arrayOtro = {1, 3, 5, 8,10};
        int[] miOtroArray = {1, 2, 3};
        for(int i = 0; i< arrayOtro.length; i++){
            System.out.println(i);
        }
        if(miOtroArray == null || miOtroArray.length == 0){
            System.out.println("El array esta vacío.");
        }
        else{
            for(int e: miOtroArray){
                System.out.println(e);
            }
        }
    }
}
