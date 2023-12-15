import java.util.ArrayList;

public class MenuTransferir {
    public static void menu1(){
        //------------------------------------------------------------------------
        //                                 MENU
        FuncionesDeSistema.limpiarPantalla();
        
        //---------------------------------------------------------------
        // para pasar el array list al menu
        ArrayList<String> contactos = ArrayL.arrayContactos(); // Llamas al método para obtener el ArrayList
        ArrayList<Integer> cBU = ArrayL.arrayCBU();
        // Inicializas la variable local
        String cero = ""; 
        String uno = "";
        String dos = "";
        String tres = "";
        int indice = 0; // Usamos esto para unir con el cbu los nombres
        int cbuCero = 000000;
        int cbuUno = 000000;
        int cbuDos = 000000;
        int cbuTres = 000000;
        // Copias el primer elemento del ArrayList a la variable local
        cero = contactos.get(0); 
        uno = contactos.get(1);
        dos = contactos.get(2);
        tres = contactos.get(3);
        cbuCero = cBU.get(0); 
        cbuUno = cBU.get(1);
        cbuDos = cBU.get(2);
        cbuTres = cBU.get(3);

        //-----------------------------------------------------------------------

        System.out.println("==== Bienvenido "+BaseDeDatos.obtenerNombre()+" ====");
        System.out.println("** SELECCIONE UNA OPCION PARA TRANSFERIR ** ");
        System.out.println("1) .- "+cero);
        System.out.println("2) .- "+uno);
        System.out.println("3) .- "+dos);
        System.out.println("4) .- "+tres);
        System.out.println("0) .- Salir");
       
        //-------------------------------------------------------------------------------
        // Guardamos la opcion seleccionada por el usuario en la variable opcion1
        int opcion1 = FuncionesDeSistema.ingresarOpcion();
                 switch (opcion1){
                case 1:
                    FuncionesDeSistema.limpiarPantalla();
                 System.out.println(cero);
                    System.out.println("CBU: "+cbuCero);
                    break;

                case 2:
                    FuncionesDeSistema.limpiarPantalla();
                    System.out.println(uno);
                    System.out.println("CBU: "+cbuUno);
                    break;
                case 3:
                    FuncionesDeSistema.limpiarPantalla();
                    System.out.println(dos);
                    System.out.println("CBU: "+cbuDos);
                    break;
                 case 4:
                    FuncionesDeSistema.limpiarPantalla();
                    FuncionesDeSistema.contactoNuevo();
                    FuncionesDeSistema.limpiarPantalla();
                     System.out.println(tres);
                    if (cbuTres > 0) {
                     System.out.println("CBU: "+cbuTres);
                    }
                    break;
                case 0:
                   Menu.menu();
                default:
                    System.out.println("ERROR!!: Selecione la opcion deseada oprimiendo el numero a la izquierda del menu\n");
                    menu1();
                    break;
            
            }
    }
}
