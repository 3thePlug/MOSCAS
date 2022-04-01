import java.util.Scanner;

public class JuegoMosca {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Tablero tab = new Tablero(3);
        System.out.println(tab);
        int x, y;
        do {
            System.out.println("Dime la posicion X: ");
            x = sc.nextInt();
            System.out.println("Dime la posicion Y: ");
            y = sc.nextInt();
            tab.golpear(x, y);
            System.out.println(tab);
        } while (tab.getNumMoscasVivas()>0);
    }
}
