public class Produk {

    private String nama;
    private double harga;
    private int stok;
    private String deskripsi;
    private Penjual penjual;

    public Produk(String nama, double harga, int stok, String deskripsi, Penjual penjual) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.deskripsi = deskripsi;
        this.penjual = penjual;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Penjual getPenjual() {
        return penjual;
    }

    public void setPenjual(Penjual penjual) {
        this.penjual = penjual;
    }

    // Method lain
    public void ubahStok(int perubahan) {
        stok += perubahan;
    }
    @Override
    public String toString() {
        return "Produk: " + nama + ", " + harga + ", " + stok + ", " + deskripsi + ", " + penjual;
    }
}
