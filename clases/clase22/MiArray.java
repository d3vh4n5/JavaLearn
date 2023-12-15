package clase22;

/*
 * Arrays
 * Declaracion, instanciacion, inicializacion.
 * operaciones y metodos
 * todo aray se importa de java.lang.*
 */


public class MiArray {
    public static void main(String[] args) {
        // Declaración ed un array

        int[]  numeros;// Convenciond e nombre todo array se lo nombre con palabras en plural

        // Instanciacion (inicializacion) del objeto
        numeros = new int[3]; // cantidad de datos a almacenar

        // Carga de datos, son las altas
        numeros[0] = 123;
        numeros[1] = 23;
        numeros[2] = 12;

        // Declaracion de un array numérico en una sola línea
        int[] otrosNumeros = {444, 222, 111, 437, 311};

        System.out.println(otrosNumeros[3]);

        // Array de string

        String[] frutas = {"Manzana", "Pera", "Banana"};

        System.out.println("Los elementos de fruta son: ");

        for (int i = 0; i<frutas.length; i++){
            System.out.println(frutas[i]);
        }
    }
}
