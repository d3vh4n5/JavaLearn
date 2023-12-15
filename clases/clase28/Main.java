package clase28;

public class Main {
    public static void main(String[] args) {
        Imprimir.texto("Ingrese el valor del radio");
        double radio = Sistema.tecladoNumero();
        Imprimir.texto("Ingrese el valor de la altura");
        double altura = Sistema.tecladoNumero();

        Imprimir.texto("La superficie del cilindro es: ");
        Imprimir.numero(Cilindro.superficie(radio, altura));
    }
}
