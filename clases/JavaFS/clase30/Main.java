package JavaFS.clase30;

public class Main {
    public static void main(String[] args) {

        // Instancio la clase Perro
        Perro perro1 = new Perro();
        perro1.nombre = "Luna";

        // Instancio a la clase Gato
        Gato patita = new Gato("Pati", 32);
        Gato coli = new Gato("Coli", 55);
        Gato china = new Gato("China", 15);

        // Array de tipo gato
        Gato[] gatos = {patita, coli, china};

        for(Gato gato : gatos){
            System.out.println("Nombre: " + gato.nombre);
        }

        // Instancio Aves
        Ave twity = new Ave("Twity", 3);
        System.out.println(twity.getNombre());
    }
}
