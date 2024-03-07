public class BatasObatPenuhException extends Exception {
    public BatasObatPenuhException(String message) {
        super("Keranjang sudah penuh, tidak dapat menambahkan obat"); 
    }
}
