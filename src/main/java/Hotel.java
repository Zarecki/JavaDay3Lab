import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Diningroom> diningrooms;
    private ArrayList<LeisureFacilities> leisureFacilities;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.diningrooms = new ArrayList<>();
        this.leisureFacilities = new ArrayList<>();
    }

    public int getNumberOfBedrooms(){
        return this.bedrooms.size();
    }


    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public ArrayList<Bedroom> isRoomAvailable(){
        ArrayList<Bedroom> availableBedrooms = new ArrayList<>();
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getNumberOfGuests() == 0)
                    availableBedrooms.add(bedroom);
        }
        return availableBedrooms;
    }

    public int getNumberOfAvailableRooms(){
        ArrayList<Bedroom> availableBedrooms = new ArrayList<>(this.isRoomAvailable());
        return availableBedrooms.size();
    }

    public Booking checkGuestInToBedroom(Guest guest, int duration){
       int availableRoom = this.findNumberOfRoom();
       Booking booking = null;
        for (Bedroom bedroom: bedrooms) {
            if (bedroom.getRoomNumber() == availableRoom)
                booking = new Booking(bedroom, duration);
                bedroom.addGuest(guest);
        }
        return booking;
    }


    public int findNumberOfRoom(){
        ArrayList<Bedroom> availableBedrooms = new ArrayList<>(this.isRoomAvailable());
        Bedroom available = availableBedrooms.remove(0);
        return available.getRoomNumber();
    }

    public void checkGuestOut(){

    }



}
