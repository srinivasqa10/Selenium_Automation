package WaitCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class fluentwait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //fluentWait


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();



        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    }
}
