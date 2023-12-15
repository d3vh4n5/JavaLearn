package clase27;

import clase27.cosas.Funciones;
import functions.Lejos;

/*
 * Este es el punto de acceso al proyecto
 * es el unico arcivo que contiene al método main ya que es el unico que permite que el archivo sea ejecutable
 */



public class Main {
    public static void main(String[] args) {
        // metodos en un archivo paralelo
        Metodos.imprimir("El programa se está inicializando..");
        Metodos.app();

        // metodo en un archivo de una carpeta paralela
        Funciones.otraCosa();
        
        // metodo en un archivo de una carpeta exterior paralela
        Lejos.reLejos();
    }
}
