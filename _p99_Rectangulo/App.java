package _p99_Rectangulo;

public class App {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(1.2f, 3.4f,0,0);
        System.out.println(r1.toString());

        Rectangulo r2 = new Rectangulo();
        System.out.println(r2.toString());

        r1.setLargo(5.6f);
        r1.setAncho(7.8f);
        System.out.println(r1.toString());
        System.out.println("Largo : " + r1.getLargo());
        System.out.println("Ancho : " + r1.getAncho());

        System.out.printf("El Área es      : %.2f\n", r1.getArea());
        System.out.printf("El Perímetro es : %.2f\n", r1.getPerimetro());
    }
}
