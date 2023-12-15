package clase20;

public class BucleDoWhile {
    public static void main(String[] args){
        int n = 5;
        int acumulador = 1;
        int contador = 1;

        do {
            acumulador *= contador;
            contador++;
        } while (contador <= n);

        System.out.println("Resultado: "+ acumulador);
    }
}
