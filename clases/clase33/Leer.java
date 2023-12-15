import java.io.*;
import java.util.ArrayList;
import paquete.*;

/*
 * Lectura de un archivo de un objeto AL
 * El proceso de lectura es paralelo al proceso ed escritura,
 * por lo que leer objetos del flujo de entrada ObjectInputStream es muy simple en este práctico
 * veremos sus pasos.
 */

public class Leer {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        // 1 - Trabajamos con la clase File para encontrar el archivo
        File archivo = new File("miLista.dat");

        // 1.2 - Generamos la conexión, la cañería desde nuestro disco al código

        FileInputStream archivoEntrada = new FileInputStream(archivo);

        //1.3 - Componemos el objeto y lo preparamos para darle forma de ArrayList


        ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);

        // 1.4 - le devolvemos al forma (tipo) al objeto mediante un casteo explicito
        
        ArrayList<String> productos = (ArrayList<String>) objetoEntrada.readObject();

        //2- Proceso
        // nos valemos de un for-each
        for(String producto : productos){
            Imprimir.texto(producto);
        }

        // 3 - Cierre de los objetos
        archivoEntrada.close();
        objetoEntrada.close();




    }
}
