public class ObatTidakTersediaException extends Exception {
    public ObatTidakTersediaException(String message) {
        super("Obat ini tidak tersedia saat ini");
    }
}