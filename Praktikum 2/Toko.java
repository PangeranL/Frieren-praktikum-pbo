public class Toko {
    public static void main(String[] args) {
        // Membuat objek Penjual
        Penjual penjual1 = new Penjual("Fahrezi", "Jl. Sultan Agung No. 123", "08123456789");

        // Membuat objek Produk
        Produk produk1 = new Produk("Buku Pemrograman Java", 50000, 10, "Buku untuk belajar pemrograman Java", penjual1);

        // Mencetak informasi produk
        System.out.println("Informasi Produk:");
        System.out.println(produk1); 

        // Mengubah informasi produk melalui setter
        produk1.setNama("Buku Pemrograman Web");
        produk1.setHarga(60000);

        // Mencetak informasi produk yang diubah
        System.out.println("\nInformasi Produk setelah diubah:");
        System.out.println(produk1);

        // Mencetak informasi penjual
        System.out.println("\nInformasi Penjual:");
        System.out.println(penjual1); 
    }
}
