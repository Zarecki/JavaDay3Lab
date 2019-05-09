import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int price;

    public Bedroom(int roomNumber, int capacity, String type, int price){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.type = type;
        this.price = price;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int checkCapacity() {
        return this.capacity;
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public String getType() {
        return this.type;
    }

    public boolean hasRoom(){
        return this.capacity > this.getNumberOfGuests();
    }

    public void addGuest(Guest guest) {
        if (this.hasRoom()){
            this.guests.add(guest);
        }
        else System.out.println("No space in this room");
    }

    public boolean hasGuests(){
        return this.getNumberOfGuests() > 0;
    }

    public void removeGuest(){
        if (this.hasGuests())
        this.guests.remove(0);
    }

    public int getPrice(){
        return this.price;
    }
}
