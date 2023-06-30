package model;

import java.util.ArrayList;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public abstract class Peminjaman {
    private String tanggalPengajuan;
    private int totalPinjaman;
    private double bunga;
    private double bayaranBulanan;
    private Pembayaran [] arrPembayaran = new Pembayaran[12];

    public Peminjaman(String tanggalPengajuan, int totalPinjaman, double bunga) {
        this.tanggalPengajuan = tanggalPengajuan;
        this.totalPinjaman = totalPinjaman;
        this.bunga = bunga;
        this.bayaranBulanan = hitungBayarBulanan(totalPinjaman, bunga);
    }

    public String getTanggalPengajuan() {
        return tanggalPengajuan;
    }

    public void setTanggalPengajuan(String tanggalPengajuan) {
        this.tanggalPengajuan = tanggalPengajuan;
    }

    public int getTotalPinjaman() {
        return totalPinjaman;
    }

    public void setTotalPinjaman(int totalPinjaman) {
        this.totalPinjaman = totalPinjaman;
    }

    public double getBunga() {
        return bunga;
    }

    public void setBunga(double bunga) {
        this.bunga = bunga;
    }

    public double getBayaranBulanan() {
        return bayaranBulanan;
    }

    public void setBayaranBulanan(double bayaranBulanan) {
        this.bayaranBulanan = bayaranBulanan;
    }

    public Pembayaran[] getArrPembayaran() {
        return arrPembayaran;
    }

    public void setArrPembayaran(Pembayaran[] arrPembayaran) {
        this.arrPembayaran = arrPembayaran;
    }

    @Override
    public String toString() {
        return "Peminjaman{" + "tanggalPengajuan=" + tanggalPengajuan + ", totalPinjaman=" + totalPinjaman + ", bunga=" + bunga + ", bayaranBulanan=" + bayaranBulanan + ", arrPembayaran=" + arrPembayaran + '}';
    }
    
    private double hitungBayarBulanan (int totalPinjaman, double bunga) {
        return totalPinjaman / 12 * bunga+(totalPinjaman / 12);
    }
}
