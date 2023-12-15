package clase25;

public class PasoPorReferencia {
    // utilizamos variables de clase
    public static double saldo = 100000.00;

    // método para transferir y actualizar la variable
    public static void transferir(double valor){
        saldo -= valor;
    }

    public static void main(String[] args) {
        System.out.println("El saldo inicial es: $"+saldo);

        //transferencia 1
        double valor = 5000.5;
        System.out.println("Transferimos $"+ valor);
        transferir(valor);
        System.out.println("Saldo actual: $"+saldo);
    }
}
