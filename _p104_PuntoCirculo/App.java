package _p104_PuntoCirculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Circulo circulo1 = new Circulo(6, new Punto(5,8));
        Circulo circulo2 = new Circulo(2, new Punto(30,46));

        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println("Circulo 1 Area           : " + circulo1.getArea());
        System.out.println("Circulo 1 Circunferencia : " + circulo1.getCircunferencia());
        System.out.println("Circulo 1 Centro         : " + circulo1.getCentro());
        System.out.println("Distancia a Circulo 2    : " + circulo1.getCentro().getDistancia(circulo2.getCentro()));

    }
}
