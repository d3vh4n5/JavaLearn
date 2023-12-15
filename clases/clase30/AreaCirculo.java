package clase30;

// Importamos las clases desde nuestra libreria
import clase30.paquete.Imprimir;
import clase30.paquete.Teclado;

public class AreaCirculo {
    public static void main(String[] args) {
        // Hallamos el area del circulo
        Imprimir.texto("Ingrese un valor de radio");
        double radio = Teclado.numero();
        Teclado.limpiar();
        Teclado.cerrar();

        // Proceso

        double superficie = Math.PI*Math.pow(radio, 2);

        Imprimir.texto("La superficie del circulo es: "+ superficie);
    }
}
