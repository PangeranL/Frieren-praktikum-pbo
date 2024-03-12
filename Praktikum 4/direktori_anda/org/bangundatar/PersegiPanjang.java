package direktori_anda.org.bangundatar;

import direktori_anda.org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return this.panjang * this.lebar;
    }

    public void printInfo(){
        System.out.println("Persegi Panjang");
        System.out.println("Panjang: " + this.panjang);
        System.out.println("Lebar: " + this.lebar);
        System.out.println("Jumlah Sisi: " + this.jumlahSisi);
        System.out.println("Luas: " + this.hitungLuas());
        System.out.println("Bangun persegi panjang bersisi " + this.getJumlahSisi());
    }
}
