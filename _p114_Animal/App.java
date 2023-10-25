package _p114_Animal;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Gato migato = new Gato();
        migato.sonido();
        migato.dormir();
    }
}
