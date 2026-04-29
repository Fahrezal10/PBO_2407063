package latihanpbo.latihan5;

public class Menu {
    private String namaBarang;
    private double harga;

    public Menu(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public double hitungTotal() {
        return 0; 
    }

    public void cetakPesanan() {
        
    }
}
