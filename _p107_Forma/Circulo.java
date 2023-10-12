package _p107_Forma;

public class Circulo extends Forma{
    private double Radio;

    public Circulo(String color, double radio) {
        super(color);
        Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    @Override
    public double getArea() {

        return Math.PI * Math.pow(Radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo ["+ super.toString() + ", Radio=" + Radio + "]";
    }
}
