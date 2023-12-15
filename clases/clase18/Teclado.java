package clase18;
import java.util.*;

public class Teclado {
    public static void main(String[] args) {
        

        /*
         * Aprenderemos a declarar e inicializar objetos
         * Mediante un objeto scanner pediremos el nombre al usuario
         * y lo imprimiremos por consola
         */

         // Declaracion de variables

        String nombre;

        // Declaracion de los objetos

        Scanner teclado;

        // Inicialización (instanciación) dela variable objeto

        teclado = new Scanner(System.in);

        // Inicializacion e la variable nombre por instruccion ed salida-entrada
        System.out.println("Por favor ingrese su nombre: ");
        nombre = teclado.nextLine();

        // Resultado por instruccion d salida
        System.out.println("El nombre ingresado es: "+ nombre);

        // Cerramos el objeto teclado para liberar memoria ram
        teclado.close();

    }
    
}
