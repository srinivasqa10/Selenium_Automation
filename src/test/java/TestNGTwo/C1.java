package TestNGTwo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

    @Test
    void abc()
    {
        System.out.println("This is main Test from C1");
    }

    @BeforeTest
    void bt()
    {
        System.out.println("This is before test from C1");
    }
}
