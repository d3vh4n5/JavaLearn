import java.util.*;

/*
 * En esta clase se colocan las distintas funciones que se van llamando en el programa, sin importar el
 * el orden en que se llamen (Bienvenida, Login, Verificacion, etc)
 */

public class FuncionesDeSistema {
    // DECLARO E INSTANCIO EL OBJETO SCANNER.
    public static Scanner teclado = new Scanner(System.in);

    // ---------------------------------------------------------------------------------
    // SALUDO DE BIENVENIDA
    public static void bienvenido() {
        System.out.println("======> BIENVENIDO AL BANCO CODO A CODO <====== ");
    }

    // ----------------------------------------------------------------------------------
    // VALIDACION DEL USUARIO
    public static void ingresarDNI() {
        System.out.println("Ingrese su numero de DNI:");

        // Declaro e instancio variable dni, utilizo la funcion dniValido para guardar
        // en variable dni
        int dni = dniValido(
                "ERROR!!: Ustede debe ingresar su numero de DNI sin comas ni puntos.\nIngrese su numero de DNI:");

        // Valido el dni, si no esta en la base de datos, imprime mensaje de error y
        // vuelve a llamar a la funcion
        if (!BaseDeDatos.validarDNI(dni)) {
            System.out.println("Usuario ingresado no tiene cuentas asociadas en este Banco\n \n");
            System.out.println("=====================================================================================");
            // Volvemos a llamar al metodo ingresarDNI
            ingresarDNI();
        }
    }

    // -----------------------------------------------------------------------------------------------
    // VALIDAR QUE EL CLIENTE INGRESE NUMEROS ENTEROS
    // IMPRIME POR CONSOLA EL ERROR QUE RECIBE COMO PARAMETRO
    public static int dniValido(String mensageDeError) {
        // Mientras el valor ingresado no sea un INT, no cargo en dniValido el valor
        while (!teclado.hasNextInt()) { // hasNextInt devuelve true si el scanner contiene un int
            System.out.println(mensageDeError); // imprimo mensaje de error declarado en dniValido
            teclado.nextLine();
        }
        return teclado.nextInt(); // Cargo el valor ingresado en dniValido
    }

    // -------------------------------------------------------------------------------------------------
    // INGRESA LA CLAVE
    public static String ingresarClave() {
        System.out.println("Ingrese su clave numerica:");
        return teclado.next();
    }

    // ------------------------------------------------------------------------------------------------
    // OPCION SELECCIONADA
    public static int ingresarOpcion() {
        int opcion = validarDatoIngresado(
                "ERROR!!: Selecione la opcion deseada oprimiendo el numero a la izquierda del menu");
                        return opcion; // Cargo el valor de opcion en ingresarOpcion
    }

    // ---------------------------------------------------------------------------------------------------
    // VALIDAR QUE EL CLIENTE INGRESE NUMEROS ENTEROS
    // IMPRIME POR CONSOLA EL ERROR QUE RECIBE COMO PARAMETRO
    public static int validarDatoIngresado(String mensageDeError) {
        // MIENTRAS EL SCANNER NO TENGA UN NUMERO INT, SOLICITA QUE INGRESE UN NUMERO
        // INT.-
        while (!teclado.hasNextInt()) { // hasNextInt devuelve true si el scanner contiene un int
            System.out.println(mensageDeError); // imprimo mensaje de error declarado en validarDatoIngresado
            teclado.nextLine();
        }
        return teclado.nextInt(); // Cargo el valor ingresado en validarDatoIngresado
    }

    // ------------------------------------------------------------------------------------------------------
    // SALIR O VOLVER AL MENU PRINCIPAL
    /**
     * 
     */
    public static void salirVolver() {
        System.out.println("Seleccione una opcion");
        System.out.println("1) .- Volver");
        System.out.println("0) .- Salir");
        int opcion = FuncionesDeSistema.ingresarOpcion();
        if (opcion == 0) {
            FuncionesDeSistema.noOlvideSuTarjeta();
        } else if (opcion == 1) {
            Menu.menu();
        } else {
            System.out.println("ERROR!! Seleccione una opcion correcta!" + "\n");
            salirVolver();
        }
    }

