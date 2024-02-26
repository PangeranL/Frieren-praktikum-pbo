public class MTitik {
     public static void main(String[] args) {
        // Membuat objek Titik
        Titik t1 = new Titik(2, 3);
        Titik t2 = new Titik(5, 7);

        // Membuat objek Garis
        Garis g1 = new Garis(t1, t2);

        // Menghitung jarak ke pusat
        double jarak = t1.getJarakPusat();
        System.out.println("Jarak ke pusat: " + jarak);

        // Melakukan refleksi terhadap sumbu X dan Y
        t1.refleksiX();
        System.out.println("Titik setelah refleksi X: " + t1);
        t1.refleksiY();
        System.out.println("Titik setelah refleksi Y: " + t1);

        // Mendapatkan titik baru hasil refleksi
        Titik tRefleksiX = t1.getRefleksiX();
        System.out.println("Titik refleksi X: " + tRefleksiX);
        Titik tRefleksiY = t1.getRefleksiY();
        System.out.println("Titik refleksi Y: " + tRefleksiY);

        // Menampilkan informasi garis
        System.out.println(g1); 
        System.out.println("Panjang garis: " + g1.getPanjang()); 
        System.out.println("Gradien garis: " + g1.getGradien()); 

        // Mendapatkan garis refleksi Y
        Garis gRefleksiY = g1.getRefleksiY();
        System.out.println("Garis refleksi Y: " + gRefleksiY); 

        // Membandingkan tegak lurus dengan garis lain
        Garis g3 = new Garis(t1, new Titik(2, 7));
        System.out.println("Apakah g1 tegak lurus dengan g3? " + g1.isTegakLurus(g3)); 
    }
}
