//  CRUID

import java.io.*;
import java.util.ArrayList;
import paquete.*;

/**
 * @Documented Tema Biblioteca io y excepciones
 * Flujas de entrada y salida de objetos
 * @dominio Codo a Codo Inicial 2023
 * @autor Juan
 */

/*
 * Creamos un arraylist y lo almacenamos en un archivo .dat
 */

public class Crear implements Serializable { // Le damos la capacidad de descomponer un objeto en bits
    // 1 - Objeto (variable) de clase
    public static ArrayList<String> productos = new ArrayList<>();

    //2 - Creamos el metodo para crear el objeto ArrayList
    public static void lista(String nombreArchivo) throws IOException{ // Mala practica, hace falta un try catch, pero por temas d etiempolo sfamos así
        // 1 - Inicializamos al ArrayList y lo cargamos
        Listado.setLista(productos);

        // 2 - Guardamos el ArrayList en local
        //2.1 - Creamos el archvo que recibirá al objeto AL
        File archivo = new File("./"+nombreArchivo+".dat");
        //2.2 - Creamos el stream (cañería de conexión)
        FileOutputStream archivoSalida = new FileOutputStream(archivo);
        //2.3 - Preparamos nuestro objeto Alist para serializarlo
        ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);

        //2.4 - Proceso de escritura ene l disco .writeObject
        objetoSalida.writeObject(productos);

        // 2.5 Cerramos los objetos
        archivoSalida.close();
        objetoSalida.close();
        // El archivo no se cierra porque está ocupando espacio en disco, no en memoria.
        

    }

    public static void main(String[] args) throws IOException{ // Esto es mala practica pero es solo para probar, deberíamos tener unos try - catch bien desarrollados
        lista("miLista");
    }

}
