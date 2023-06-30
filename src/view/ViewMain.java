package view;

import controller.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class ViewMain {
    private ControllerNasabah controllerNasabah;
    private ControllerPeminjaman controllerPeminjaman;
    private ViewPrintNasabah viewPrintNasabah;
    private ViewJenis viewJenis;

    public ViewMain(ControllerNasabah controllerNasabah, ControllerPeminjaman controllerPeminjaman) {
        this.controllerNasabah = controllerNasabah;
        this.controllerPeminjaman = controllerPeminjaman;
        this.viewPrintNasabah = new ViewPrintNasabah(controllerNasabah);
        this.viewJenis = new ViewJenis(controllerNasabah);
    }
    
    public void MainMenu () {
        int menu = -1;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "1. print data nasabah\n2. printRiwayatPembayaran by NIK\n3. print jenis motor terbanyak\n4. print jenis mobil terbanyak\n0. Exit"));
            if (menu == 1) {
                viewPrintNasabah.DisplayNasabah();
            } else if (menu == 2) {
                viewPrintNasabah.DisplayPembayaranByNIK();
            } else if (menu == 3) {
                viewJenis.ViewJenisMotor();
            } else if (menu == 4) {
                viewJenis.ViewJenisMobil();
            }
        } while (menu != 0);
        
    }
}
