package direktori_anda.org.main;

import direktori_anda.org.bangundatar.*;
public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(5, 4, 5);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: " + persegi.hitungLuas());
    }
}
