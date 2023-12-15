package JavaFS;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EscribirArchivo {
    public static void main(String[] args) {
        // Ruta del nuevo archivo
        String rutaNuevoArchivo = "JavaFS/ruta_del_nuevo_archivo.txt";

        // Contenido que deseas agregar en la línea 3
        String contenidoNuevo = "Nuevo contenido para la línea 3";

        // Número de línea que deseas modificar
        int numeroDeLineaModificar = 3;

        try {
            // Leer el contenido actual del archivo (si existe)
            List<String> lineas = new ArrayList<>();
            if (new File(rutaNuevoArchivo).exists()) {
                try (BufferedReader lector = new BufferedReader(new FileReader(rutaNuevoArchivo))) {
                    String linea;
                    while ((linea = lector.readLine()) != null) {
                        lineas.add(linea);
                    }
                }
            }

            // Modificar la línea deseada o agregar nuevas líneas si es necesario
            if (lineas.size() >= numeroDeLineaModificar) {
                lineas.set(numeroDeLineaModificar - 1, contenidoNuevo);
            } else {
                // Si no hay suficientes líneas, agregar líneas vacías hasta llegar a la línea deseada
                while (lineas.size() < numeroDeLineaModificar - 1) {
                    lineas.add("");
                }
                // Agregar el contenido en la línea deseada
                lineas.add(contenidoNuevo);
            }

            // Escribir el contenido modificado en el nuevo archivo
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaNuevoArchivo))) {
                for (String linea : lineas) {
                    escritor.write(linea);
                    escritor.newLine();
                }
            }

            System.out.println("Contenido agregado correctamente en la línea " + numeroDeLineaModificar + " del nuevo archivo.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
