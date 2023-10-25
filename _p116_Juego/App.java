package _p116_Juego;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("\nJuego de dados ...");
        JuegoDados juego1 = new JuegoDados();
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();
        
        System.out.println("\nJuego de adivinar el número ...");
        JuegoAdivina juego2 = new JuegoAdivina();
        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();
    }
}
