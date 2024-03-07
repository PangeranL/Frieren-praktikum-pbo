public class Main {

    public static void main(String[] args) {
        // Buat pembeli
        Pembeli pembeli1 = new Pembeli("Budi");

        // Buat beberapa obat
        Obat obat1 = new Obat("Panadol");
        obat1.setTersedia(true);

        Obat obat2 = new Obat("Paracetamol");
        obat2.setTersedia(false);

        Obat obat3 = new Obat("Antibiotik");
        obat3.setTersedia(true);

        // Simulasi pembelian
        try {
            pembeli1.beliObat(obat1);
            System.out.println("Pembelian " + obat1.getNama() + " berhasil!");

            pembeli1.beliObat(obat3);
            System.out.println("Pembelian " + obat3.getNama() + " berhasil!");

            pembeli1.beliObat(obat2);
        } catch (ObatTidakTersediaException e) {
            System.out.println(e.getMessage());
        } catch (BatasObatPenuhException e) {
            System.out.println(e.getMessage());
        }

        // Tampilkan informasi pembeli
        System.out.println("Pembeli: " + pembeli1.getNama());

        // Tampilkan informasi keranjang
        System.out.println("Keranjang " + pembeli1.getNama() + ":");
        for (Obat obat : pembeli1.getKeranjangObat()) {
            if (obat != null) {
                System.out.println(" - " + obat.getNama());
            }
        }
    }
}
