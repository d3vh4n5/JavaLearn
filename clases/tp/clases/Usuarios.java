package tp.clases;

import tp.functions.*;

public class Usuarios {
    public static int current;
    public static String[] usuarios = {"Juan Basgall", "Marcos Goyete", "Mateo Ferrari"};
    public static double saldos[] = {100000, 150000, 200000};
    public static String[] dnis = {"12345678", "23456789", "45632187"};
    public static String claves[] = {"1234", "4321", "1324"};
    public static int intentos = 3;

    public static void validarUsuario(){
        String dni, clave;

        Imprimir.texto("Por favor, ingrese su número de DNI:");
        dni = Teclado.texto();
        Imprimir.texto("Por favor, ingrese su clave numérica");
        clave = Teclado.texto();

        for (int i=0; i<dnis.length; i++){
            if (dni.equals(dnis[i])){
                if (clave.equals(claves[i])){
                    // Cargar el menú principal
                    Imprimir.texto("usuario y Clave coinciden, entrando al programa..");
                    Usuarios.current = i;
                    MenuPrincipal.mostrarMenu();
                    return;
                }
            }
        }
        if (intentos <= 1) {
            Consola.limpiar();
            Imprimir.texto("Intentos agotados");
            Imprimir.texto("Su tarjeta se ha bloqueado por seguridad");
            Imprimir.texto("Fin de la ejecución del programa");
        } else {
            intentos--;
            Consola.limpiar();
            Imprimir.texto("Usuario o Contraseña incorrectos");
            Imprimir.texto("Le quedan "+ intentos +" intentos");
            validarUsuario();
        }
    }

    public static String nombre(int indice){
        return usuarios[indice];
    }
    public static String dni(int indice){
        return dnis[indice];
    }
    public static double saldo(int indice){
        return saldos[indice];
    }
    public static void actualizarSaldo(double valor){
        saldos[current] = valor;
    }
}
