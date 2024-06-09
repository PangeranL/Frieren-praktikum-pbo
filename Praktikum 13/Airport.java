public class Airport {
    private Airplane airplane;

    private String name;

    public Airport(String name){
        this.name = name;
    }
    public String givePersmissionToLand(IFleyer flyer){
        return "Permission granted to land at " + this.name;
    }
}
// Ahmad Fahrezi
// 24060122140146