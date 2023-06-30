package view;

import controller.ControllerNasabah;
import javax.swing.JOptionPane;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class ViewPrintNasabah {
    private ControllerNasabah controllerNasabah;

    public ViewPrintNasabah(ControllerNasabah controllerNasabah) {
        this.controllerNasabah = controllerNasabah;
    }
    
    public void DisplayNasabah(){
        String text = controllerNasabah.getTextNasabah();
        JOptionPane.showMessageDialog(null, text);
    }
    
    public void DisplayPembayaranByNIK () {
        String NIK = JOptionPane.showInputDialog(null, "input NIK");
        String text = controllerNasabah.GetTextPembayaran(NIK);
        JOptionPane.showMessageDialog(null, text);
    }
}
