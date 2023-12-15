package paquete;

import java.util.Scanner;

public class Teclado {
    public static Scanner teclado = new Scanner(System.in);

    public static String texto(){
        return teclado.nextLine();
    }
    
    public static int numero(){
        return teclado.nextInt();
    }

    public static void cerrar(){
        teclado.close();
    }

    public static void limpiar(){
        teclado.nextLine();
    }
}
