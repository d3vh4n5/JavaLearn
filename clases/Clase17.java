/*
 * 1- declaramos la clase publica atajo: class
 * 2- declaramos el método atajo: main
 */

public class Clase17{ // Esta es la clase principal

    public static void main(String[] args){ // Este es el método main (el punto de acceso de java)
       

        // Declaración de variables
        // <top> <nombre>;

        // Variables numéricas
        byte num1;
        int num2; // utilizamos para numeros enteros
        double num3; // numeros decimales

        // Variables alfanuméricas

        char letra;
        String palabra;
        String palabra2;

        // Variables booleanas

        boolean condicion1;
        boolean condicion2;

        // inicializacion de las variables

        num1 = 127;
        num2 = 1500;
        num3 = 2.55;
        letra = 'A'; // el CHAR Debe ir entre comillas simples;
        palabra = "Mono";
        palabra2 = "Esto 123123 Es string";
        condicion1 = true;
        condicion2 = false;

        // Declaración de otras variables

        int suma, resta, prom; // Declaración múltiple de variables

        // Inicialización de las variables anteriores
        suma = num1 + num2;
        resta = num2 - num1;
        prom = suma / 2;

        // instrucciones de salida, atajo: sout

        System.out.println("Estos son los resultados");
        System.out.println("Suma: " + suma); // Concatenación con "+"
        System.out.println();
    }


}