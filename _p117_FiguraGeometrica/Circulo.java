package _p117_FiguraGeometrica;

public class Circulo implements FiguraGeometrica{
    private double Radio;

    public Circulo(double radio) {
        Radio = radio;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(Radio, 2);
    }

    public double getPerimetro(){
        return 2 * Math.PI * Radio;
    }

    public void ajustar(double porcenetaje) {
        Radio = Radio + (Radio * porcenetaje);
    }

    @Override
    public String toString() {
        return "Circulo [Radio=" + Radio + ", Area = " + 
        String.format("%.2f", getArea()) + ", Perímetro = " + 
        String.format("%.2f", getPerimetro()) + "]";
    }

    
}
