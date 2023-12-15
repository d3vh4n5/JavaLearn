public class Transferir {
    public static void transferirFondos(){
        MenuTransferir.menu1();
        double importe = FuncionesDeSistema.ingresarImporte("transferir");
        FuncionesDeSistema.verificarSaldo(importe);
        FuncionesDeSistema.limpiarPantalla();
        System.out.println("Transferencia realizada con exito!!!");
        System.out.println("$ "+importe+" fueron transferidos al CBU N° FALTA ESTO ");
        BaseDeDatos.actualizarSaldos(importe);
        System.out.println("Su nuevo saldo es de $"+BaseDeDatos.obtenerSaldos());
        FuncionesDeSistema.salirVolver();
        
    }  
    
}
