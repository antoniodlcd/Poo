package _p102_AutorLibro;

public class Libro {
    private String Isbn;
    private String Nombre;
    private Autor Autor;
    private double Precio;
    private int Cantidad;

    public Libro() {
    }
    public Libro(String isbn, String nombre,Autor autor, double precio, int cantidad) {
        Isbn = isbn;
        Nombre = nombre;
        Autor = autor;
        Precio = precio;
        Cantidad = cantidad;
    }

    public String getIsbn() {
        return Isbn;
    }
    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Autor getAutor() {
        return Autor;
    }

    public void setAutor(Autor autor) {
        Autor = autor;
    }
    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }
    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Libro [Isbn=" + Isbn + ", Nombre=" + Nombre + ", Autor=" + Autor + ", Precio=" + Precio + ", Cantidad="
                + Cantidad + "]";
    }

    
}
