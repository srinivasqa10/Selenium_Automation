package WaitCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitwait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); //Declaration

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        txtusername.sendKeys("Admin");

        WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        txtpassword.sendKeys("admin123");

        WebElement loginbtn = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginbtn.click();
    }
}
