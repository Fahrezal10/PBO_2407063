package tugas.Polymorphism;

public class Segitiga extends BangunDatar {
    // Menggunakan constructor 2 parameter (Alas dan Tinggi)
    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double hitungLuas() {
        return 0.5 * getVarA() * getVarB(); // 1/2 * alas * tinggi
    }

    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("Alas: " + getVarA());
        System.out.println("Tinggi: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
    }
}