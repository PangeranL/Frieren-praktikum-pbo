package PBO.Prak10;

public class Programmer {
    public class Programmer extends Pegawai {
        public Programmer(String nama) {
            super(nama, 5000000); // Gaji pokok programmer
        }
    
        @Override
        public double hitungTambahan() {
            return 450000; // Bonus programmer
        }
    }
}
