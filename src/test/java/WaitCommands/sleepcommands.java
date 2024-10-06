package WaitCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class sleepcommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

         //ImplicitWait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        //Thread.sleep
        //Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");




    }
}
