import java.util.ArrayList;
import java.util.Scanner;

public class Contactos {
    public static ArrayList<String> contactos = new ArrayList<String>();
    public static ArrayList<String> cbus = new ArrayList<String>();

    public static void inicializar(){
        if (contactos.size() == 0){
            contactos.add("Carlos");
            contactos.add("Luis");
            contactos.add("Juan");
            // cbus
            cbus.add("111111");
            cbus.add("222222");
            cbus.add("333333");
        }
    }

    public static void agregarContacto(String nombre, String cbu){
        System.out.println("Ingrese el nombre del nuevo contacto: ");
        contactos.add(nombre);
        System.out.println("Ingrese el CBU del nuevo contacto: ");
        cbus.add(cbu);

        // Opcionalmente validar si se quiere agregar antes o despues del mensaje
        System.out.println("Se agrego al contacto: ");
        System.out.println(nombre);
        System.out.println(cbu);
    }

    public static ArrayList<String> obtenerContactos(){
        return contactos;
    }

    public static ArrayList<String> obtenerCBUS(){
        return cbus;
    }

    public static void imprimirUsuarios(){
        for (String contacto: contactos){
            System.out.println(
                contactos.indexOf(contacto) + ") " + contacto
                + " - CBU: " +cbus.get(contactos.indexOf(contacto))
                );
        }
    }

    // Eliminar el metodo main, es solo para la prueba local
    public static void main(String[] args){
        inicializar();
        
        System.out.println("A que usuario desea transferir?");
        imprimirUsuarios();

        // scanner para tomar el numero de usuario a transferir que termina 
        // siendo igual al indice del usuario, por lo tanto, usar ese numero-indice
        // para realizar la operación de transferencia

        System.out.println("Vamos a agregar un usuario: ");
        System.out.println("Opcion 1 2 3 etc..");

        // parte del scanner, reemplazar esto por tu funcion custom si la tenes
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        
        // esto en realidad sería tu menú
        switch (entrada) {
            case "1":
                System.out.println("Pone el nombre guacho: ");
                String nombre = input.nextLine();
                System.out.println("Pasame el CBU: ");
                String cbu = input.nextLine();
                agregarContacto(nombre, cbu);
                break;
        
            default:
                break;
        }
        // imprimo apra ver que se agrego correctamente
        imprimirUsuarios();

        /*
         * 
         * REPITO TODO PARA VER QUE PUEDO AGREGAR VARIOS CONTACTOS
         * (esto debe estar modularizado y prolijo, hace algo vos gil)
         */

         // esto en realidad sería tu menú
        switch (entrada) {
            case "1":
                System.out.println("Pone el nombre guacho: ");
                String nombre = input.nextLine();
                System.out.println("Pasame el CBU: ");
                String cbu = input.nextLine();
                agregarContacto(nombre, cbu);
                break;
        
            default:
                break;
        }
        // imprimo apra ver que se agrego correctamente
        imprimirUsuarios();




    }

}
