package tugas.Polymorphism;

public class PersegiPanjang extends BangunDatar {
    // Menggunakan constructor 2 parameter (Panjang dan Lebar)
    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar);
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarB(); // panjang * lebar
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("Panjang: " + getVarA());
        System.out.println("Lebar: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
    }
}
