package clase27;
import java.util.Scanner;

public class AplicacionSinFuncion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un nmero entero: ");
        int miNum = teclado.nextInt();
        teclado.nextLine();
        teclado.close();

        // Proceso

        int elDoble = 2*miNum;
        System.out.println("El doble del numero ingresado es: " + elDoble);

        System.out.println("""
                ***************************
                a ver que imrpime esto
                ***************************
                """);
        
        if (miNum%2 == 0){
            System.out.println("El número es par");
            return; // System.exit(0);
        }
        System.out.println("El número es impar");

    }
}
