public class MetodoExtra {


    public static void animacionCarga() {
        for (int i = 0; i <= 100; i += 10) {
            System.out.print("\rCargando Sistema: " + i + "%"); // "\r" para reiniciar la línea. Actualizo el porcentaje
            try {
                Thread.sleep(500); // Tiempo de espera (en milisegundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\r¡Sistema Cargado!          "); // Mensaje de salida avisando de la carga
    }

    public static void cuentaRegresiva() {
        for (int i = 3; i > 0; i--) {
            System.out.print("\rEL SISTEMA SE CERRARÁ EN: " + i + " "); // El carácter "\r" reinicia la línea. Aviso de cierre.
            try {
                Thread.sleep(1000); // Tiempo de espera (en milisegundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\r*** EL SISTEMA SE HA CERRADO CORRECTAMENTE ***          "); // Mensaje final de cierre.
        System.out.println("");
    }
}
  