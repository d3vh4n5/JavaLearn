public class Menu {
    public static void menu(){
        //------------------------------------------------------------------------
        //                                 MENU
        FuncionesDeSistema.limpiarPantalla();
        System.out.println("==== Bienvenido "+BaseDeDatos.obtenerNombre()+" ====");
        System.out.println("** SELECCIONE UNA OPCION ** ");
        System.out.println("1) .- Saldo Caja de Ahorro");
        System.out.println("2) .- Transferencias");
        System.out.println("3) .- Pago Mis Cuentas");
        System.out.println("0) .- Salir");
        //-------------------------------------------------------------------------------
        // Guardamos la opcion seleccionada por el usuario en la variable opcion
        int opcion = FuncionesDeSistema.ingresarOpcion();
        // Llamo a la funcion encargada de manejar las opciones, y le envio la opcion seleccionada
        seleccionarOperacion(opcion);
    }
        //--------------------------------------------------------------------------------
        //                              SELECCION DE OPERACION 
        public static void seleccionarOperacion(int opcion){
            switch (opcion){
                case 1:
                     FuncionesDeSistema.limpiarPantalla();
                     System.out.println("Consultar Saldos:");
                    Saldo.consultarSaldo();
                    break;
                case 2:
                    FuncionesDeSistema.limpiarPantalla();
                    System.out.println("Transferir Fondos");
                    Transferir.transferirFondos();
                    break;
                case 3:
                    FuncionesDeSistema.limpiarPantalla();
                    System.out.println("Pagar Servicios");
                    PagarServicios.pagarServicios();
                    break;
                case 0:
                    FuncionesDeSistema.limpiarPantalla();
                    FuncionesDeSistema.noOlvideSuTarjeta();
                default:
                    FuncionesDeSistema.limpiarPantalla();
                    System.out.println("ERROR!!: Selecione la opcion deseada oprimiendo el numero a la izquierda del menu\n");
                    menu();
                    break;
            }
    }

}
