/*
 * Aqui cargamos los datos de todos los usuarios que tiene el banco
 */

public class BaseDeDatos {
    // ------------------------------------------------------------------------------
    // Declaracion e instanciacion de la informacion de los usuarios en Array
    public static int dniUsuarios[] = { 12345678, 23456789, 34567890 };
    public static String claveUsuarios[] = { "1234", "2345", "3456" };
    public static String datosUsuarios[] = { "Fulanito", "Menganito", "Natalia Natalia" };
    public static double saldosUsuarios[] = { 170000, 150000, 180000 };
    // ------------------------------------------------------------------------------
    // Declaro variable para identificar el usuaro que esta operando
    public static int indiceUsuario;

    // Se recorre el Array par ver si el dni ingresado esta en la base de datos
    public static boolean validarDNI(int dni) {
        for (int indice = 0; indice < dniUsuarios.length; indice++) {
            if (dniUsuarios[indice] == dni) {
                indiceUsuario = indice; // Para saber que indice corresponde al usuario ingresado
                return true;
            }
        }
        return false; // Devuelve verdadero a validarDNI
    }
    // -----------------------------------------------------------------------------

    // ---------------------------------------------------------------------------
    // Devuelve el nombre del usuario logueado utilizando el indice
    public static String obtenerNombre() {
        return datosUsuarios[indiceUsuario];
    }
    // --------------------------------------------------------------------------

    // --------------------------------------------------------------------------
    // Devuelve el saldo del usuario logueado utilizando el indice
    public static double obtenerSaldos() {
        return saldosUsuarios[indiceUsuario];
    }
    // ---------------------------------------------------------------------------

    // ---------------------------------------------------------------------------
    // Actualizo el saldo del usuario.
    public static void actualizarSaldos(double importeTransferido) {
        saldosUsuarios[indiceUsuario] -= importeTransferido;
    }
    // ---------------------------------------------------------------------------

    public static boolean validarClave(String clave) {
        return claveUsuarios[indiceUsuario].equals(clave);
    }

}
