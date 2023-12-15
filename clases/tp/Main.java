package tp;

import tp.clases.Bienvenida;
import tp.functions.Consola;

/**
 * @program: Cajero Automático (home-banking)
 * @date: Nov-2023
 * @author: JAB
 * @version: 1.0
 */

public class Main {
    public static void main(String[] args) {
        // programa principal / punto de acceso a la app
        Consola.limpiar();
        Bienvenida.iniciarPrograma();
    }
}
