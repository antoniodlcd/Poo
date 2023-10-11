package _p104_PuntoCirculo;

public class Punto {
    private int X;
    private int Y;
    
    
    public Punto() {
    }
    public Punto(int x, int y) {
        this.X = x;
        this.Y = y;
    }
    public int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }
    public double getDistancia(Punto punto) {
        double distancia;
        distancia = Math.sqrt(Math.pow(punto.getX() - X, 2) + Math.pow(punto.getY() - Y, 2));
        return distancia;
    }

    @Override
    public String toString() {
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }
    
}
