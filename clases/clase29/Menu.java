package clase29;

public class Menu {
    public static void mostrarMenu(){
        // Diseño del menú
        Imprimir.texto("""
                **************************
                *    Menú Principal      *
                *    1. Opcion           *
                *    2. Opcion           *
                *    3. Salir            *
                **************************
                Seleccione una opción..
                """);

        String opcion = Teclado.texto();

        // Proceso mediante una estructura de switch

        // Usamos un return, para que en lugar de saltar el switch y continuar, 
        // directamente se termine la función
        switch (opcion){
            case "1":
                Imprimir.texto("Ha seleccionado la opcion 1");
                Imprimir.texto("Presione enter para volver al menú principal");
                Teclado.texto();
                mostrarMenu();
                return;
            case "2":
                Imprimir.texto("Ha seleccionado la opcion 2");
                Imprimir.texto("Presione enter para continuar");
                Teclado.texto();
                mostrarMenu();
                return;
            case "3":
                Imprimir.texto("Saliendo del programa..");
                return;
            default:
                Imprimir.texto("Opción no váida. Por favor ingrese una opción correcta.");
                // Recursividad
                mostrarMenu();
                return;
        }

        // Bloque de código fuera del switch

    }

}
