package clase27;

import java.util.Scanner;

/*
 * Este archivo (clases) contiene todos los metodos
 * NO CONTIENE METODO MAIN!!!!!!!!!
 */

public class Metodos {
    // Zona metodos

    public static void imprimir(String txt){
        System.out.println(txt);
    }

    // Metodo apra usar el scanner

    public static int tecladoInt(){
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        teclado.nextLine();
        teclado.close();
        return numero;
    }

    // Metodo para encapsular el procedimiento

    public static void clasificarNumero(int numero){
        int elDoble = 2*numero;
        imprimir("El doble del numero ingresado es: " + elDoble);
        
        if (numero%2 == 0){
            imprimir("El número es par");
            return; // System.exit(0);
        }
        imprimir("El número es impar");
    }

    // metodo para desencadenar las acciones

    public static void app(){
        imprimir("Ingrese un numero: ");
        int miNum = tecladoInt();
        clasificarNumero(miNum);
    }
}
