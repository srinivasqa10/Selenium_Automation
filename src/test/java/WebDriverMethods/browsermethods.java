package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsermethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[@class='orangehrm-copyright-wrapper']//a")).click();
        Thread.sleep(5000);
        //close()
        //driver.close();

        //quit()
        driver.quit();
    }
}
