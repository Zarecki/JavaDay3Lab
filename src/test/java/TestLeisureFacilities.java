import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLeisureFacilities {

    LeisureFacilities leisureFacilities;
    Guest guest;

    @Before
    public void before(){
        leisureFacilities = new LeisureFacilities("The Commy", 50);
        guest = new Guest();
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, leisureFacilities.checkCapacity());
    }

    @Test
    public void hasGuestsNO(){
        assertEquals(0, leisureFacilities.getNumberOfGuests());
    }

    @Test
    public void hasGuestsYES(){
        leisureFacilities.addGuest(guest);
        assertEquals(1, leisureFacilities.getNumberOfGuests());
    }

    @Test
    public void hasName(){
        assertEquals("The Commy", leisureFacilities.getRoomName());
    }

    @Test
    public void testRemoveGuest(){
        leisureFacilities.addGuest(guest);
        assertEquals(1, leisureFacilities.getNumberOfGuests());
        leisureFacilities.removeGuest();
        assertEquals(0, leisureFacilities.getNumberOfGuests());
    }
}
