package Grouping;

import org.testng.annotations.Test;

public class SignUpTests {

    @Test(priority = 1, groups = {"regression"})
    void signupbyEmail()
    {
        System.out.println("This is sign up by email");
    }

    @Test(priority = 2, groups = {"regression"})
    void signupbyFB()
    {
        System.out.println("This is sign up by fb");
    }

    @Test(priority = 1, groups = {"regression"})
    void signupbyTwitter()
    {
        System.out.println("This is sign up by twitter");
    }
}
