package clase19;
import java.util.*;

public class Menu {
    public static void main(String[] args) {
        // Variables
        Scanner input;
        input = new Scanner(System.in);

        String opcion;

        
        //dISEÑO DEL MENÚ
        
        System.out.println("***** MENU *****");
        System.out.println("1 si queire un saludo");
        System.out.println("2 si quiere un regalo");
        System.out.println("3 si quiere un dólar");
        
        System.out.println("Ingrese la opción que desea: ");
        opcion = input.nextLine();
        input.close();
        
        // Switch

        switch (opcion) {
            case "1":
                System.out.println("Hola papito");
                break;
            case "2":
                System.out.println("Te ganaste una hilux");
                break;
            case "3":
                System.out.println("Ganaste algo que vale $955 argentinos");
                break;
        
            default:
            System.out.println("Opcion incorrecta!");
            // Aquí llamaria la funcion denuevo si fuera una función
                break;
        }
        
    }
}
