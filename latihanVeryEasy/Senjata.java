package PBO.latihanVeryEasy;

public class Senjata {

    private String bunyi;
    private int peluru;


    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

 
    public int getPeluru() {
        return peluru;
    }


    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }


    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi);
            peluru--;

            System.out.println("Sisa peluru: " + (peluru));
        } else {
            System.out.println("Peluru habis!");
        }
    }


    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }


    public String getBunyi() {
        return bunyi;
    }
}
