public class EvaluadorDescuentos{
    public static void main(String[] args){
        double montoCompra = 200.0;
        boolean esVip = false;
        boolean tieneCupon = true;
        if(esVip || tieneCupon){
            montoCompra *= 0.80;
            System.out.println("Descuento aplicado");
        }
        else{
            System.out.println("No se aplicaron descuentos.");
        }
    }
}
