public class SeaPlane extends Airplane{
    private double maxLoad;

    public SeaPlane(){
        this.maxLoad = 0;
    }
    public SeaPlane(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public double calcFuelEfficiency(){
        return super.calcFuelEfficiency() + maxLoad;
    }
    public double calcTripDistance(){
        return super.calcTripDistance() * calcFuelEfficiency() + 40;
    }
    public String toString(){
        return super.toString() + " Dapat take-off dan mendarat di perariran laut";
    }
}
// Ahmad Fahrezi
// 24060122140146