public class PagarServicios {
    public static void pagarServicios(){
        FuncionesDeSistema.limpiarPantalla();
        double importe = 0;
        System.out.println("1) .- Telefonia");
        System.out.println("2) .- Luz");
        System.out.println("3) .- Agua");
        System.out.println("4) .- Gas");
        System.out.println("0) .- Volver al menu principal");
        int opcion = FuncionesDeSistema.ingresarOpcion();
        switch (opcion){
            case 0:
                Menu.menu();
                break;
            case 1,2,3,4:
                importe = FuncionesDeSistema.ingresarImporte("abonar");
                break;
            default:
                System.out.println("ERROR!!! Ingrese la opcion deseada utilizando los numeros a la izquierda");
                pagarServicios();
                break;
        }
        FuncionesDeSistema.verificarSaldo(importe);
        System.out.println("Pago Efectuado");
        BaseDeDatos.actualizarSaldos(importe);
        System.out.println("Su nuevo saldo es de $"+BaseDeDatos.obtenerSaldos());
        FuncionesDeSistema.salirVolver();
       }
    }
