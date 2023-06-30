package model;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class CicilanMotor extends PeminjamanCicilanKendaraan {
    JenisMotor jenis;

    public CicilanMotor(JenisMotor jenis, String nomorPlat, String tahunRakitan, String kota, String warna, String tanggalPengajuan, int totalPinjaman, double bunga) {
        super(nomorPlat, tahunRakitan, kota, warna, tanggalPengajuan, totalPinjaman, bunga);
        this.jenis = jenis;
    }

    public JenisMotor getJenis() {
        return jenis;
    }

    public void setJenis(JenisMotor jenis) {
        this.jenis = jenis;
    }

    @Override
    public String toString() {
        return "CicilanMotor{" + "jenis=" + jenis + '}';
    }
    
    
}
