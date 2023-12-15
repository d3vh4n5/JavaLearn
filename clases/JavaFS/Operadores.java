package JavaFS;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        System.out.println("Operador ternario");
        
        Scanner teclado = new Scanner(System.in);
        int variable;
        String resultado;

        System.out.println("Ingrese un número: ");
        variable = teclado.nextInt();
        teclado.nextLine();
        teclado.close();


        // El operador ternario en java tiene que ser algo que devuelva un valor
        resultado = (variable < 10) 
            ? "Es menor a 10" 
            : "Es mayor o igual a 10";
        System.out.println(resultado);
    }
}
