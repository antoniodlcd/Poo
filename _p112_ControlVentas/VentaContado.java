package _p112_ControlVentas;


public class VentaContado extends Venta{
    private double Descuento;
    private String Regalo;
    
    // constructor
    
    public VentaContado(String articulo, int cantidad, double precio, double descuento, String regalo) {
        super(articulo, cantidad, precio);
        Descuento = descuento;
        this.Regalo = regalo;
        getTotalVenta();
    }

    public VentaContado(String articulo, int cantidad, double precio) {
        super(articulo, cantidad, precio);
    }

    // getters y setters
    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double descuento) {
        Descuento = descuento;
    }

    public String getRegalo() {
        return Regalo;
    }

    public void setRegalo(String regalo) {
        Regalo = regalo;
    }
  

    // sobrecargar método para calcular el total de venta
    @Override
    public double getTotalVenta() {
        double total = super.getPrecio() * super.getCantidad();
        Descuento = (total * Descuento) / 100;
        total -= Descuento;
        return total;
    }

    // método toString
    @Override
    public String toString() {
        return "VentaContado [Articulo=" + super.getArticulo() + ", Cantidad=" + super.getCantidad() + ", Precio=" + super.getPrecio() + "Descuento=" + Descuento + ", Regalo=" + Regalo + ", Total=" + getTotalVenta() + "]";
    }




    

}
