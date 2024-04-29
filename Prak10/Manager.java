package PBO.Prak10;

public class Manager {
    public class Manajer extends Pegawai {
        public Manajer(String nama) {
            super(nama, 5000000); // Gaji pokok manajer
        }
    
        @Override
        public double hitungTambahan() {
            return 700000; // Tunjangan manajer
        }
    }
}
