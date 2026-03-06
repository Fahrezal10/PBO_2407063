package latihanpbo.latihan3;

public class Main {
    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();

        System.out.println("=== DATA BANGUN RUANG ===");
        
        bangunRuang.setSisi(25);
        System.out.println("Sisi bangun ruang: " + bangunRuang.getSisi());
        
        bangunRuang.setAlas(23);
        System.out.println("Alas bangun ruang: " + bangunRuang.getAlas());

        bangunRuang.setPanjang(5);
        System.out.println("Panjang bangun ruang: " + bangunRuang.getPanjang());
        
        bangunRuang.setLebar(10);
        bangunRuang.setTinggi(15);
        System.out.println("Lebar bangun ruang: " + bangunRuang.getLebar());
        System.out.println("Tinggi bangun ruang: " + bangunRuang.getTinggi());
    }
}