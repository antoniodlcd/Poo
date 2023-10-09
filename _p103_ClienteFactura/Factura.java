package _p103_ClienteFactura;

public class Factura {
    private int Id;
    private Cliente Cliente;
    private double Monto;
    
    public Factura() {
    }
    public Factura(int id,Cliente cliente, double monto) {
        Id = id;
        Cliente = cliente;
        Monto = monto;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public Cliente getCliente() {
        return Cliente;
    }
    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }
    public double getMonto() {
        return Monto;
    }
    public void setMonto(double monto) {
        Monto = monto;
    }
    public double getMontoconDescuento() {
        return Monto - (Monto * Cliente.getDescuento()/100.0);
    }
    @Override
    public String toString() {
        return "Factura [Id=" + Id + ", Cliente=" + Cliente + ", Monto=" + Monto + "]";
    }
    
}
