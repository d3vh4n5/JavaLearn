/*@Tema: Trabajo Final Integrador
*@date: 02/11/2023
*Comision: 23597
*@author: Grupo sin nombre /// TENEMOS QUE PONERLE UN NOMBRE!!!!
*@version: 1.1
*/
/*El programa posee 3 usuarios, tienen 3 intentos para ingresar al sistema.-
*Los Usuarios y contraseñas cargados son :
*DNI 12345678 --> 1234 
*DNI 23456789 --> 2345
*DNI 34567890 --> 3456
*/
 
/*
*Esta es la clase principal que inicia el programa
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        FuncionesDeSistema.limpiarPantalla();
       // MetodoExtra.animacion();
        FuncionesDeSistema.bienvenido(); // Funcion que imprime el mensaje de bienvenida
        Thread.sleep(1000);  // Retardo para dar mejor experiencia al usuario
        MetodoExtra.animacionCarga();
        LogIn.logIn(); // Llama al metodo logIn para loguear
    }
}