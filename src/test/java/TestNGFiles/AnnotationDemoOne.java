package TestNGFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemoOne {

    /*
    1. LogIn -- @BeforeMethod
    2. Search -- @Test
    3. LogOut -- @AfterMethod
    4. LogIn
    5. Advance Search -- @Test
    6. LogOut
     */

    @BeforeMethod
    void LogIn()
    {
        System.out.println("This is Login");
    }

    @Test(priority = 1)
    void search()
    {
        System.out.println("This is search");
    }

    @AfterMethod
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
