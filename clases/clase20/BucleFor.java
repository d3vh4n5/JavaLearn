package clase20;

public class BucleFor {
    public static void main(String[] args) {
        int n = 5;
        int acumulador = 1;

        for (int i = 1; i <= n ; i++){
            acumulador *= i;
        }

        System.out.println("Resltado: " + acumulador);
    }
}
