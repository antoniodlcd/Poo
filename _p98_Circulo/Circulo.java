package _p98_Circulo;

public class Circulo {
    private double radio;
    private double area;
    private double circunferencia;


    public Circulo() {

    }
    public Circulo (double radio) {
        this.radio = radio;
        
    }

    public double getArea() {
        
        return Math.PI * (radio * radio);
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getCircunferencia() {
        return 2 * (Math.PI*radio);
    }
    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }
    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", area=" + area + ", circunferencia=" + circunferencia + "]";
    }
  
    
}
