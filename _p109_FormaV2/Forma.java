package _p109_FormaV2;

public abstract class Forma {
    private String Color;
    private boolean Relleno;
    
    // constructor
    public Forma(String color, boolean relleto) {
        Color = color;
        Relleno = relleto;
    }

    // getters y setters
    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isRelleto() {
        return Relleno;
    }

    public void setRelleto(boolean relleto) {
        Relleno = relleto;
    }

    // crear métodos abstractos
    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Forma [Color=" + Color + ", Relleto=" + Relleno + "]";
    }
    
}
