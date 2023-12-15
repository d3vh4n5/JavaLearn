package clase24;

public class MiFuncion {
    // Zona de funciones - metodos - procedimientos

    // public: modificador de acceso
    // static: tiene un solo lugar en la memoria, no ocupa un lugar nuevo cada vez que se utiliza
    // void: Devuelve "NADA", o sea que es un procedimiento
    public static void imprimir(){
        System.out.println("Hola mundo!!");
    }

    // Sobrecarga del método (usar el mismo nombre del metodo anterior pero cambiarle los parámetros)

    // public static void imprimir(String nombre){
    //     System.out.println("Hola "+nombre+"!!!");
    // }

    // Sobrecarga del metodo, Hacemos una suma

    public static void imprimir(int num1, int num2){
        System.out.println("Resltado de la suma: " + (num1 + num2));
    }

    // Imprimir textos
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    public static void main(String[] args) {
        imprimir();
        imprimir("Juan");
        imprimir(5, 6);
        
    }
}
