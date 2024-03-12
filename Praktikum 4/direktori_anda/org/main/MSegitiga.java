package direktori_anda.org.main;

public class MSegitiga {
    public static void main(String[] args) {
        // Deklarasi variabel alas dan tinggi dari sebuah segitiga
        double alas = 5;
        double tinggi = 10;

        // Menghitung luas dan keliling dari segitiga tersebut
        double luas = (alas * tinggi) / 2;
        double keliling = alas + Math.sqrt(Math.pow(alas/2, 2) + Math.pow(tinggi, 2)) * 2;

        // Output yang dihasilkan
        System.out.println("Alas segitiga: " + alas);
        System.out.println("Tinggi segitiga: " + tinggi);
        System.out.println("Luas segitiga: " + luas);
        System.out.println("Keliling segitiga: " + keliling);

    }
}