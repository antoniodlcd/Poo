package _p103_ClienteFactura;

public class Cliente {
    private String Id;
    private String Nombre;
    private int Descuento;
    
    public Cliente() {
    }

    public Cliente(String id, String nombre, int descuento) {
        Id = id;
        Nombre = nombre;
        Descuento = descuento;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getDescuento() {
        return Descuento;
    }

    public void setDescuento(int descuento) {
        Descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente [Id=" + Id + ", Nombre=" + Nombre + ", Descuento=" + Descuento + "]";
    }
    
    
    
}
