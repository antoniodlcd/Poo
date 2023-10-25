package _p118_Calculadora;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        Calculadora micalc = new Calculadora();

        micalc.sumar(5, 10);
        micalc.restar(35, 15);
        micalc.multiplicar(6, 9);
        micalc.dividir(45, 6);
    }
}
