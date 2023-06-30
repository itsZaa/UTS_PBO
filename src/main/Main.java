package main;

import controller.ControllerNasabah;
import controller.ControllerPeminjaman;
import java.util.ArrayList;
import model.CicilanMobil;
import model.CicilanMotor;
import model.JenisMobil;
import model.JenisMotor;
import model.Nasabah;
import model.Peminjaman;
import view.ViewMain;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class Main {
    private ArrayList<Nasabah> listNasabah = new ArrayList();
    
    public Main() {
        this.listNasabah = new ArrayList<>();
    }

    public ArrayList<Nasabah> getListNasabah() {
        return listNasabah;
    }

    public void setListNasabah(ArrayList<Nasabah> listNasabah) {
        this.listNasabah = listNasabah;
    }
    
    public void addDummy () {
        JenisMobil mobil1 = JenisMobil.SEDAN;
        JenisMobil mobil2 = JenisMobil.MPV;
        JenisMobil mobil3 = JenisMobil.PICKUP;
        JenisMotor motor1 = JenisMotor.TRAIL;
        JenisMotor motor2 = JenisMotor.MATIC;
        
        
        Peminjaman pinjam1 = new CicilanMobil (mobil1, "B 3748 ADD", "2020", "Bandung", "Hitam",  "11 Nov", 200000000, 0.005);
        Peminjaman pinjam2 = new CicilanMobil (mobil2, "B 3748 ADD", "2020", "Bandung", "Hitam",  "11 Nov", 200000000, 0.005);
        Peminjaman pinjam3 = new CicilanMobil (mobil3, "B 3748 ADD", "2020", "Bandung", "Hitam",  "11 Nov", 200000000, 0.005);
        Peminjaman pinjam4 = new CicilanMotor (motor1, "B 3748 ADD", "2020", "Bandung", "Hitam",  "11 Nov", 200000000, 0.005);
        Peminjaman pinjam5 = new CicilanMotor (motor2, "B 3748 ADD", "2020", "Bandung", "Hitam",  "11 Nov", 200000000, 0.005);
 
        ArrayList<Peminjaman> list1 = new ArrayList();
        ArrayList<Peminjaman> list2 = new ArrayList();
        ArrayList<Peminjaman> list3 = new ArrayList();
        
        list1.add(pinjam1);
        list1.add(pinjam2);
        list1.add(pinjam3);
        list2.add(pinjam3);
        list2.add(pinjam4);
        list2.add(pinjam5);
        list3.add(pinjam1);
        list3.add(pinjam3);
        list3.add(pinjam4);
        
        
        Nasabah nasabah1 = new Nasabah("Budi","1234","0892162221", list1);
        Nasabah nasabah2 = new Nasabah("Agus","2345","0892222222", list2);
        Nasabah nasabah3 = new Nasabah("Ucup","3456","0891111111", list3);
        
        listNasabah.add(nasabah1);
        listNasabah.add(nasabah2);
        listNasabah.add(nasabah3);
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        main.addDummy();
        
        ControllerNasabah controllerNasabah = new ControllerNasabah(main.getListNasabah());
        ControllerPeminjaman controllerPeminjaman = new ControllerPeminjaman(main.getListNasabah());

        ViewMain view = new ViewMain(controllerNasabah, controllerPeminjaman);
        view.MainMenu();
    }
}
