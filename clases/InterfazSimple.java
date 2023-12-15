import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// Ejemplo de Interfaz usando Swing

public class InterfazSimple {

    public static void main(String[] args) {
        // Crear un marco (frame) principal
        JFrame frame = new JFrame("Ejemplo de Interfaz Simple");
        frame.setSize(300, 200); // Establecer el tamaño del marco
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Configurar el cierre de la aplicación al cerrar el marco

        // Crear un panel
        JPanel panel = new JPanel();

        // Crear componentes (por ejemplo, etiquetas y botones)
        JLabel label = new JLabel("¡Hola, mundo!");
        JButton button = new JButton("Haz clic");

        // Agregar componentes al panel
        panel.add(label);
        panel.add(button);

        // Agregar el panel al marco
        frame.add(panel);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}