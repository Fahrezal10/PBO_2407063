package tugas.inheritence;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungVolume() {
        return this.hitungLuas() * this.tinggi;
    }
}