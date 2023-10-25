package _p116_Juego;

import java.util.Scanner;

public class JuegoDados implements Juego{
    private int dado1, dado2;
    private String jugador1, jugador2;
    private Scanner teclado;

    public JuegoDados() {
        teclado = new Scanner(System.in);
    }

    @Override
    public void iniciar() {
        System.out.print("Jugador 1 > "); jugador1 = teclado.nextLine();        
        System.out.print("Jugador 2 > "); jugador2 = teclado.nextLine();        
    }

    @Override
    public void jugar() {
        dado1 = 1 + (int) (Math.random() * 6);        
        dado2 = 1 + (int) (Math.random() * 6);        
        System.out.println("A " + jugador1 + " le salió el valor de: " + dado1);
        System.out.println("A " + jugador2 + " le salió el valor de: " + dado2);
    }

    @Override
    public void finalizar() {
        if (dado1 > dado2) System.out.println("Ganó " + jugador1 + " con un valor de: " + dado1);
        else if (dado2 > dado1) System.out.println("Ganó " + jugador2 + " con un valor de: " + dado2);
        else System.out.println("Empataron los jugadores con el valor de: " + dado1);
    }

    
    
}
