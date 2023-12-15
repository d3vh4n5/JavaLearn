package tp.clases;

import tp.functions.*;

public class MenuPrincipal {
    public static int indiceUsuario = Usuarios.current;

    public static void mostrarMenu(){


        Consola.limpiar();
        Imprimir.texto("======== Bienvenido, " + Usuarios.nombre(indiceUsuario));
        Imprimir.texto("""
                **********************************
                *             MENU               *
                *                                *
                *      1) Datos cuenta           *
                *      2) Consultar saldo        *
                *      3) Transferir             *
                *      4) Pagar Servicio         *
                *      0) Salir                  *
                *                                *
                **********************************
                """);
        Imprimir.texto("Por favor, elija una opcion...");
        // tomer los datos
        // switch para las opciones

        switch (Teclado.texto()) {
            case "1":
                datosUsuario();
                break;
            case "2":
                consultarSaldo();
                break;
            case "3":
                transferir();
                break;
            case "4":
                pagarServicio();
                break;
            case "0":
                Sistema.salir();
                break;
        
            default:
                mostrarMenu();
                Imprimir.texto("Opcion incorrecta, intente denuevo!");
                break;
        }
    }

    public static void datosUsuario(){
        Consola.limpiar();
        Imprimir.texto("Usuario: " + Usuarios.nombre(indiceUsuario));
        Imprimir.texto("DNI:     " + Usuarios.dni(indiceUsuario));
        Imprimir.texto("Saldo:   " + Usuarios.saldo(indiceUsuario));

        volver();
    }

    public static void consultarSaldo(){
        Consola.limpiar();
        Imprimir.texto("Saldo actual:   " + Usuarios.saldo(indiceUsuario));

        volver();
    }

    public static void transferir(){
        Consola.limpiar();
        Imprimir.texto("""
                Opciones:
                1) Transferir a contacto existente
                2) Agregar nuevo contacto
                3) Volver
                0) Salir
                """);
        
                switch (Teclado.texto()) {
                    case "1":
                        Transferencias.transferirSaldo();
                        break;
                    case "2":
                        Contactos.agregarContacto();
                        break;
                    case "3":
                        mostrarMenu();
                        break;
                    case "0":
                        Sistema.salir();
                        break;
                
                    default:
                        transferir();
                        Imprimir.texto("La opcion seleccionada es incorrecta, por favor intentelo denuevo: ");
                        break;
                }
    }

    public static void pagarServicio(){
        
    }

    public static void volver(){
        // Imprimir.texto("Que desea hacer?");
        Imprimir.texto("1) Volver");
        Imprimir.texto("0) Salir");

        switch (Teclado.texto()) {
            case "1":
                mostrarMenu();
                break;
            case "0":
                Sistema.salir();
                break;
        
            default:
                break;
        }
    }
}