    // ------------------------------------------------------------------------------------------------------
    // NO OLVIDE SU TARJETA
    public static void noOlvideSuTarjeta() {
        MetodoExtra.cuentaRegresiva();
        System.out.println("###############################################################");
        System.out.println("================= NO OLVIDE EXTRAER SU TARJETA ================");
        System.out.println("###############################################################");
        System.out.println("");
        System.out.println("");
        System.exit(0); //Agregamos un System.exit para que se cierre con éxito el programa
    }

    // -----------------------------------------------------------------------------------------------------
    // INGRESO CBU
    public static int ingresarCBU() {
        System.out.println("Ingrese  los 6 digitos del CBU al que desea transferir");
        int cbu = validarDatoIngresado("ERROR!! Ingrese numero de CBU sin puntos, comas ni caracteres especiales");
        if (cbu < 100000 || cbu > 999999) {
            System.out.println("ERROR!! CBU Invalido.\n");
            ingresarCBU();
        }
        return cbu; // Carga la variable cbu en ingresarCBU
    }

    // --------------------------------------------------------------------------------------------------------------
    // INGRESAR IMPORTE
    public static double ingresarImporte(String msg) {
        System.out.println("Ingrese el importe que desea " + msg);
        double importe = verificarImporteIngresado("ERROR!! Ingrese el importe utilizando el punto para los decimales");
        importe = validarImporte(importe);
        return importe;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // VERIFICAR IMPORTE INGRESADO
    public static double verificarImporteIngresado(String mensageDeError) {
        while (!teclado.hasNextDouble()) {
            System.out.println(mensageDeError);
            teclado.next();
        }
        return teclado.nextDouble();
    }

    // -----------------------------------------------------------------------------------------------------------------
    // VALIDAR IMPORTE
    public static double validarImporte(double importe) {
        System.out.println("Importe a debitar: $" + importe);
        System.out.println("1) Aceptar!");
        System.out.println("2) Corregir!");
        int opcion = ingresarOpcion();
        return validarImporteIngresado(opcion, importe);
    }

    // ----------------------------------------------------------------------------------------------------------------
    // VALIDAR IMPORTE INGRESADO
    public static double validarImporteIngresado(int opcion, double importe) {
        if (opcion == 1) {
            return importe;
        }
        if (opcion == 2) {
            return ingresarImporte("transferir");
        }
        System.out.println("ERROR!! Ingrese la opcion que desea utilizando los numeros a la izquierda \n");
        return validarImporte(importe);
    }

    // ----------------------------------------------------------------------------------------------------------
    // VERIFICAR SALDO
    public static void verificarSaldo(double importe) {
        if (BaseDeDatos.obtenerSaldos() < importe) {
            System.out.println("Saldo insuficiente para realizar la operacion");
            FuncionesDeSistema.salirVolver();
          }
    }

    // ---------------------------------------------------------------------------------------------------
    
    // ------------------------------------------------------------------------------------------------------
    // CUENTA BLOQUEADA
    public static void cuentaBloqueada() {
        // Si salimos del while es porque el usuario se quedo sin intentos , por lo que
        // su cuenta es bloqueada
        System.out.println("Por Seguridad su cuenta a sido bloqueada, comuniquece con el banco al 0810 555 2355.");
        FuncionesDeSistema.noOlvideSuTarjeta(); // Se imprime mensaje
        // LogIn.intentos = 3; // Reseteo el contador de intentos
        FuncionesDeSistema.salirVolver(); // Reiniciar Cajero
    }

    // ------------------------------------------------------------------------------------------------------
    // BORRAR PANTALLA
    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /* No hacer nada */
        }
        System.out.println("");
    }

    // ----------------------------------------------------------------------------
    // ------------------------------------------------------------------------------------------------
    // Pide un contacto nuevo y lo guarda en contactoNuevo
     public static String contactoNuevo() {
        System.out.println("Ingrese su contacto nuevo:");
        return teclado.next();
    }
 
}
