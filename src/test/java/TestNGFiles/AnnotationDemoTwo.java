package TestNGFiles;

import org.testng.annotations.*;

public class AnnotationDemoTwo {
      /*
    1. LogIn -- @BeforeClass
    2. Search -- @Test
    5. Advance Search -- @Test
    6. LogOut -- @AfterClass
     */

    @BeforeClass
    void LogIn()
    {
        System.out.println("This is Login");
    }

    @Test(priority = 1)
    void search()
    {
        System.out.println("This is search");
    }

    @AfterClass
    void logout()
    {
        System.out.println("This is Logout");
    }

    @Test(priority = 2)
    void advancesearch()
    {
        System.out.println("This is advance search");
    }
}
