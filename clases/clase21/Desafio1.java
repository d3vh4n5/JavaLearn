package clase21;
import java.util.*;

public class Desafio1 {
    public static void main(String[] args) {
        int n1, n2, max, min;

        max = 0;
        min = 0;

        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        n1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese otro número: ");
        n2 = teclado.nextInt();
        teclado.nextLine();
        teclado.close();

        if (n1 != n2){
            
            if (n1 > n2) {
                max = n1;
                min = n2;
            } else {
                max = n2;
                min = n1;
            }
        } else {
            System.out.println("Los números no pueden ser iguales");
        }
        System.out.println("===========================");
        for (int i = min; i <= max; i++){
            System.out.println(i+1);
        }
        System.out.println("===========DEsafio 2============");
        for (int i = min; i <= max; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
