import java.util.Scanner;
public class IngresoRestringido{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        int miIntento = 0;
        System.out.println("Crea tu constraseña: ");
        int miClave = sc.nextInt();
        while(intentos != 3){
            System.out.println("Ingresa tu clave: ");
            miIntento = sc.nextInt();
            if(miIntento == miClave){
                System.out.println("Bienvenido.");
                break;
            }
            else{
                System.out.println("Constreña incorrecta: intente nuevamente.");
                intentos++;
            }
        }
    }
}