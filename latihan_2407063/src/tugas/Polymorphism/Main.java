package tugas.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // 3a. Menggunakan satu tipe variabel (Array of BangunDatar) 
        // untuk menampung objek Persegi, PersegiPanjang, dan Segitiga.
        BangunDatar[] kumpulanBangun = new BangunDatar[3];

        // Instansiasi masing-masing objek
        kumpulanBangun[0] = new Persegi(5.0);
        kumpulanBangun[1] = new PersegiPanjang(10.0, 4.0);
        kumpulanBangun[2] = new Segitiga(6.0, 8.0);

        // Memanggil method tampilkan() menggunakan looping
        // Java akan secara otomatis mencari method yang sudah di-override di setiap child class
        for (BangunDatar bangun : kumpulanBangun) {
            bangun.tampilkan();
            System.out.println("--------------------");
        }
    }
}
