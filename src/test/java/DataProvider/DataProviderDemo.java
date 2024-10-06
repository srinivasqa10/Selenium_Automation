package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo {

    WebDriver driver;

    @BeforeClass
    void setup()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test(dataProvider = "dp")
    void testLogin(String email, String pwd)
    {
        driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
        driver.manage().window().maximize();

        //Login Details
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        boolean logo = driver.findElement(By.xpath("//p[normalize-space()='My Actions']")).isDisplayed();
        if (logo == true)
        {
            driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
            Assert.assertTrue(true);
        }
        else
        {
            Assert.fail();
        }



    }

    @AfterClass
    void tearDown()
    {

        driver.close();

    }

    @DataProvider(name ="dp", indices = {0,1,2})
    Object[][] loginData()  //We are keeping Object becuase it can save any kind of data
    {
        Object data[][] ={
                {"abs@gmail.com", "test123"},
                {"abc@gmail.com", "test123"},
                {"john@gmail.com", "test123"},
                {"Admin", "admin123"},

                         };

        return data;
    }

}
