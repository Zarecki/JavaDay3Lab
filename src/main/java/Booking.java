public class Booking {
    private Bedroom bedroom;
    private int duration;

    public Booking(Bedroom bedroom, int duration){
        this.bedroom = bedroom;
        this.duration = duration;
    }

    public int billing(){
       return bedroom.getPrice() * duration;
    }
}
