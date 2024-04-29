package PBO.Prak10;

public class Pegawai {
    public abstract class Pegawai {
        protected String nama;
        protected double gajiPokok;
    
        public Pegawai(String nama, double gajiPokok) {
            this.nama = nama;
            this.gajiPokok = gajiPokok;
        }
    
        public abstract double hitungTambahan();
    }
}
