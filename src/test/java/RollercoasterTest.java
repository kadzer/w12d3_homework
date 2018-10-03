import Customers.Customer;
import Rollercoasters.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;
    Customer customer1;
    Customer customer2;

    @Before
    public void setUp() throws Exception {
        rollercoaster = new Rollercoaster("Spacemountain",25, 12,122,198,94,93);
        customer1 = new Customer("Bob",12,130, 50);
        customer2 = new Customer("Rob",44,199, 20);
    }

    @Test
    public void canRideDueToHeight() {
        assertEquals(true, rollercoaster.canRideHeightCheck(customer1));
        assertEquals(false, rollercoaster.canRideHeightCheck(customer2));
    }

}
