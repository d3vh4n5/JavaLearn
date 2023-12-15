package clase25;

public class PasoPorValor {
    /*
     * El paso por valor indica que el valor original de una
     * variable no se modifica
     */

    public static void transferir(double saldo, double valor){
        saldo -= valor;
    }
    public static void main(String[] args) {
        double saldo = 100000.00;

        // transferencia 1
        transferir(saldo, 25000.5);
        System.out.println("Su saldo es: ");
        System.out.println(saldo);
    }
}
