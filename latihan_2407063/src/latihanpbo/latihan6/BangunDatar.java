package latihanpbo.latihan6;

public abstract class BangunDatar {
    private String nama;

    public BangunDatar (String nama){
        this.nama = nama;   
    }

    abstract double hitungLuas();
    abstract double hitungKeliling();

    public void Display(){
        System.out.println("ini adalah: " + nama);
    }
}
