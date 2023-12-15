package paquete;

//importacion
import java.util.ArrayList;

public class Listado {
    
    public static void setLista(ArrayList<String> nombreAL){
        //Instruccion de salida entrada
        Imprimir.texto("Cuantos productos desea ingresar?");
        int cantidad = Teclado.numero();
        Teclado.limpiar();
        // Carga de datos
        for(int i=0; i<cantidad; i++){
            Imprimir.texto("Ingrese el producto "+(i+1));
            String producto = Teclado.texto();
            nombreAL.add(producto);
        }
    }
}
