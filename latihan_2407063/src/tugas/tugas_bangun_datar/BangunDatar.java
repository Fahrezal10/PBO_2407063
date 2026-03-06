package tugas.tugas_bangun_datar;

public abstract class BangunDatar {
    private String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    // Getter untuk Encapsulation
    public String getNama() {
        return nama;
    }

    // Abstract method yang WAJIB di-override oleh anak cucunya (Polymorphism)
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}
