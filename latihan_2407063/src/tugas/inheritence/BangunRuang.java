package tugas.inheritence;

// 2. class BangunRuang merupakam turunan dari class BangunDatar
public class BangunRuang extends BangunDatar {
    // Memiliki satu atribut yaitu tinggi
    private double tinggi;

    // Memiliki satu constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        // Menggunakan constructor dari superclass (BangunDatar) agar tidak mengulang kode
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    // Memiliki sebuah method dengan nama hitungVolume
    public double hitungVolume() {
        // Perhitungan volume diperoleh dari luas (dari class sebelumnya) * tinggi
        return super.hitungLuas() * this.tinggi;
    }
}