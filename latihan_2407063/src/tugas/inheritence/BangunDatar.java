package tugas.inheritence;

public class BangunDatar {
    // 1a. Memiliki dua atribut, yaitu panjang dan lebar
    // 1b. Atribut dibuat menggunakan prinsip enkapsulasi (private modifier)
    private double panjang;
    private double lebar;

    // 1c. Memiliki constructor untuk mengisi nilai kedua atribut tersebut
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter untuk atribut jika sewaktu-waktu dibutuhkan (bagian dari enkapsulasi)
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // 1d. Memiliki sebuah method dengan nama hitungLuas (panjang * lebar)
    public double hitungLuas() {
        return this.panjang * this.lebar;
    }
}
