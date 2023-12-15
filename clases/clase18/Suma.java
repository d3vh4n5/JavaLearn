package clase18;
import java.util.*;

/*
 * Pedimos dos numeros enteros
 * Imprimimos el resultadod e la suma por consola
 */


public class Suma {
    public static void main(String[] args) {
        // Declaración de las variables
        int num1, num2;

        // Declarar  variables objetos
        Scanner teclado;
        // instanciaciondel objeto
        teclado = new Scanner(System.in);

        // inicializaciond e num1 y num2 por instruccion de salida y entrada

        System.out.println("Ingrese un número entero:");
        num1 = teclado.nextInt();
        // limpieza del buffer
        teclado.nextLine();

        System.out.println("Ingrese otro numero entero:");
        num2 = teclado.nextInt();
        // limpieza del buffer
        teclado.nextLine();

        System.out.println("Numeros ingresados:");
        System.out.println(num1);
        System.out.println(num2);

        System.out.println("El resultado de la suma es: "+(num1 + num2));

        // Cerrar el objeto teclado

        teclado.close();
    }
}
