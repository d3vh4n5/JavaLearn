package clase28;
import java.util.Scanner;

public class Sistema {
    // Declaramos el objeto de clase
    static Scanner teclado;

    // 1 Teclado para capturar texto
    public static String tecladoTexto(){
        // Instancio el objeto scanner
        teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
    // 1 Teclado para capturar numeros
    public static Double tecladoNumero(){
        // Instancio el objeto scanner
        teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }
}
