import static java.lang.Math.PI;
class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungluas() {
        return PI * jejari * jejari;
    }
}
