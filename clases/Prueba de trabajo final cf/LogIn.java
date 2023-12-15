/*
 * Esta clase procesa la validacion de usuario
 */
public class LogIn {
//-----------------------------------------------------------------------------------------------------------------
    public static void logIn() {
        // Declaro la variable "intentos", que se usara para bloquear el inicio de sesion
       int intentos = 3;

        //Se llama a la funcion encargada de solicitar el ingreso de usuario (DNI)
        FuncionesDeSistema.ingresarDNI(); 
        
        // Declaro y Almaceno la clave ingresada por el usuario
        String clave = FuncionesDeSistema.ingresarClave();
        
        //Logica para ver los intentos de ingreso
        do {
            if (BaseDeDatos.validarClave(clave)) {         // Verifico que la clave ingresada sea correcta
                intentos = 3;                              // Reseteo el contador de intentos
                Menu.menu();                               // Salto directo al menu principal
            } else {
                intentos--;                              // Restamos un intento
                System.out.println("Clave incorrecta, le quedan " + intentos + " intentos."); // Imprimo
                if (intentos != 0) {
                    clave = FuncionesDeSistema.ingresarClave(); // Vuelvo a solicitar la clave
                }
            }
        } while(intentos != 0);                         //  Cuando llego a 0 intentos, sigo y bloqueo cuenta
        
       FuncionesDeSistema.cuentaBloqueada();            // Funcion bloquear cuenta
    }
//--------------------------------------------------------------------------------------------------------------------

}
