import java.io.*;
import java.util.ArrayList;

public class Datos {

    public static void main(String[] args) {
        // Crear una ArrayList de ejemplo
        ArrayList<String> listaDeDatos = new ArrayList<>();
        listaDeDatos.add("Dato 1");
        listaDeDatos.add("Dato 2");
        listaDeDatos.add("Dato 3");

        // Guardar la ArrayList en un archivo .dat
        guardarArrayListEnDat(listaDeDatos, "archivo.dat");

        // Leer la ArrayList desde el archivo .dat
        ArrayList<String> listaRecuperada = leerArrayListDesdeDat("archivo.dat");

        // Mostrar la lista recuperada
        for (String dato : listaRecuperada) {
            System.out.println(dato);
        }
    }

    // Método para guardar la ArrayList en un archivo .dat
    private static void guardarArrayListEnDat(ArrayList<String> lista, String nombreArchivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            outputStream.writeObject(lista);
            System.out.println("ArrayList guardada en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para leer la ArrayList desde un archivo .dat
    private static ArrayList<String> leerArrayListDesdeDat(String nombreArchivo) {
        ArrayList<String> listaRecuperada = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaRecuperada = (ArrayList<String>) inputStream.readObject();
            System.out.println("ArrayList recuperada desde " + nombreArchivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaRecuperada;
    }
}
