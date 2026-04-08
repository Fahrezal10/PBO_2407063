package tugas.inheritence;

public class Main {
    public static void main(String[] args) {
        // 3. Melakukan pengujian dengan data: 
        // a. Panjang = 10
        // b. Lebar = 5
        // c. Tinggi = 4
        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;

        // Instansiasi objek BangunRuang dengan data yang diberikan
        BangunRuang bangun = new BangunRuang(panjang, lebar, tinggi);

        // 4. Program menampilkan:
        // a. Luas alas (hasil dari method hitungLuas)
        System.out.println("Luas alas: " +   bangun.hitungLuas());
        
        // b. Volume (hasil dari method hitungVolume)
        System.out.println("Volume: " + bangun.hitungVolume());
    }
}
