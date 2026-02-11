package latihanpbo.latihan1;

// import java.util.Scanner;

class Cafe{
    String nama;
    String alamat;

    //constructor
    Cafe(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("Nama Cafe:" + this.nama);
        System.out.println("lokasinya adalah:" + this.alamat);
    }

    //method
    void bukaCafe1(){
        System.out.println(this.nama + " Buka dan tutup kiamat aja");
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}



public class Main {
    public static void main(String[] args) {

        System.out.println("======cafe1======");
        Cafe cafe1 = new Cafe("Kopte", "Cirebon");
        cafe1.bukaCafe1();

        // Scanner input = new Scanner(system.in);
        // Cafe cafe = new Cafe ();

        // Cafe cafe1 = new Cafe();
        // cafe1.nama = "Kopkar Polindra";
        // cafe1.alamat = "Polindra";

        // Cafe cafe2 = new Cafe();
        // cafe2.nama = "Teman Istimewa";
        // cafe2.alamat = "Indramayu";

        // Cafe cafe3 = new Cafe();
        // cafe3.nama = "Tentang Kopi";
        // cafe3.alamat = "Karangampel";

        // Cafe cafe4 = new Cafe("Kopi Lambada", " Indramayu");
        // cafe4.buka();
        // System.out.println("Saya sedang nongkrong di " + cafe1.nama);
        // System.out.println("lokasinya ada di " + cafe1.alamat);
        // System.out.println("Kemarin saya nongkrong di " + cafe2.nama);
        // System.out.println("lokasinya ada di " + cafe2.alamat);
        // System.out.println("dan besok saya mau ke " + cafe3.nama);
        // System.out.println("lokasinya ada di " + cafe3.alamat);
    }
}
