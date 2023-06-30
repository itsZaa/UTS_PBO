package model;

import java.util.ArrayList;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class Nasabah {
    private String nama;
    private String NIK;
    private String nomorTelepon;
    private ArrayList<Peminjaman> listPinjaman = new ArrayList();

    public Nasabah(String nama, String NIK, String nomorTelepon, ArrayList<Peminjaman> listPinjam) {
        this.nama = nama;
        this.NIK = NIK;
        this.nomorTelepon = nomorTelepon;
        this.listPinjaman = listPinjam;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public ArrayList<Peminjaman> getListPinjaman() {
        return listPinjaman;
    }

    public void setListPinjaman(ArrayList<Peminjaman> listPinjaman) {
        this.listPinjaman = listPinjaman;
    }

    @Override
    public String toString() {
        return "Nasabah{" + "nama=" + nama + ", NIK=" + NIK + ", nomorTelepon=" + nomorTelepon + ", listPinjaman=" + listPinjaman + '}';
    }
}
