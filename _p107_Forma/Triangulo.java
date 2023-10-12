package _p107_Forma;

public class Triangulo extends Forma{
    private double Base;
    private double Altura;
    public Triangulo(String color, double base, double atura) {
        super(color);
        Base = base;
        Altura = atura;
    }
    public double getBase() {
        return Base;
    }
    public void setBase(double base) {
        Base = base;
    }
    public double getAtura() {
        return Altura;
    }
    public void setAtura(double atura) {
        Altura = atura;
    }
    @Override
    public double getArea() {
        return (Base * Altura) / 2;
    }
    @Override
    public String toString() {
        return "Triangulo [" + super.toString() + ", Base=" + Base + ", Altura=" + Altura + "]";
    }

    
    
}
