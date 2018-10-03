import Customers.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Bob", 20, 178, 50);
    }

    @Test
    public void canPayForRide() {
        customer.payForRide(5.00);
        assertEquals(45.00, customer.getMoney(), 0.01);
    }
}
