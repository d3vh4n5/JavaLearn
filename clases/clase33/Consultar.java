import java.io.*;
import java.util.ArrayList;
import paquete.*;

/*
 * Este ´rograma me permite consultar un listado de compras almacenado en un archivo
 * utilizamos funcuones
 * En este ejemplo no se propagan ni gestionan excepciones
 */

public class Consultar {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1 - Trabajamos con la clase File para encontrar el archivo
        File archivo = new File("miLista.dat");

        // 1.2 - Generamos la conexión, la cañería desde nuestro disco al código

        FileInputStream archivoEntrada = new FileInputStream(archivo);

        //1.3 - Componemos el objeto y lo preparamos para darle forma de ArrayList


        ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);

        // 1.4 - le devolvemos al forma (tipo) al objeto mediante un casteo explicito
        
        ArrayList<String> productos = (ArrayList<String>) objetoEntrada.readObject();

        //2- Proceso
        System.out.println("Busco pan");
        Metodo.buscar(productos, "pan");
        System.out.println("Busco Tomate");
        Metodo.buscar(productos, "tomate");
        System.out.println("Busco Leche");
        Metodo.buscar(productos, "leche");

        // Cerramos los objetos
        archivoEntrada.close();
        objetoEntrada.close();

    }
}
