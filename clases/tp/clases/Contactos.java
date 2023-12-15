package tp.clases;

import java.util.ArrayList;
import java.util.Arrays;

import tp.functions.*;

public class Contactos {
    public static ArrayList<String> contactos = new ArrayList<>(Arrays.asList("Carlos", "Luis", "Juan"));
    public static ArrayList<String> cbus = new ArrayList<>(Arrays.asList("111111", "222222", "333333"));

    public static void agregarContacto(){
        System.out.println("Ingrese el nombre del nuevo contacto: ");
        String nombre = Teclado.texto();
        System.out.println("Ingrese el CBU del nuevo contacto: ");
        String cbu = Teclado.texto();
        contactos.add(nombre);
        cbus.add(cbu);

        Consola.limpiar();
        // Opcionalmente validar si se quiere agregar antes o despues del mensaje
        System.out.println("Se agrego al contacto: ");
        System.out.println(nombre);
        System.out.println(cbu);
        Imprimir.texto("Presione una tecla para continuar..");
        Teclado.texto();
        MenuPrincipal.transferir();
    }

    public static ArrayList<String> obtenerContactos(){
        return contactos;
    }
    
    public static String obtenerContacto(int indice){
        return contactos.get(indice);
    }
    
    public static ArrayList<String> obtenerCBUS(){
        return cbus;
    }

    public static String obtenerCBU(int indice){
        return cbus.get(indice);
    }

    public static void imprimirUsuarios(){
        for (String contacto: contactos){
            System.out.println(
                contactos.indexOf(contacto) + ") " + contacto
                + " - CBU: " +cbus.get(contactos.indexOf(contacto))
                );
        }
    }
}

