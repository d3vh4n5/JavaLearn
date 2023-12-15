package clase19;
import java.util.*;

/**
 * @autor: Juan 
 */

public class EstructuraIf {
    public static void main(String[] args) {
        int num;

        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.println("Por favor ingrese un número entero");
        num = teclado.nextInt();
        teclado.nextLine(); // Se limpia el buffer siempre que se ingresa unint o un double
        teclado.close();

        if (num == 0){
            System.out.println("El numero ingresado no puede ser cero");
        } else {   
            if (num%2 == 0){
                System.out.println("Numero par");
            } else if (num == 3){
                System.out.println("Numero igual a 3");
            } else {
                System.out.println("Numer impar distinto de 3");
            }
        }




    }
}
