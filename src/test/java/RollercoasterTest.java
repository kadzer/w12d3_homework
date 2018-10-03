import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;
    Customer customer1;
    Customer customer2;

    @Before
    public void setUp() throws Exception {
        rollercoaster = new Rollercoaster(25, 12,122,198,94,93);
        customer1 = new Customer(12,130, 50);
        customer2 = new Customer(44,199, 20);
    }

    @Test
    public void canRideDueToHeight() {
        assertEquals(true, rollercoaster.canRideHeightCheck(customer1));
        assertEquals(false, rollercoaster.canRideHeightCheck(customer2));
    }

}
