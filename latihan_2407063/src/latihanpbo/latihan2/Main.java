package latihanpbo.latihan2;

//acsess modifier (public, private, protected)
class Persegi{
    private int sisi;

    public int getSisi() {
        return sisi*sisi;
    }
    public double kelilingPersegi(){
        return sisi+sisi;
    }
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
}
public class Main {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi();
        persegi1.setSisi(5);
        System.out.println("Sisi Persegi: " + persegi1.getSisi());
    }
}
