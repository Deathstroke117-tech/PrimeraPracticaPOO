public class SistemasVentas{
    public static void main(String[] args){
        Factura factura1 = new Factura("Azúcar", 10.0);
        double resultado = CalculadoraImpuestos.calcularImpuesto(factura1.getMonto());
        ImpresoraRecibos.mostrarRecibos(factura1, resultado);
    }
}
