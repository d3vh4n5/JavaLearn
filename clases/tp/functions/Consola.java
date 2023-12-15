package tp.functions;
import java.io.IOException;

/**
 * @fuente: internet
 */

public class Consola {

    public static void limpiar() {
        String os = System.getProperty("os.name").toLowerCase();

        try {
            ProcessBuilder processBuilder;

            if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                // Para sistemas Unix/Linux/Mac
                processBuilder = new ProcessBuilder("clear");
            } else if (os.contains("win")) {
                // Para sistemas Windows
                processBuilder = new ProcessBuilder("cmd", "/c", "cls");
            } else {
                // Sistema operativo no soportado
                return;
            }

            // Ejecutar el comando para limpiar la consola
            processBuilder.inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

