package tugas.Polymorphism;

public class BangunDatar {
    // 1a. Atribut bertipe data double dan prinsip enkapsulasi (private)
    private double varA;
    private double varB;

    // 1b. Constructor pertama (2 parameter)
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // 1b. Constructor kedua (1 parameter)
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0; // Memberikan nilai default untuk varB
    }

    // Getter untuk diakses oleh class turunan (karena atribut bersifat private)
    public double getVarA() {
        return varA;
    }

    public double getVarB() {
        return varB;
    }

    // 1c. Method hitungLuas dengan nilai default 0
    public double hitungLuas() {
        return 0;
    }

    // 1d. Method tampilkan
    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
    }
}
