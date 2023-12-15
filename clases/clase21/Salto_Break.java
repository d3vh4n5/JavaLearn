package clase21;

public class Salto_Break {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++){
            if (i == 2) {
                System.out.println("Hice "+i+" itecaciones y corté");
                break;
            }
            System.out.println("Iteración: "+i);
        }
    }
}
