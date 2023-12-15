public class Saldo {
    public static void  consultarSaldo(){
        FuncionesDeSistema.limpiarPantalla();
        System.out.println("Su Saldo es: $ "+BaseDeDatos.obtenerSaldos()+"\n \n");
        FuncionesDeSistema.salirVolver();
    }
}
