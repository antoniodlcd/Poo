package _p107_Forma;

// ESta clase es el prototipo , sólo se podrá hederar
public abstract class Forma {
    private String Color;

    // contructor
    public Forma(String color) {
        Color = color;
    }

    // getters y setters
    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    // Crear método abstracto
    public abstract double getArea();

    @Override
    public String toString() {
        return "Forma [Color=" + Color + "]";
    }

    
    
}
