package latihanpbo.latihan5;

public class Main {
    public static void main(String[] args) {
        Menu[] pesanan = new Menu[3];
        
        pesanan[0] = new MenuItem("Es teh", 3000, 3);
        pesanan[1] = new MenuItem("Matcha", 20000, 2);
        pesanan[2] = new MenuItem("Soda Tidak Gembira", 12000, 1);

        double totalSemua = 0;

        for (Menu m : pesanan) {
            m.cetakPesanan(); 
            
            totalSemua += m.hitungTotal();
        }

        System.out.println("------------------------------------------");
        System.out.println("Total = " + (int) totalSemua);
    }
}
