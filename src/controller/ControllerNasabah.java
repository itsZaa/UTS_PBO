package controller;

import java.util.ArrayList;
import model.CicilanMobil;
import model.CicilanMotor;
import model.JenisMobil;
import model.JenisMotor;
import model.Nasabah;
import model.Pembayaran;
import model.Peminjaman;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class ControllerNasabah {
    private ArrayList<Nasabah>listNasabah = new ArrayList();

    public ControllerNasabah(ArrayList<Nasabah>listNasabah) {
        this.listNasabah = listNasabah;
    }
    
    public String getTextNasabah(){
        String append = "";
        for (Nasabah nasabah : listNasabah) {
            append += nasabah.toString();
            for (Peminjaman peminjaman : nasabah.getListPinjaman()) {
                append += peminjaman.toString();
            }
            append += "\n";
        }
        return append;
    }
    
    public String GetTextPembayaran (String NIK) {
        String append = "";
        for (Nasabah nasabah : listNasabah) {
            if (NIK.equals(nasabah.getNIK())) {
                ArrayList<Peminjaman> pinjam = nasabah.getListPinjaman();
                for (Peminjaman peminjaman : pinjam) {
                    Pembayaran [] bayar = peminjaman.getArrPembayaran();
                    for (int i = 0; i < 12; i++) {
                        append += bayar.toString()+"";
                    }
                }
            }
        }
        return append;
    }
    
    public String countJumlahMotor () {
        int [] counter = new int [5];
        JenisMotor[] jenis = new JenisMotor[5];
        jenis[0] = JenisMotor.BEBEK;
        jenis[1] = JenisMotor.MATIC;
        jenis[2] = JenisMotor.SPORT;
        jenis[3] = JenisMotor.TRAIL;
        jenis[4] = JenisMotor.ELEKTRIK;
        for (Nasabah nasabah : listNasabah) {
            ArrayList<Peminjaman> pinjam = nasabah.getListPinjaman();
            for (Peminjaman peminjaman : pinjam) {
                if (peminjaman instanceof CicilanMotor) {
                    for (int i = 0; i < 5; i++) {
                        if (((CicilanMotor) peminjaman).getJenis().equals(jenis[i])) {
                            counter[i]++;
                        }
                    }
                }
            }
        }
        int indexMax = getMaxIndex(counter);
        
        return ""+jenis[indexMax]+", Quantity : "+counter[indexMax];
    }
    
    public String countJumlahMobil () {
        int [] counter = new int [5];
        JenisMobil[] jenis = new JenisMobil[5];
        jenis[0] = JenisMobil.SUV;
        jenis[1] = JenisMobil.SEDAN;
        jenis[2] = JenisMobil.MPV;
        jenis[3] = JenisMobil.MINIVAN;
        jenis[4] = JenisMobil.PICKUP;
        for (Nasabah nasabah : listNasabah) {
            ArrayList<Peminjaman> pinjam = nasabah.getListPinjaman();
            for (Peminjaman peminjaman : pinjam) {
                if (peminjaman instanceof CicilanMobil) {
                    for (int i = 0; i < 5; i++) {
                        if (((CicilanMobil) peminjaman).getJenis().equals(jenis[i])) {
                            counter[i]++;
                        }
                    }
                }
            }
        }
        int indexMax = getMaxIndex(counter);
        
        return ""+jenis[indexMax]+", Quantity : "+counter[indexMax];
    }
    
    public static int getMaxIndex(int[] array) {
    int maxIndex = 0;
    for (int i = 1; i < array.length; i++) {
        if (array[i] > array[maxIndex]) {
            maxIndex = i;
        }
    }

    return maxIndex;
}
}
