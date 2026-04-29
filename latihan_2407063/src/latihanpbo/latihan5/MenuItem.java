package latihanpbo.latihan5;

public class MenuItem extends Menu {
    private int jumlahBelanja;

    public MenuItem(String namaBarang, double harga, int jumlahBelanja) {
        super(namaBarang, harga); 
        this.jumlahBelanja = jumlahBelanja;
    }

    @Override
    public double hitungTotal() {
        return getHarga() * jumlahBelanja; 
    }

    @Override
    public void cetakPesanan() {
        int hargaInt = (int) getHarga();
        int totalInt = (int) hitungTotal();
        
        System.out.println(getNamaBarang() + " -> " + hargaInt + " x " + jumlahBelanja + " = " + totalInt);
    }
}
