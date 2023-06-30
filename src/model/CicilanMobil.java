package model;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class CicilanMobil extends PeminjamanCicilanKendaraan{
    JenisMobil jenis;

    public CicilanMobil(JenisMobil jenis, String nomorPlat, String tahunRakitan, String kota, String warna, String tanggalPengajuan, int totalPinjaman, double bunga) {
        super(nomorPlat, tahunRakitan, kota, warna, tanggalPengajuan, totalPinjaman, bunga);
        this.jenis = jenis;
    }

    public JenisMobil getJenis() {
        return jenis;
    }

    public void setJenis(JenisMobil jenis) {
        this.jenis = jenis;
    }

    @Override
    public String toString() {
        return "CicilanMobil{" + "jenis=" + jenis + '}';
    }
   
}
