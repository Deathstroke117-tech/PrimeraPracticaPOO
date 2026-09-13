public class Factura{
    private String producto;
    private double monto;
    public Factura(String producto, double monto){
        this.producto = producto;
        this.monto = monto;
    }
    public String getProducto(){
        return producto;
    }
    public double getMonto(){
        return monto;
    }
}
