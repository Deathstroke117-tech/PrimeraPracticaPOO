public class ImpresoraRecibos{
    public static void mostrarRecibos(Factura nuevaFactura, double totalCalculado){
        System.out.println("Nombre: " + nuevaFactura.getProducto());
        System.out.println("Monto: " + nuevaFactura.getMonto());
        System.out.println("Total: " + totalCalculado);
    }
}
