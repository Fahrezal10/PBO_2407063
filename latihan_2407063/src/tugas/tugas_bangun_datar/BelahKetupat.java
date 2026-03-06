package tugas.tugas_bangun_datar;

public class BelahKetupat extends BangunDatar {
    private double d1, d2, sisi;

    public BelahKetupat(double d1, double d2, double sisi) {
        super("Belah Ketupat");
        this.d1 = d1;
        this.d2 = d2;
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * d1 * d2;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}
