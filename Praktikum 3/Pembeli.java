public class Pembeli {

    private String nama;
    private Obat[] keranjangObat;
    private int jumlahObat;

    public Pembeli(String nama) {
        this.nama = nama;
        keranjangObat = new Obat[5];
        jumlahObat = 0;
    }

    public String getNama() {
        return nama;
    }

    public Obat[] getKeranjangObat() {
        return keranjangObat;
    }

    public int getJumlahObat() {
        return jumlahObat;
    }

    public void beliObat(Obat obat) throws BatasObatPenuhException, ObatTidakTersediaException {
        try {
            // Cek apakah obat tersedia
            if (!obat.isTersedia()) {
                throw new ObatTidakTersediaException("Obat " + obat.getNama() + " Obat ini tidak tersedia saat ini");
            }

            // Cek apakah keranjang sudah penuh
            if (jumlahObat == keranjangObat.length) {
                throw new BatasObatPenuhException("Keranjang sudah penuh, tidak dapat menambahkan obat " + obat.getNama());
            }

            // Menandai obat sebagai tidak tersedia
            obat.setTersedia(false);

            // Menambahkan obat ke keranjang
            keranjangObat[jumlahObat] = obat;
            jumlahObat++;
        } catch (ObatTidakTersediaException e) {
            System.out.println("Paracetamol: " + e.getMessage());
        } catch (BatasObatPenuhException e) {
            System.out.println("Paracetamol: " + e.getMessage());
        }
    }
}
