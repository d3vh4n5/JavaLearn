package clase23;
import java.util.*;

public class MiArrayList {
    public static void main(String[] args) {
        // Decaración del arraylist
        ArrayList<String> autos; // el nombre de los arraylist seran palabras en plural

        // Instanciacion / inicialización

        autos = new ArrayList<String>();

        // ArrayList<String> autos = new ArrayList<String>(); declaracion instanciacion en 1 sola linea
        
        // métodos del array list
        // 1-Altas
        autos.add("Toyota"); // elementos e:
        autos.add("Volvo");
        autos.add("Ford");
        autos.add("VW");

        // 2- Consultamos e imprimimos el al completo

        System.out.println("El al de autos es: ");
        System.out.println(autos);

        // 3- Obtener la longitud de A list
        int longitud = autos.size();
        System.out.println("El array list tiene "+longitud+" elementos");

        // 4 - Agregamos elementos al Array List
        autos.add("Peugeot");
        // 5 agregamos un elemento en un undice específico
        autos.add(1, "Jeep");
        // No pise el valor del indice 1, sino que se pone en su lugar y empuja al resto
        System.out.println(autos);

        // 6 consultas, metodo get()
        System.out.println("El elemento 4 es:");
        System.out.println(autos.get(4));
        // System.out.println(autos[4]); esto no anda
        
        // 7 - Metodo set para actualizar un valor
        // este pisa el valor del indice
        autos.set(4, "Citroen");
        System.out.println("El nuevo elemento 4 es:");
        System.out.println(autos.get(4));
        
        // 8 - Remover elementos, baja de elementos .remove()
        autos.remove(0);
        System.out.println("El aray quedo: ");
        System.out.println(autos);

        // 9 - Podemos ordenar con los metodos Collections.sort() // Collections.reverse()
        Collections.sort(autos);
        System.out.println("AL ordenado: "+autos);
        Collections.reverse(autos);
        System.out.println("AL ordenado en reverso: "+autos);

        // 10 - Para allar el indice de un elemento .indexOf()
        System.out.println("El indice de jeep es:");
        System.out.println(autos.indexOf("Jeep"));

        // 11 - Buscamos un elemento dentro ed nuestro AL e imprimimos si el auto está en el listado
        // Bucle For Each
        String marca = "CITROEN";

        for(String auto : autos){
            // equalsignorecase ignora las mayusculas y minusculas
            if (auto.equalsIgnoreCase(marca)){ // .equals()
                System.out.println("El auto existe en AL");
            }
        }



    }
}
