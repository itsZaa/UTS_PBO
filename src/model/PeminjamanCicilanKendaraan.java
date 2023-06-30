package model;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class PeminjamanCicilanKendaraan extends Peminjaman {
    String nomorPlat;
    String tahunRakitan;
    String kota;
    String warna;

    public PeminjamanCicilanKendaraan(String nomorPlat, String tahunRakitan, String kota, String warna, String tanggalPengajuan, int totalPinjaman, double bunga) {
        super(tanggalPengajuan, totalPinjaman, bunga);
        this.nomorPlat = nomorPlat;
        this.tahunRakitan = tahunRakitan;
        this.kota = kota;
        this.warna = warna;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public void setNomorPlat(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }

    public String getTahunRakitan() {
        return tahunRakitan;
    }

    public void setTahunRakitan(String tahunRakitan) {
        this.tahunRakitan = tahunRakitan;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public String toString() {
        return "PeminjamanCicilanKendaraan{" + "nomorPlat=" + nomorPlat + ", tahunRakitan=" + tahunRakitan + ", kota=" + kota + ", warna=" + warna + '}';
    }
    
    
}
