package tugas.tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BangunDatar bangun = null;

        System.out.println("=== Kalkulator Bangun Datar ===");
        System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Belah Ketupat");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double s = input.nextDouble();
                bangun = new Persegi(s);
                break;
            case 2:
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble();
                bangun = new PersegiPanjang(p, l);
                break;
            case 3:
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                bangun = new Segitiga(a, t);
                break;
            case 4:
                System.out.print("Masukkan Diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan Diagonal 2: ");
                double d2 = input.nextDouble();
                System.out.print("Masukkan Sisi luar: ");
                double sl = input.nextDouble();
                bangun = new BelahKetupat(d1, d2, sl);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        if (bangun != null) {
            System.out.println("\n--- Hasil " + bangun.getNama() + " ---");
            System.out.println("Luas: " + bangun.hitungLuas());
            System.out.println("Keliling: " + bangun.hitungKeliling());
        }
    }
}
