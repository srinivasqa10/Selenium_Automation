package TestNGTwo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

    @Test
    void pqr()
    {
        System.out.println("this pqr in C3");
    }

    @BeforeSuite
    void bs()
    {
         System.out.println("Before Suite");
    }

    @AfterSuite
    void as()
    {
        System.out.println("After Suite");
    }
}
