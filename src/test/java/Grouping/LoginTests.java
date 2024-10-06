package Grouping;

import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority = 1, groups = {"sanity"})
    void loginByEmail()
    {
        System.out.println("This is log in by email");
    }

    @Test(priority = 2, groups = {"sanity"})
    void LoginByfacebook()
    {
        System.out.println("This is log in by fb");
    }
    @Test(priority = 3, groups = {"sanity"})
    void loginByTwitter()
    {
        System.out.println("This is log in by twitter");
    }
}
