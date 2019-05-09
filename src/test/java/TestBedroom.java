import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(101, 4, "Double King", 50);
        guest = new Guest();
    }


    @Test
    public void hasRoomNumber(){
        assertEquals(101, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, bedroom.checkCapacity());
    }

    @Test
    public void hasGuestsNO(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void hasGuestsYES(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void hasType(){
        assertEquals("Double King", bedroom.getType());
    }

    @Test
    public void testRemoveGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
        bedroom.removeGuest();
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void hasPrice(){
        assertEquals(50, bedroom.getPrice());
    }

}
