package tests;

import model.Order;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestOrder {

    Order o;

    @Before
    public void setup() {
        o = new Order(100, 'A', "Andrew");
    }

    @Test
    public void testConstructor() {
        assertEquals(o.getTicketNumber(), 100);
        assertEquals(o.getCustomerName(), "Andrew");
        assertEquals(o.getComboId(), 'A');
        assertFalse(o.isCompleted());
        assertEquals(o.getPrice(), 9.5, 0);
    }

    @Test
    public void testOrderComplete() {
        o.completed();
        assertEquals(o.customerReceipt(), "Andrew - 100 - Combo A - $9.5");
    }

    @Test
    public  void  testOrderNotCompete() {
        assertFalse(o.isCompleted());
        o.setInstructions("Make Hot");
        assertEquals(o.cookingInstructions(), "100 - Combo A: Make Hot");
    }
}
