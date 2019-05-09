import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBooking {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(101, 4, "Double King", 50);
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void testBilling(){
        assertEquals(250, booking.billing());
    }
}
