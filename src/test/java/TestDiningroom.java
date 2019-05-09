import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiningroom {

    Diningroom diningroom;
    Guest guest;

    @Before
    public void before(){
        diningroom = new Diningroom("The Balmoral", 100);
        guest = new Guest();
    }

    @Test
    public void hasName(){
        assertEquals("The Balmoral", diningroom.getRoomName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, diningroom.checkCapacity());
    }

    @Test
    public void hasGuestsNO(){
        assertEquals(0, diningroom.getNumberOfGuests());
    }

    @Test
    public void hasGuestsYES(){
        diningroom.addGuest(guest);
        assertEquals(1, diningroom.getNumberOfGuests());
    }

    @Test
    public void testRemoveGuest(){
        diningroom.addGuest(guest);
        assertEquals(1, diningroom.getNumberOfGuests());
        diningroom.removeGuest();
        assertEquals(0, diningroom.getNumberOfGuests());
    }
}
