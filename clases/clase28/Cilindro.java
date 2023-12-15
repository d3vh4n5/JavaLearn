package clase28;

public class Cilindro {
    // hallar la sup del cilindro
    // Para diseñar los parámetros circulo pide radio
    // rectangulo  nos pide altura, base = perimetro del circulo
    public static double superficie(double radio, double altura){
        // Hallamos las sup de tapa y piso
        double supCirculo = 2*Circulo.superficie(radio);
        // Hallamos el lado mayor del rectangulo de piel
        double base = Circulo.perimetro(radio);
        // Hallamos la sup del rectángulo
        double supRectangulo = Rectangulo.superficie(base, altura);
        // Retorno
        return supCirculo + supRectangulo;
    }
}
