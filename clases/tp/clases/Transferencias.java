package tp.clases;

import tp.functions.*;

public class Transferencias {
    public static void transferirSaldo(){
        int target;
        double valor;
        

        Consola.limpiar();
        Imprimir.texto("Contactos actuales: ");
        Contactos.imprimirUsuarios();

        Imprimir.texto("Elija el contacto de destino: ");
        target = Teclado.numeroEntero();
        Teclado.limpiar();

        Consola.limpiar();

        Imprimir.texto("Introduzca el valor a transferir");
        valor = Teclado.numero();
        Teclado.limpiar();

        confirmar(target, valor);

    }

    public static void realizarTransferencia(int target, double valor){
        double saldo = Usuarios.saldo(Usuarios.current);

        if (!(valor <= saldo)){
            Imprimir.texto("La operación no puede realizarse por falta de fondos");
            Imprimir.texto("Presione una tecla para contienuar..");
            Teclado.texto();
            MenuPrincipal.mostrarMenu();
        } else {
            saldo = saldo - valor;
            Usuarios.actualizarSaldo(saldo);
            Imprimir.texto("Transferencia realizada con exito a ");
            Imprimir.textoContinuo(Contactos.obtenerContacto(target));
            Imprimir.textoContinuo(" por el valor de "+valor);
            Imprimir.texto("Su saldo restante es de: $"+ saldo);
            Imprimir.texto("Presione una tecla para volver al menú");
            Teclado.texto();
            MenuPrincipal.mostrarMenu();
        }
    }

    public static void confirmar(int target, double valor){
        Consola.limpiar();

        Imprimir.texto("Se realizará una transferencia al contacto: ");
        Imprimir.texto("Nombre: " + Contactos.obtenerContacto(target));
        Imprimir.texto("CBU: " + Contactos.obtenerCBU(target));
        Imprimir.texto("Por el valor de $"+valor);

        Imprimir.texto("""
                Confirmar operación?
                s) SI
                n) NO
                """);


        switch (Teclado.texto()) {
            case "s":
                realizarTransferencia(target, valor);
                break;
            case "n":
                MenuPrincipal.mostrarMenu();
                break;
        
            default:
                transferirSaldo();
                System.out.println("Opcion incorrecta, vuelva a intentar");
                break;
        }
    }
}
