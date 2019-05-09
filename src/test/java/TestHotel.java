import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    Hotel hotel;
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(102, 2, "Double", 50);
        guest = new Guest();
    }

    @Test
    public void initalEmptyHotel(){
        assertEquals(0, hotel.getNumberOfBedrooms());
    }

    @Test
    public void testAddBedroomToHotel(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void checkGuestInToRoom(){
        hotel.addBedroom(bedroom);
        hotel.checkGuestInToBedroom(guest, 5);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void testRoomAvailability(){
        hotel.addBedroom(bedroom);
        hotel.isRoomAvailable();
        assertEquals(1, hotel.getNumberOfAvailableRooms());
    }

}
