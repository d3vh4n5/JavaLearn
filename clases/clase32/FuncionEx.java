package clase32;
import java.util.*; // En este caso importamos las excepciones
/*
 * A la función division la enriqueceremos con el lanzamiento de las excepciones
 * y bloques try catch
 */
public class FuncionEx {
    public static double divisionEx(double num1, double num2) throws ArithmeticException {
        // Variables
        double resultado;
        // Mediante una estructura if diseñamos el lanzamiento de la excepcion
        if (num2 != 0) {
            return num1/num2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }


    // Método que anida a otros métodos y lo llamaremos desde el main
    // este metodo ataja excepcion mediante try - catch.

    public static void activarDivisionEx(){
        // Variables
        boolean repetir;
        double num1, num2, resultado;

        // Proceso
        do{
            try{ // Este primer try-catch gestiona al objeto Scanner
                repetir = false;
                // Instrucciones de salida entrada
                Imprimir.texto("Ingrese un número: ");
                num1 = Teclado.numero();
                Teclado.limpiar();
                Imprimir.texto("Ingrese otro número");
                num2 = Teclado.numero();
                Teclado.limpiar();// limpiamos el buffer

                // Llamamos a divisionEx

                try{ // este segundo try gestiona la excepcion que diseñamos para dividir
                    resultado = divisionEx(num1, num2);
                    Imprimir.texto("El resultado es: " + resultado);
                }catch(ArithmeticException e0){
                    Imprimir.texto("Intentelo de nuevo, Error: " + e0.getMessage());
                    activarDivisionEx(); // Llamada recursiva
                }

            }catch(InputMismatchException e1){
                Imprimir.texto("Intentelo de nuevo. Error: "+ e1.getMessage());
                repetir = true; // encendemos bandera
                Teclado.limpiar();
            }
        }while(repetir);
    }




}
