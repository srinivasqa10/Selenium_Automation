package Grouping;

import org.testng.annotations.Test;

public class PaymentTests {

    @Test(priority = 1, groups = {"sanity","regression"})
    void paymentinRupees()
    {
        System.out.println("This is payment in Rupees");
    }

    @Test(priority = 2, groups = {"sanity","regression"})
    void paymentindollars()
    {
        System.out.println("This is payment in dollars");
    }
}
