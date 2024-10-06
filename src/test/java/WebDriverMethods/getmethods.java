package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class getmethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        //getTitle()
        System.out.println(driver.getTitle());

        //getCurrentTitle()
        System.out.println(driver.getCurrentUrl());

        //getPageSource()
        //System.out.println(driver.getPageSource());

        //getWindowHandle()
        System.out.println(driver.getWindowHandle());
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[@class='orangehrm-copyright-wrapper']//a")).click();

        //getWindowHandles()
        Set<String> windowids = driver.getWindowHandles();
        System.out.println(windowids);
    }
}
