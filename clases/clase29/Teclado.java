package clase29;
import java.util.Scanner;

public class Teclado {
    // Trabajamos con objetos de clase
    public static Scanner teclado = new Scanner(System.in);

    // metodo para leer datos tipo string
    public static String texto(){
        return teclado.nextLine();
    }
}
