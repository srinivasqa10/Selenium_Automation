package TestNGFiles;

/*
1. Open App
2. Log In
3. LogOut
 */

import org.testng.annotations.Test;

public class TestCaseFirst {

    @Test(priority = 1)
    void openapp()
    {
        System.out.println("Openning Application");
    }

    @Test(priority = 2)
    void login()
    {
        System.out.println("Log into application");
    }

    @Test(priority = 3)
    void logout()
    {
       System.out.println("Logout from application");
    }
}
