package direktori_anda.org.bangundatar;

import direktori_anda.org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(alas/2, 2) + Math.pow(tinggi, 2));
        return alas + sisiMiring + sisiMiring;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}