package _p106_Persona;

public class Estudiante extends Persona{
    private String Carrera;
    private int Año;
    private double Colegiatura;

    public Estudiante() {

    }

    public Estudiante(String nombre, String direccion, String carrera, int año, double Colegiatura) {
        super(nombre, direccion);
        this.Carrera = carrera;
        this.Año = año;
        this.Colegiatura = Colegiatura;

    }
    

    public Estudiante(Persona persona, String carrera, int año, double colegiatura) {
        super (persona.Nombre, persona.Direccion);
        Carrera = carrera;
        Año = año;
        Colegiatura = colegiatura;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    public double getColegiatura() {
        return Colegiatura;
    }

    public void setColegiatura(double colegiatura) {
        Colegiatura = colegiatura;
    }

    @Override
    public String toString() {
        return "Estudiante [" + super.toString() + ", Carrera=" + Carrera + ", Año=" + Año + ", Colegiatura=" + Colegiatura + "]";
    }

    

}
