class Titik {

    private int absis;
    private int ordinat;

    public Titik(int absis, int ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public int getAbsis() {
        return absis;
    }

    public int getOrdinat() {
        return ordinat;
    }

    public double getJarakPusat() {
        // Menghitung jarak menggunakan teorema Pythagoras
        double jarak = Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
        return jarak;
    }

    public void refleksiX() {
        // Melakukan pencerminan terhadap sumbu X
        absis = -absis;
    }

    public void refleksiY() {
        // Melakukan pencerminan terhadap sumbu Y
        ordinat = -ordinat;
    }

    public Titik getRefleksiX() {
        // Menghasilkan titik baru hasil refleksi terhadap sumbu X
        Titik t = new Titik(-absis, ordinat);
        return t;
    }

    public Titik getRefleksiY() {
        // Menghasilkan titik baru hasil refleksi terhadap sumbu Y
        Titik t = new Titik(absis, -ordinat);
        return t;
    }
}
