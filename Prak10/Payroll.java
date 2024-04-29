package PBO.Prak10;

public class Payroll {
    public class Payroll {
        public void cetakGaji(Pegawai pegawai) {
            double tambahan = pegawai.hitungTambahan();
            String jenisTambahan = "";
    
            if (pegawai instanceof Programmer) {
                jenisTambahan = "Bonus";
            } else if (pegawai instanceof Manajer) {
                jenisTambahan = "Tunjangan";
            }
    
            System.out.println("Nama: " + pegawai.nama + ", Gaji pokok: " + (int)pegawai.gajiPokok);
            System.out.println(jenisTambahan + ": " + (int)tambahan);
        }
    }
}
