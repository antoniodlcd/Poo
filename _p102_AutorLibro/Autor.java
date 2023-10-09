package _p102_AutorLibro;

public class Autor {
    private String Nombre;
    private String Correo;
    public Autor() {
    }
    public Autor(String nombre, String correo) {
        Nombre = nombre;
        Correo = correo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String correo) {
        Correo = correo;
    }
    @Override
    public String toString() {
        return "Autor [Nombre=" + Nombre + ", Correo=" + Correo + "]";
    }

}
