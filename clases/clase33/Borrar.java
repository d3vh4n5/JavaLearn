import java.io.*;
import java.util.ArrayList;
import paquete.*;

public class Borrar {
    public static void main(String[] args) {
        //1- Localizamos el archivo a borrar mediente la clase File
        File archivo = new File("miLista.dat");

        //2- Proceso, nos valemos de un if-else para asegurarnos de que exista
        if(archivo.exists()){
            //Proceso
            archivo.delete(); // se borra comcretamente el archivo
            System.out.println("Archivo borrado con éxito");
        }else{
            System.out.println("El archivo no se encontró, no se puede realizar la operación de borrado.");
        }
    }
}
