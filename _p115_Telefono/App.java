package _p115_Telefono;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        Telefono mitelefono = new Telefono();
        mitelefono.obtenerCoordenadas();
        mitelefono.iniciarRadio();
        mitelefono.detenerRadio();
    }
}
