package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;


public class TestngListeners {

    WebDriver driver;
    @BeforeClass
    void setup() throws InterruptedException {

        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test(priority = 1)
    void testlogo()
    {
        boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(logo, true);
    }

    @Test(priority = 3, dependsOnMethods = {"testURL"})
    void testTitle()
    {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @Test(priority = 2)
    void testURL()
    {
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com");
    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
