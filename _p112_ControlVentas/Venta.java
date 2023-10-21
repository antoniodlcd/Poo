package _p112_ControlVentas;

public abstract class Venta {
    private String Articulo;
    private int Cantidad;
    private double Precio;
    // private double Total;
    
    // constructor
    public Venta(String articulo, int cantidad, double precio) {
        Articulo = articulo;
        Cantidad = cantidad;
        Precio = precio;
        // Total = total;
    }

    // getters y setters
    public String getArticulo() {
        return Articulo;
    }
    
    public void setArticulo(String articulo) {
        Articulo = articulo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    
    public double getPrecio() {
        return Precio;
    }
    
    public void setPrecio(double precio) {
        Precio = precio;
    }
    
    // public double getTotal() {
    //     return Total;
    // }
    
    // public void setTotal(double total) {
    //     Total = total;
    // }
    
    // método abstracto para calcular el total de ventas
    public abstract double getTotalVenta();

    // método toString
    @Override
    public String toString() {
        return "Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Total=" + "]";
    }
    
    
}
