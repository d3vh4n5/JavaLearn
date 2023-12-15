package clase32;

import java.util.Scanner;

public class Teclado {
    public static Scanner teclado = new Scanner(System.in);

    public static double numero(){
        return teclado.nextDouble();
    }

    public static void cerrar(){
        teclado.close();
    }

    // Se utiliza cuando se capturan numeros
    public static void limpiar(){
        teclado.nextLine();
    }
}
