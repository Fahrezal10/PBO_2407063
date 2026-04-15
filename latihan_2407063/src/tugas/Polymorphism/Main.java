package tugas.Polymorphism;

public class Main {
    public static void main(String[] args) {
        BangunDatar[] kumpulanBangun = new BangunDatar[3];

        kumpulanBangun[0] = new Persegi(5.0);
        kumpulanBangun[1] = new PersegiPanjang(10.0, 4.0);
        kumpulanBangun[2] = new Segitiga(6.0, 8.0);

        for (BangunDatar bangun : kumpulanBangun) {
            bangun.tampilkan();
            System.out.println("--------------------");
        }
    }
}
