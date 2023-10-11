package _p104_PuntoCirculo;

public class Circulo {
    private double Radio;
    private Punto Centro;
    public Circulo() {
    }
    public Circulo(double radio, Punto centro) {
        Radio = radio;
        Centro = centro;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    public Punto getCentro() {
        return Centro;
    }
    public void setCentro(Punto centro) {
        Centro = centro;
    }

    public double getArea() {
        return (Math.PI * Math.pow(getRadio(),2));
    }

    public double getCircunferencia() {
        return (2 * Math.PI * getRadio());
    }
    @Override
    public String toString() {
        return "Circulo [Radio=" + Radio + ", Centro=" + Centro + "]";
    }

    
}
