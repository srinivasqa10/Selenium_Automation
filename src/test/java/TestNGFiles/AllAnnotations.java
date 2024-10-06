package TestNGFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AllAnnotations
{

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


    @BeforeTest
    void bt()
    {
        System.out.println("This is before test from C1");
    }

    @AfterTest
    void at()
    {
        System.out.println("This is after test from C2");
    }


}
