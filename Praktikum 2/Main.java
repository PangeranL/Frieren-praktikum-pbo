public class Main {
    public static void main(String[] args) {
        Kubus kubus1 = new Kubus(5);

        // Hitung dan cetak volume
        double volume = kubus1.hitungVolume();
        System.out.println("Volume kubus: " + volume);

        // Hitung dan cetak luas permukaan
        double luasPermukaan = kubus1.hitungLuasPermukaan();
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}