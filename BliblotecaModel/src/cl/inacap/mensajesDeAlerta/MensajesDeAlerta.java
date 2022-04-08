package cl.inacap.mensajesDeAlerta;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author josem
 */
public class MensajesDeAlerta {

    public boolean cerrar() {
        boolean cerrar = false;
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(null, "Está seguro que desea salir", "Alerta",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            cerrar = true;
        }
        return cerrar;
    }

    public boolean confirmarEliminarDistribuidor() {
        boolean eliminar = false;
        Object[] opciones = {"Aceptar", "Cancelar"};
        Icon ima = new ImageIcon(getClass().getResource("/Imagenes/pregunta 2.png"));
        int eleccion = JOptionPane.showOptionDialog(null, "¿Esta seguro que desea eliminar el registro de este distri"
                + "buidor?", "Alerta",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, ima, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            eliminar = true;
        }
        return eliminar;
    }

        public boolean confirmarMsg(String mensaje) {
        boolean eliminar = false;
        Object[] opciones = {"Aceptar", "Cancelar"};
        Icon ima = new ImageIcon(getClass().getResource("/Imagenes/pregunta 2.png"));
        int eleccion = JOptionPane.showOptionDialog(null, mensaje, "Alerta",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, ima, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            eliminar = true;
        }
        return eliminar;
    }
        
    public void advertencia(String mensaje) {
         UIManager UI = new UIManager();
            UI.put("OptionPane.background", new ColorUIResource(255, 255, 255));
            UI.put("Panel.background", new ColorUIResource(255, 255, 255));
        Icon ima = new ImageIcon(getClass().getResource("/Imagenes/error.png"));
        JOptionPane.showMessageDialog(null, mensaje, "", JOptionPane.INFORMATION_MESSAGE, ima);
    }
}
