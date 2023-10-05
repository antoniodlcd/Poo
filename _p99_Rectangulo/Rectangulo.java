package _p99_Rectangulo;

public class Rectangulo {
    private float ancho;
    private float largo;
    private float area;
    private float perimetro;

    public Rectangulo(){
        
    }
    public Rectangulo(float ancho, float largo, float area, float perimetro){
        this.ancho = ancho;
        this.largo = largo;
        this.area = area;
        this.perimetro = perimetro;
    }

    public float getAncho() {
        return ancho;
    }
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }
    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getArea() {
        return ancho * largo;
    }
    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return (largo * 2) + (ancho * 2);
    }
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    @Override
    public String toString() {
        return "Rectangulo [ancho=" + ancho + ", largo=" + largo + ", area=" + area + ", perimetro=" + perimetro + "]";
    }

    
}
