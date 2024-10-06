package TestNGTwo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

    @Test
    void xyz()
    {
        System.out.println("This is main Test from C2");
    }

    @AfterTest
    void at()
    {
        System.out.println("This is after test from C2");
    }
}
