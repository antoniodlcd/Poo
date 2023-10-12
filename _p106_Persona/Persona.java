package _p106_Persona;

public class Persona {
    protected String Nombre;
    protected String Direccion;
    
    public Persona() {
    }
    public Persona(String nombre, String dirección) {
        Nombre = nombre;
        Direccion = dirección;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDirección() {
        return Direccion;
    }
    public void setDirección(String dirección) {
        Direccion = dirección;
    }
    @Override
    public String toString() {
        return "Persona [Nombre=" + Nombre + ", Dirección=" + Direccion + "]";
    }

    
    
}
