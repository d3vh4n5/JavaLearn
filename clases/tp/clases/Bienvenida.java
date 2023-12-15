package tp.clases;

import clase28.Imprimir;

public class Bienvenida {
    public static void iniciarPrograma(){
        Imprimir.texto("""
                **********************************
                *                                *
                *      Bienvenido a BanCode      *
                *                                *
                **********************************
                """);

        // fUNCIÓN DE menú de inicio
        Usuarios.validarUsuario();
    }
}
