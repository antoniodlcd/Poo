package _p101_TrabajoPersona;

public class Persona {
    private String Nombre;
    private Trabajo Trabajo;
    
    public Persona() {
    }
    public Persona(String nombre, _p101_TrabajoPersona.Trabajo trabajo) {
        Nombre = nombre;
        Trabajo = trabajo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public Trabajo getTrabajo() {
        return Trabajo;
    }
    public void setTrabajo(Trabajo trabajo) {
        Trabajo = trabajo;
    }
    @Override
    public String toString() {
        return "Persona [Nombre=" + Nombre + ", Trabajo=" + Trabajo + "]";
    }

    
}
