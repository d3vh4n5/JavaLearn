package JavaFS;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void main(String[] args) throws Exception {
        String ruta = "JavaFS/datos.txt";
        int txt;

        // FileInputStream archivo = new FileInputStream(ruta);
        // txt = archivo.read();
        // while (txt != -1) {
        //     System.out.println(txt);
        // }

        try (BufferedReader archivo = new BufferedReader(new FileReader(ruta))) {
            int caracter;
            while ((caracter = archivo.read()) != -1) {
                System.out.print((char) caracter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
         * Leer una línea en específico
         */

        try (BufferedReader archivo = new BufferedReader(new FileReader(ruta))) {
            int numeroDeLineaDeseado = 5;
            int numeroDeLineaActual = 1;
            
            String linea;
            while ((linea = archivo.readLine()) != null) {
                if (numeroDeLineaActual == numeroDeLineaDeseado) {
                    System.out.println("Contenido de la línea " + numeroDeLineaDeseado + ": " + linea);
                    break; // Puedes salir del bucle después de encontrar la línea deseada
                }
                numeroDeLineaActual++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
