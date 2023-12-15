package moure;
import java.sql.Array;

public class Main {
    public static void main(String[] args){
        // Comentario de línea
        /*
         * Comentario
         * multi
         * linea 
         *
         */
        System.out.println("Hola, Java!");
        
        String myString = "Esto es un string";
        myString = "Aquí le doy otro valor";
        
        System.out.println(myString);

        // Los dos tipos de enteros:
        int myInt = 7;
        Integer myInt2 = 8;

        myInt = myInt + 55;

        System.out.println(myInt);
        System.out.println(myInt - 10);
        System.out.println(myInt - 10 + myInt2);

        // Double

        Double myDouble = 6d;
        Double myDouble2 = 6.5;
        System.out.println(myDouble);
        System.out.println(myDouble2);
        
        // Long
        
        //Float
        
        Float myFloat = 6.5f;
        System.out.println(myFloat);


        System.out.println(myDouble + myFloat);
        System.out.println(myDouble + myInt);
        System.out.println(myDouble + myInt + myString);

        // Boolean

        Boolean myBoolean = Boolean.TRUE;
        Boolean myBoolean2 = true;
        System.out.println(myBoolean);
        System.out.println(myBoolean2);
        
        myBoolean = null;
        System.out.println(myBoolean);
        // Esto da error:
        // System.out.println(myBoolean + 10);

        // CONDICIONALES

        if (myBoolean != null) {
            System.out.println("No es nulo");
        } else if (myInt == 3){
            System.out.println("Tas igual");
        } else {
            System.out.println("Es nulo");
        }

        // Array eSTO TE IMPORTA UNA CLASE ARRIBA
        // Array myArray = new Array() {
            
        // };

        // Mejor usar esto
        // Continuar https://www.youtube.com/watch?v=W86KTBSiX2o
        // El github: https://github.com/mouredev/one-day-one-language



    }
}