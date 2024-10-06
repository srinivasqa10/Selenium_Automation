package TestNGFiles;

/*
1. Open Application
2. Test logo presence
3. LogIn
4. Close
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMTest {
    WebDriver driver;
    @Test(priority = 1)
    void openApp()
    {
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    void testlogo() throws InterruptedException {
        Thread.sleep(10000);
        boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("Logo is Displayed" +logo);
    }

    @Test(priority = 3)
    void testLogin()
    {
        driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        System.out.println("Logged In");
    }

    @Test(priority = 4)
    void testLogOut()
    {
         driver.close();
    }
}
