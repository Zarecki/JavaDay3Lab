import java.util.ArrayList;

public class LeisureFacilities {


    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public LeisureFacilities(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int checkCapacity() {
        return this.capacity;
    }

    public int getNumberOfGuests() {
        return this.guests.size();
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

    public String getRoomName() {
        return this.name;
    }

    public boolean hasGuests(){
        return this.getNumberOfGuests() > 0;
    }

    public void removeGuest(){
        if (this.hasGuests())
            this.guests.remove(0);
    }
}
