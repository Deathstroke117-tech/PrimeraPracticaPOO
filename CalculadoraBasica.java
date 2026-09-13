public class CalculadoraBasica{
    public static double sumar(double a, double b){
        return a + b;
    }
    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }
    public static void main(String[] args){
        double resultado = sumar(10, 20);
        boolean numeroPar = esPar(100);
        if(numeroPar){
            System.out.println("Es par");
        }
        else{
            System.out.println("No es par");
        }
        System.out.println(resultado);
    }
}
