package tugas.Polymorphism;

public class Persegi extends BangunDatar {
    // 2a. Menggunakan constructor 1 parameter sesuai kebutuhan (Sisi)
    public Persegi(double sisi) {
        super(sisi);
    }

    // 2b. Override method hitungLuas
    @Override
    public double hitungLuas() {
        return getVarA() * getVarA(); // sisi * sisi
    }

    // 2b & 2c. Override method tampilkan dengan format khusus
    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("Sisi: " + getVarA()); // 2d. Menyesuaikan nama variabel
        System.out.println("Luas: " + hitungLuas());
    }
}