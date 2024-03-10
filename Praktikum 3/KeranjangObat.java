public class KeranjangObat {

    private String[] keranjang;
    private int count;

    public KeranjangObat() {
        keranjang = new String[5];
        count = 0;
    }

    public void tambahObat(String obat) {
        // Periksa apakah keranjang sudah penuh atau tidak. Jika belum penuh, tambahkan obat
        if (count == keranjang.length) {
            throw new ArrayIndexOutOfBoundsException("Keranjang sudah penuh!");
        }

        // Tambahkan obat ke keranjang 
        keranjang[count] = obat;
        count++;
    }

    public void tampilkanObat() {
        for (int i = 0; i < count; i++) {
            System.out.println(keranjang[i]);
        }
    }

    public int getCount() {
        return count;
    }

    public boolean isFull() {
        return count == keranjang.length;
    }
}