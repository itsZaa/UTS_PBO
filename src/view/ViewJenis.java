package view;
import controller.ControllerNasabah;
import javax.swing.JOptionPane;

/**
 *
 * @author 1122015 - gregorius Reza
 */
public class ViewJenis {
    private ControllerNasabah controller;

    public ViewJenis(ControllerNasabah controller) {
        this.controller = controller;
    }
    
    public void ViewJenisMotor (){
        JOptionPane.showMessageDialog(null, controller.countJumlahMotor());
    }
    
    public void ViewJenisMobil (){
        JOptionPane.showMessageDialog(null, controller.countJumlahMobil());
    }
    
}
