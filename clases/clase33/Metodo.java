import java.util.ArrayList;

public class Metodo {
    static void buscar(ArrayList<String> nombreAL, String miProducto){
        // Variables
        String buscador = miProducto;
        String encontrado = "";
        String noEncontrado = "";

        // For-each para buscar sobre el contenido
        for (String producto : nombreAL){
            if (producto.contains(buscador)){
                encontrado = producto;
            } else {
                noEncontrado = buscador;
            }
        }

        // Acciones en caso de encontrar o no
        if(!encontrado.isEmpty()){
            System.out.println("Tenes que comprar "+encontrado);
            return;
        }
        if (!noEncontrado.isEmpty()){
            System.out.println("No tenes que comprar "+noEncontrado);
            return;
        }
    }
}
