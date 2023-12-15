package clase31;
import java.util.InputMismatchException;

public class Funcion {
    public static double division(double num1, double num2){
        double resultado;
        resultado = num1/num2;
        return resultado;
    }

    public static void activarDivision(){

        double num1, num2, resultado;
        boolean bandera;
        
        do{
            try {
                bandera = false;
                // Proceso
                Imprimir.texto("Ingrese un número: ");
                num1 = Teclado.numero();
                Teclado.limpiar();
                
                Imprimir.texto("Ingrese un número: ");
                num2 = Teclado.numero();
                Teclado.limpiar();
        
                Teclado.cerrar();
        
                // Resultado
                resultado = division(num1, num2);
                Imprimir.texto("El resultado de la división es: "+resultado);
            } catch(InputMismatchException e){ // Debo iportar java.util para que me tome el tipo de variable de error
                Imprimir.texto("ERROR: Debe introducir numeros enteros o decimales");
                Teclado.limpiar(); // Se interrume el teclado al momento del input, entonces no se limpiaba antes
                bandera = true;
            }
        } while (bandera);
    }
}
