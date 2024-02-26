public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang() {
        // Menghitung panjang garis menggunakan teorema Pythagoras
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double getGradien() {
        // Menghitung gradien garis
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx;
    }

    public Garis getRefleksiY() {
        // Menghasilkan garis baru hasil refleksi terhadap sumbu Y
        Titik t1 = titikAwal.getRefleksiY();
        Titik t2 = titikAkhir.getRefleksiY();
        return new Garis(t1, t2);
    }

    public boolean isTegakLurus(Garis g) {
        // Mengecek apakah dua garis tegak lurus
        return Math.abs(this.getGradien() * g.getGradien()) == 1;
    }
}
